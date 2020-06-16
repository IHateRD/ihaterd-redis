package com.example.demoredis;

import com.example.demoredis.entity.UserInfo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoRedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {

        UserInfo userInfo=new UserInfo(1,"zhangsan","man");
        ValueOperations<String,UserInfo> operations=redisTemplate.opsForValue();
        operations.set("user",userInfo);
        boolean exist=redisTemplate.hasKey("user");
        System.out.println(exist);

        UserInfo info=(UserInfo)operations.get("user");
        System.out.println(info.toString());

    }

}
