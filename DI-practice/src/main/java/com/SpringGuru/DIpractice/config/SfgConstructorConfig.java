package com.SpringGuru.DIpractice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties( prefix = "mydb")
@ConfigurationPropertiesBinding
public class SfgConstructorConfig {

    private final String user;
    private final String password;
    private final String url;

    public SfgConstructorConfig(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
}
