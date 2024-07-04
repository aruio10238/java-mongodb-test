package com.aruio.mongodb.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Description TODO
 * @Date 2024/7/4 16:14
 * @Created by 10574
 */
@Data
@Document("component")
public class Component {
    private Integer id;
    private String projectName;
    private String name;
    private String identifier;
    private String classify;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;
}
