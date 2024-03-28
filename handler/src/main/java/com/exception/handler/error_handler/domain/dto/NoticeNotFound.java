package com.exception.handler.error_handler.domain.dto;

public class NoticeNotFound extends ExceptionFactory{
    private static final String MESSAGE = "존재하지 않는 게시글입니다..";
    public NoticeNotFound() {
        super(MESSAGE);
    }
    public NoticeNotFound(String fieldName, String message){
        super(MESSAGE);
        addValidation(fieldName, message);
    }
    @Override
    public int getStatusCode() {
        return 404;
    }
}
