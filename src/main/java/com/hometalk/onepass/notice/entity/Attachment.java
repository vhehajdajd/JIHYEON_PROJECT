package com.hometalk.onepass.notice.entity;


import com.hometalk.onepass.common.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Attachment extends BaseTimeEntity {    // 상속하고 있기 때문에 createdAt과 updatedAt은 작성할 필요 없음

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // DB가 자동으로 ID 숫자를 1씩 올림
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) // 첨부파일(N) : 공지 (1)
    @JoinColumn(name = "notice_id")
    private Notice notice;       // 어느 공지에 출력될 첨부파일인지

    private String fileName;    // 원본 파일 이름

    private String filePath;    // 서버에 저장된 파일 경로

    private long fileSize;      // 파일 크기 (byte 단위)

}