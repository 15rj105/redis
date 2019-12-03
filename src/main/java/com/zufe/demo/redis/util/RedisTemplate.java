package com.zufe.demo.redis.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.redis.connection.RedisConnection;

@Getter
@Setter
public class RedisTemplate extends org.springframework.data.redis.core.RedisTemplate {
    public static ThreadLocal<Integer> indexdb = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    protected RedisConnection preProcessConnection(RedisConnection connection, boolean existingConnection) {
        try {
//            Integ
        } finally {

        }
        return super.preProcessConnection(connection, existingConnection);
    }
}
