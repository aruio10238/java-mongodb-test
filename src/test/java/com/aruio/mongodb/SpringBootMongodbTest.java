package com.aruio.mongodb;

import com.aruio.mongodb.domain.Component;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Date;

/**
 * @Description TODO
 * @Date 2024/7/4 16:02
 * @Created by 10574
 */
@SpringBootTest
public class SpringBootMongodbTest {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Test
    public void testSpringbootMongodb() {
        final Component component = new Component();
        component.setId(1);
        component.setProjectName("dazu-arm");
        component.setName("大族机械臂");
        component.setClassify("设备数采与控制交互组件");
        component.setCreateUser("zhanyurui");
        component.setCreateTime(new Date());
        mongoTemplate.insert(component);
    }
}
