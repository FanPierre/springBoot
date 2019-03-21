package com.example.spring.configuaration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.session.SessionProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;


//重新定义redis默认配置
public class redisTempleteTest {

    public RedisTemplate myRedisTemplate(RedisConnectionFactory redisConnectionFactory) {


        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<Object, Object>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        //修改序列化方式
        redisTemplate.setDefaultSerializer(new GenericJackson2JsonRedisSerializer());
        //修改事务
        redisTemplate.setEnableTransactionSupport(true);

        return redisTemplate;
    }


}
