package com.dz;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "dz.redisson")
public class RedissonProperties {
    private String host= "localhost";
    private String password;
    private int port= 6379;
    private int timeout;
    private boolean ssl;

    public String getHost() {
        return host;
    }

    public String getPassword() {
        return password;
    }

    public int getPort() {
        return port;
    }

    public int getTimeout() {
        return timeout;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }
}
