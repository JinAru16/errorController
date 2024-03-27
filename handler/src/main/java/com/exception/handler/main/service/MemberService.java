package com.exception.handler.main.service;

import com.exception.handler.error_handler.domain.dto.MemberNotFound;
import com.exception.handler.main.domain.Entity.Member;
import com.exception.handler.main.domain.request.MemberEdit;
import com.exception.handler.main.domain.request.MemberRequest;
import com.exception.handler.main.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public Member addMember(MemberRequest memberRequest) {
        Member member = new Member(memberRequest);
        return memberRepository.save(member);
    }

    public void updateMember(Long id, MemberEdit memberEdit) {
        Member member = memberRepository.findById(id).orElseThrow(MemberNotFound::new);
        member.memberEditor(memberEdit);
    }

    public Member findMember(Long id) {
        return memberRepository.findById(id).orElseThrow(MemberNotFound::new);
    }

    public void deleteMember(Long id) {
         memberRepository.deleteById(id);
    }
}
