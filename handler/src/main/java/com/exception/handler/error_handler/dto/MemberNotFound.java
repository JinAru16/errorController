package com.exception.handler.error_handler.dto;


public class MemberNotFound extends ExceptionFactory{

    private static final String MESSAGE = "존재하지 않는 회원입니다.";

    public MemberNotFound() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return 404;
    }
}
