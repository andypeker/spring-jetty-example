package com.fernandospr.example.config;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.net.UnknownHostException;

@Configuration
@ComponentScan(basePackages = "com.fernandospr.example")
public class AppConfig {
    
    
    /*public @Bean
    Mongo mongo() throws UnknownHostException {
        return new Mongo("192.168.19.150");
    }*/
    
    /*public @Bean
    MongoFactoryBean mongo() {
        MongoFactoryBean mongo = new MongoFactoryBean();
        mongo.setHost( "localhost" );
        return mongo;
    }*/
    
    /*public @Bean
    MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory( new Mongo(), "database" );
    }*/
    
}