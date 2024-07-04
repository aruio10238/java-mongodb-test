package com.aruio.mongodb.config;

import com.sun.istack.internal.logging.Logger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Date 2024/7/4 14:20
 * @Created by 10574
 */
@Configuration
@ConfigurationProperties(prefix = "mongodb")
@Data
public class MongodbConfig {
    private String uri;
    private String database;
    private String collection;
}
