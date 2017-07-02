package com.fernandospr.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * Created by franklin on 7/2/2017.
 */

@Component
//@Configuration
//@ConfigurationProperties()
@PropertySources({@PropertySource("classpath:mongodb.properties")})
public class MongoInfo {
    
    @Value("${spring.data.mongodb.host}")
    private String host;
    
    @Value("${spring.data.mongodb.port}")
    private int port;
    
    @Value("${spring.data.mongodb.database}")
    private String database;
    
    @Value("${spring.data.mongodb.username}")
    private String username;
    
    @Value("${spring.data.mongodb.password}")
    private String password;
    
    @Value("${spring.data.mongodb.authenticationDatabase}")
    private String authenticationDatabase;
    
    /*public void setHost(String host){
        this.host = host;
    }
    public String getHost(){
        return this.host;
    }
    public void setPort(int port){
        this.port = port;
    }
    public int getPort(){
        return this.port;
    }
    
    public void setDatabase(String database){
        this.database = database;
    }
    public String getDatabase(){
        return this.database;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
    
    public void setAuthenticationDatabase(String authenticationDatabase){
        this.authenticationDatabase = authenticationDatabase;
    }
    public String getAuthenticationDatabase(){
        return this.authenticationDatabase;
    }*/
    
    public String outputInfo(){
        return  "\t" + this.host +
                "\t" + this.port +
                "\t" + this.username +
                "\t" + this.password +
                "\t" + this.database +
                "\t" + this.authenticationDatabase;
    }
    
}
