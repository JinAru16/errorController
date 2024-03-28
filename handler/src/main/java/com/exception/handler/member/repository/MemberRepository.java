package com.exception.handler.member.repository;

import com.exception.handler.member.domain.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Long> {

}
