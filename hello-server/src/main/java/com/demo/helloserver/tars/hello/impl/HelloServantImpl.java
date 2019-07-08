package com.demo.helloserver.tars.hello.impl;

import com.demo.helloserver.tars.hello.HelloServant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @Auther: yaya
 * @Date: 2019/7/8 17:30
 * @Description:
 */
public class HelloServantImpl implements HelloServant {
    private static final Logger log = LoggerFactory.getLogger(HelloServantImpl.class);


    @Value("${vcap.application.uris[0]:unknown}")
    private String hostname;

    @Bean
    @ConfigurationProperties(prefix = "hello")
    HelloProperties helloProperties() {
        return new HelloProperties();
    }

    @Override
    public String hello() {
        log.debug("responding with {}", helloProperties().getMessage());
        return "Message from " + hostname + " : " + helloProperties().getMessage();
    }


    public static class HelloProperties {
        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

}
