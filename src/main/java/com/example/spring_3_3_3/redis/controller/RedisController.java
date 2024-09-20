package com.example.spring_3_3_3.redis.controller;

import com.example.spring_3_3_3.redis.service.RedisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class RedisController {

    public RedisService redisService;

    public RedisController(RedisService redisService) {
        this.redisService = redisService;
    }

    @GetMapping("/redis/sample1")
    public void sample1() throws MalformedURLException {
        String userId = "test1";
        URL url = new URL("http://localhost:8081");
        redisService.sample1(userId, url);
    }

    @GetMapping("/redis/sample2")
    public void sample2() throws MalformedURLException {
        String userId = "test2";
        URL url = new URL("http://localhost:8082");
        redisService.sample2(userId, url);
    }

    @GetMapping("/redis/sample3")
    public void sample3() throws MalformedURLException {
        String userId = "test3";
        URL url = new URL("http://localhost:8083");
        redisService.sample3(userId, url);
    }
}
