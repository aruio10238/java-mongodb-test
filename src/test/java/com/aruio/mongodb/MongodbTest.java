//package com.aruio.mongodb;
//
//import com.aruio.mongodb.config.MongodbConfig;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Objects;
//
///**
// * @Description mongodb sync java驱动测试类
// * @Date 2024/7/4 14:19
// * @Created by 10574
// */
//@SpringBootTest
//public class MongodbTest {
//    @Autowired
//    private MongodbConfig mongodbConfig;
//    private static final Logger log = LoggerFactory.getLogger(MongodbTest.class);
//
//    @Test
//    public void testConnection() {
//        final String uri = mongodbConfig.getUri();
//        try (MongoClient mongoClient = MongoClients.create(uri)) {
//            final MongoDatabase mongoDatabase = mongoClient.getDatabase(mongodbConfig.getDatabase());
//            final MongoCollection<Document> collection = mongoDatabase.getCollection(mongodbConfig.getCollection());
//            final Document firstDocument = collection.find().first();
//            if (Objects.nonNull(firstDocument)) {
//                log.info("first document:{}", firstDocument.toJson());
//            } else {
//                log.error("document is null");
//            }
//        }
//    }
//}
