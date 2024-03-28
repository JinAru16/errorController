package com.exception.handler.member.domain.request;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberEdit {
    private String userId;
    private String userNickName;

    @Builder
    public MemberEdit(String userId, String userNickName){
        this.userId = userId;
        this.userNickName = userNickName;
    }
}
