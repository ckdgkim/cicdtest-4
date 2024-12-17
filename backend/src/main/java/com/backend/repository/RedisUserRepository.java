package com.backend.repository;

import com.backend.domain.RedisUser;
import org.springframework.data.repository.CrudRepository;

public interface RedisUserRepository extends CrudRepository<RedisUser, String> {
    // Redis에서 데이터를 저장하고 조회할 메서드 작성 가능
}
