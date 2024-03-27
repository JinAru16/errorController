package com.exception.handler.main.controller;

import com.exception.handler.main.domain.Entity.Member;
import com.exception.handler.main.domain.request.MemberEdit;
import com.exception.handler.main.domain.request.MemberRequest;
import com.exception.handler.main.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/main")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/member/{id}")
    public ResponseEntity findMember(@PathVariable("id") Long id){
        Member member = memberService.findMember(id);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @PostMapping("/member/add")
    public ResponseEntity addMember(@RequestBody MemberRequest memberRequest){
        Member member = memberService.addMember(memberRequest);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }
    @PatchMapping("/member/patch/{id}")
    public ResponseEntity editMember(@PathVariable("id") Long id, @RequestBody MemberEdit memberEdit){
        memberService.updateMember(id, memberEdit);
        Member member = memberService.findMember(id);

        return new ResponseEntity<>(member, HttpStatus.OK);

    }

    @DeleteMapping("/member/delete/{id}")
    public ResponseEntity<?> deleteMember(@PathVariable("id")Long id){
         memberService.deleteMember(id);
         return ResponseEntity.ok().body("");
    }

}
