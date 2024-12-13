package com.backend.controller;

import com.backend.domain.MongoUser;
import com.backend.repository.MongoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MongoController {

    @Autowired
    private MongoUserRepository mongoUserRepository;

    @GetMapping("/api/mongo")
    public String getMongoData() {
        // MongoDB에서 첫 번째 사용자 가져오기
        MongoUser user = mongoUserRepository.findAll().stream().findFirst().orElse(null);

        if (user != null) {
            return "MongoDB User~~~~~~~: " + user.getName();
        } else {
            return "No users found in MongoDB!";

        }
    }
}
