package com.example.spring_3_3_3.redis;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

public class RedisApplication {
    private static final Log LOG = LogFactory.getLog(RedisApplication.class);

    public static void main(String[] args) {

        LettuceConnectionFactory connectionFactory = new LettuceConnectionFactory("localhost", 16379);
        connectionFactory.afterPropertiesSet();

        RedisTemplate<String, String> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        template.setDefaultSerializer(StringRedisSerializer.UTF_8);
        template.afterPropertiesSet();

        template.opsForValue().set("foo", "bar");

        LOG.info("Value at foo:" + template.opsForValue().get("foo"));

        connectionFactory.destroy();
    }
}
