package com.backend.domain;

import org.springframework.data.redis.core.RedisHash;
import lombok.Getter;
import lombok.Setter;

@RedisHash("RedisUser")  // Redis에서 저장될 해시의 이름을 지정
@Getter
@Setter
public class RedisUser {
    private String id;
    private String name;

    // 기본 생성자, getter, setter (Lombok 사용)
    public RedisUser(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
