package com.hometalk.onepass.notice.entity;

/*
    공지사항 분류 배지
 */
public enum Badge {

    IMPORTANT("중요"),
    FACILITY("시설"),
    SAFETY("안전"),
    NORMAL("일반");

    private final String label;

    Badge(String label) {   // label = 파라미터 (중요, 시설 등)
        this.label=label;   // private final String label의 label = 파라미터 label
        // this.label = 클래스 변수, label = 파라미터
    }

    public String getLabel(){   // label 값 꺼내기
        return label;   // label에 저장된 파라미터 label 반환 ex) Badge.IMPORTANT.getLabel() → "중요"
    }
}