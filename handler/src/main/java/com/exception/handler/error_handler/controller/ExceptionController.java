package com.exception.handler.error_handler.controller;

import com.exception.handler.error_handler.domain.dto.MemberNotFound;
import com.exception.handler.error_handler.domain.response.ErrorResponse;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLException;

@ControllerAdvice("com.exception.handler.main")
public class ExceptionController {

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse invalidRequestHandler(MethodArgumentNotValidException e){
        ErrorResponse response = ErrorResponse.builder()
                .code("400")
                .message("잘못된 요청입니다.")
                .build();

        for(FieldError fieldError : e.getFieldErrors()){
            response.addValidation(fieldError.getField(), fieldError.getDefaultMessage());
        }

        return response;
    }

    @ResponseBody
    @ExceptionHandler(MemberNotFound.class)
    public ResponseEntity<ErrorResponse> memberNotFount(MemberNotFound e){
      int statusCode = e.getStatusCode();
       ErrorResponse body = ErrorResponse.builder()
               .code(String.valueOf(statusCode))
               .message(e.getMessage())
               .validation(e.getValidation())
               .build();

        return ResponseEntity.status(statusCode)
                        .body(body);
    }

}
