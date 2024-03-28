package com.exception.handler.notice.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoticeCreate {
    private String userId;
    private String title;
    private String content;
}
