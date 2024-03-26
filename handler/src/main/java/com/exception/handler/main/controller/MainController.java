package com.exception.handler.main.controller;

import com.exception.handler.main.domain.Entity.Member;
import com.exception.handler.main.domain.request.MemberRequest;
import com.exception.handler.main.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/main")
public class MainController {
    private final MainService mainService;

    @GetMapping("/basic")
    public String basicInform(){
        return "basic";
    }
    @PostMapping("/basic/add")
    public ResponseEntity addBasic(@RequestBody MemberRequest memberRequest){
        Member member = mainService.addMember(memberRequest);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

}
