package com.demo.helloclient.tars;

import com.demo.helloclient.tars.hello.HelloPrx;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: yaya
 * @Date: 2019/7/8 17:43
 * @Description:
 */
@Configuration
public class TarsProxy {
    @Bean("HelloPrx")
    public HelloPrx getHelloPrx(){
        CommunicatorConfig cfg = new CommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        HelloPrx proxy = communicator.stringToProxy(HelloPrx.class, "HelloApp.HelloServer.HelloObj@tcp -h 172.16.196.131 -p 18600");
        return proxy;
    }
}
