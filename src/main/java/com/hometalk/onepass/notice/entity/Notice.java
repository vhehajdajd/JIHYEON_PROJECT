package com.hometalk.onepass.notice.entity;

import com.hometalk.onepass.auth.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)  // 공지(N):유저(1) 유저 한 명이 여러 공지 작성 가능 = 공지는 유저 하나를 참조함,
                                        // FetchType.LAZY: 연관 데이터를 실제 사용할 때만 쿼리 실행 (성능 ↑)
    @JoinColumn(name="user_id")         // DB에서 연결할 컬럼 지정
    private User user;
    // 이 엔티티는 user_id라는 이름으로 User랑 연결돼 있고, 필요할 때만 DB에 있는 User 테이블 데이터를 가져옴

    @Column(nullable = false, length = 100)  //이 컬럼엔 null을 넣으면 안 됨, 컬럼 길이 제약 (기본값: 255)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")    // DB에서 이 컬럼을 text 타입으로 만듦
    private String content;

    private Boolean isPinned;

    private int viewCount;

    @Enumerated(EnumType.STRING)    // Badge enum 값을 문자열 저장 (이게 없다면 숫자로 저장됨)
    @Column(name = "badge", columnDefinition = "VARCHAR(20)")
    private Badge badge;





}