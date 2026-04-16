package com.hometalk.onepass.notice.dto;

/*
    공지 상세 페이지에서 사용하는 응답 DTO
    서버 → 화면으로 데이터를 전달할 때 사용
    Notice 엔티티에서 화면에 필요한 것만 사용
 */

import com.hometalk.onepass.notice.entity.Badge;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor    // 파라미터 없는 기본 생성자 자동 생성
@AllArgsConstructor   // 모든 필드를 파라미터로 받는 생성자 자동 생성
@ToString             // 객체를 문자열로 출력
public class NoticeDetailResponseDto {

        private Long id;
        private String title;                   // 공지 제목
        private String content;                 // 공지 내용
        private int viewCount;                  // 조회수
        private Badge badge;                    // 배지
        private Boolean isPinned;               // 상단 고정 여부 (true = 고정, false = 미고정)
        private LocalDateTime createdAt;        // 작성일시
        private LocalDateTime updatedAt;        // 수정일시


}
