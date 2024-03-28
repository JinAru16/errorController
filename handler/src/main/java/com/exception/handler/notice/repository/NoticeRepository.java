package com.exception.handler.notice.repository;

import com.exception.handler.notice.domain.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
