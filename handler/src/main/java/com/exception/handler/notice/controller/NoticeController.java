package com.exception.handler.notice.controller;

import com.exception.handler.notice.domain.entity.Notice;
import com.exception.handler.notice.domain.request.NoticeCreate;
import com.exception.handler.notice.domain.request.NoticeEdit;
import com.exception.handler.notice.service.NoticeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/main")
public class NoticeController {
    private final NoticeService noticeService;

    @GetMapping("/notice/{id}")
    public ResponseEntity<?> oneNotice(@PathVariable("id") Long id){
        Notice oneNotice = noticeService.getOneNotice(id);
        return ResponseEntity.ok().body(oneNotice);
    }
    @PostMapping("/notice/add")
    public ResponseEntity<?> addNotice(@RequestBody @Valid NoticeCreate noticeCreate){
        Notice notice = noticeService.addNotice(noticeCreate);
        return ResponseEntity.ok().body(notice);
    }
    @PatchMapping("/notice/edit/{id}")
    public ResponseEntity<?> editNotice(@PathVariable("id") Long id, NoticeEdit noticeEdit){
        Notice oneNotice = noticeService.getOneNotice(id);
        oneNotice.NoticeUpdate(noticeEdit);
        
        return ResponseEntity.ok().body("");
    }
    @DeleteMapping("/notice/delete{id}")
    public ResponseEntity<?> deleteNotice(@PathVariable("id") Long id){
        noticeService.deleteNotice(id);

        return ResponseEntity.ok().body("");
    }

}
