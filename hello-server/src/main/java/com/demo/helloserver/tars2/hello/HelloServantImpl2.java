package com.demo.helloserver.tars2.hello;

import com.qq.tars.common.support.Holder;
import com.qq.tars.spring.annotation.TarsServant;

/**
 * @Auther: yaya
 * @Date: 2019/7/17 11:34
 * @Description:
 */
@TarsServant("Hello2Obj")
public class HelloServantImpl2 implements HelloServant{
    @Override
    public int hello(Holder<String> hello) {
        hello.setValue("test out !!!!!");
        return 200;
    }
}
