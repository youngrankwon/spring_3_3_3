package com.example.spring_3_3_3.redis.service;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.net.URL;

@Service
public class RedisService {

    @Resource(name="redisTemplate")
    private ListOperations<String, String> listOps;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void sample1(String userId, URL url) {
        stringRedisTemplate.opsForList().leftPush(userId, url.toExternalForm());
    }

    public void sample2(String userId, URL url) {
        listOps.leftPush(userId, url.toExternalForm());
    }

    public void sample3(String userId, URL url) {
        redisTemplate.opsForHash().put(userId, userId, url.toExternalForm());
    }


}
