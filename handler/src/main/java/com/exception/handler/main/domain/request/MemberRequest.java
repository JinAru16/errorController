package com.exception.handler.main.domain.request;

import lombok.Getter;

@Getter
public class MemberRequest {
    private String userId;
    private String userNickName;

    public MemberRequest(String userId, String userNickName) {
        this.userId = userId;
        this.userNickName = userNickName;
    }
}
