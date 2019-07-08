package com.demo.helloclient.controller;

import com.demo.helloclient.tars.hello.HelloPrx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.acl.Owner;

/**
 * @Auther: yaya
 * @Date: 2019/7/8 17:45
 * @Description:
 */
@RequestMapping("/hello")
@RestController
public class HelloController {
    @Autowired
    private HelloPrx helloPrx;

    @GetMapping
    public String hello() {
        return helloPrx.hello();
    }
}
