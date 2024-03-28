package com.exception.handler.notice.service;

import com.exception.handler.error_handler.domain.dto.NoticeNotFound;
import com.exception.handler.notice.domain.entity.Notice;
import com.exception.handler.notice.domain.request.NoticeCreate;
import com.exception.handler.notice.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public Notice addNotice(NoticeCreate noticeCreate) {
        Notice notice = new Notice(noticeCreate);
        return noticeRepository.save(notice);
    }

    public Notice getOneNotice(Long id) {
        return noticeRepository.findById(id).orElseThrow(NoticeNotFound::new);
    }

    public void deleteNotice(Long id) {
        noticeRepository.deleteById(id);
    }
}
