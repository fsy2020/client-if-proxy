package com.nsynus.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisUtils {
    @Autowired
    private RedisTemplate redisTemplate;

    //设置token信息到redis中
    public <T> void setCacheObject(final String key, final T value) {
        redisTemplate.opsForValue().set(key, value);
    }
    //根据用户名从redis获取token信息
    public <T> T getCacheObject(final String key) {
        ValueOperations<String, T> operation = redisTemplate.opsForValue();

        return operation.get(key);
    }
    //删除单个对象
    public boolean deleteObject(final String key) {
        return redisTemplate.delete(key);
    }
}
