package com.hometalk.onepass.notice.repository;

import com.hometalk.onepass.notice.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;


/*
    첨부파일 DB 접근 인터페이스
    JpaRepository를 상속받아 기본 CRUD 메서드 자동 제공
 */

public interface AttachmentRepository extends JpaRepository<Attachment,Long> {
                                    // Attachment 엔티티 다룸, 엔티티 pk 타입 = long (Attachment의 id가 Long이라서)
    // JpaRepository 상속만으로 아래 메서드들 자동 제공
    // save()       → 저장
    // findById()   → ID로 조회
    // findAll()    → 전체 조회
    // delete()     → 삭제


}