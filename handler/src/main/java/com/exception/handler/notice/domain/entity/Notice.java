package com.exception.handler.notice.domain.entity;

import com.exception.handler.notice.domain.request.NoticeCreate;
import com.exception.handler.notice.domain.request.NoticeEdit;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String title;
    private String content;

    public void NoticeUpdate(NoticeEdit noticeEdit){
        this.title = noticeEdit.getTitle();
        this.content = noticeEdit.getContent();
    }

    public Notice(NoticeCreate noticeCreate) {
        this.userId = noticeCreate.getUserId();
        this.title = noticeCreate.getTitle();
        this.content = noticeCreate.getContent();
    }
}
