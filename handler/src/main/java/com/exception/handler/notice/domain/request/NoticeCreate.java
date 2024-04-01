package com.exception.handler.notice.domain.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class NoticeCreate {

    @NotBlank(message = "사용자를 입력해주세요.")
    private String userId;
    @NotBlank(message = "타이틀을 입력하세요.")
    private String title;
    @NotBlank(message = "콘텐츠를 입력해주세요.")
    private String content;
}
