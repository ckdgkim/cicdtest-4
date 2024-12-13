package com.backend.repository;

import com.backend.domain.MongoUser;  // MongoUser의 정확한 경로로 수정
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoUserRepository extends MongoRepository<MongoUser, String> {
    // MongoDB에 대한 쿼리 메서드 작성
}
