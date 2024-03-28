package com.exception.handler.notice.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NoticeEdit {
    private String title;
    private String content;

}
