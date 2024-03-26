package com.exception.handler.main.repository;

import com.exception.handler.main.domain.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MemberRepository extends JpaRepository<Member, Long> {
    
}
