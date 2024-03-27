package com.exception.handler.main.domain.Entity;

import com.exception.handler.main.domain.request.MemberEdit;
import com.exception.handler.main.domain.request.MemberRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String userNickName;

    public void memberEditor(MemberEdit memberEdit){
        this.userId = memberEdit.getUserId();
        this.userNickName = memberEdit.getUserNickName();
    }

    public Member(MemberRequest memberRequest){
        this.userId = memberRequest.getUserId();
        this.userNickName = memberRequest.getUserNickName();
    }

    public Member(Long id, MemberRequest memberRequest){
        this.id = id;
        this.userId = memberRequest.getUserId();
        this.userNickName = memberRequest.getUserNickName();
    }
}
