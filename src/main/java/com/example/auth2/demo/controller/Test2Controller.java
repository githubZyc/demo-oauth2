package com.example.auth2.demo.controller;

/**
 * 功能描述: 测试2
 * @Author ZYC
 * @Date 2020/6/20 10:31 下午
 * @Version 1.0
 **/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller {
    /**
     * 功能描述:
     * @Author ZYC
     * @Date 2020/6/20 10:25 下午
     * @Param []
     * @Return java.lang.String
     * @Version 1.0
     **/
    @RequestMapping("/test2")
    public String getString(){
        return "hello mac auth2-test2 demo";
    }
}
