package com.backend.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mongo_users")
@Getter
@Setter
public class MongoUser {
    @Id
    private String id; // MongoDB의 기본 _id 필드와 매핑됩니다.

    private String name;

    // getters and setters
}
