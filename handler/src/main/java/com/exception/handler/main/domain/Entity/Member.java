package com.exception.handler.main.domain.Entity;

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


    public Member(MemberRequest memberRequest){
        this.userId = memberRequest.getUserId();
        this.userNickName = memberRequest.getUserNickName();
    }
}
