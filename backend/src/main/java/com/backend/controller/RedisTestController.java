package com.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/redis")
public class RedisTestController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/set")
    public String setValue(@RequestParam String key, @RequestParam String value) {
        redisTemplate.opsForValue().set(key, value);
        return "Value set successfully!";
    }

    @GetMapping("/get")
    public String getValue(@RequestParam String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
