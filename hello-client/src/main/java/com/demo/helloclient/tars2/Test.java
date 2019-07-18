package com.demo.helloclient.tars2;

import com.demo.helloclient.tars2.hello.HelloPrx;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.common.support.Holder;

import java.security.acl.Owner;

/**
 * @Auther: yaya
 * @Date: 2019/7/17 11:41
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CommunicatorConfig cfg = new CommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
//        OwnerResourcePrx ownerProxy = communicator.stringToProxy(OwnerResourcePrx.class, "PetclinicApp.CustomersServer.OwnersObj@tcp -h 127.0.0.1 -p 18604 -t 60000");
        HelloPrx ownerProxy = communicator.stringToProxy(HelloPrx.class, "PetclinicApp.CustomersServer.Hello2Obj@tcp -h 127.0.0.1 -p 18600");
        Holder<String> test = new Holder<>();
        int i = ownerProxy.hello(test);
        System.out.println(i);
        System.out.println(test.getValue());
    }
}
