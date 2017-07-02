package com.fernandospr.example.config;

import com.mongodb.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class MongoConfig {

    private static final String DB_NAME = "admin";

    public @Bean MongoDbFactory mongoDbFactory() throws Exception {
//        return new SimpleMongoDbFactory(new MongoClient(), DB_NAME);
    
        /***
         * 这里应该配置一个mongoDB的Host和Ip作为参数，可能如下：
         * return new SimpleMongoDbFactory(new MongoClient('192.168.19.150', 12321), 'frankie');
         * **/
/*
        ServerAddress svrAddr = new ServerAddress("192.168.19.150", 27017);
        MongoCredential mongoCred = MongoCredential.createCredential("frankie", DB_NAME, "135317".toCharArray());
        List<MongoCredential> mongoCreds = Arrays.asList(mongoCred);
        MongoClient mongoClt = new MongoClient(svrAddr, mongoCreds);
        return new SimpleMongoDbFactory(mongoClt, DB_NAME);
*/
        
        /******
         * 上下二个连接MongoDB的方式，经过验证都OK
         * ****/
    
        MongoClientOptions.Builder buldr = new MongoClientOptions.Builder().connectionsPerHost(10).connectTimeout(10000).description("frankie coonnect to MongoDB").maxConnectionIdleTime(10000).minHeartbeatFrequency(1000).maxWaitTime(10000).socketTimeout(30000);
        MongoClientURI mongoCURI = new MongoClientURI("mongodb://frankie:135317@192.168.19.150:27017/admin", buldr);
        return new SimpleMongoDbFactory(mongoCURI);
        
    }

    public @Bean MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

}

