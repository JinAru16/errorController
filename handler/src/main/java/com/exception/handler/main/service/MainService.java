package com.exception.handler.main.service;

import com.exception.handler.main.domain.Entity.Member;
import com.exception.handler.main.domain.request.MemberRequest;
import com.exception.handler.main.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {
    private final MemberRepository memberRepository;
    public Member addMember(MemberRequest memberRequest) {
        Member member = new Member(memberRequest);
        return memberRepository.save(member);
    }
}
