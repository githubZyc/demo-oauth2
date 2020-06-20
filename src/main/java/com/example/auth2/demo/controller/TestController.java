package com.example.auth2.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * 功能描述:
     * @Author ZYC
     * @Date 2020/6/20 10:25 下午
     * @Param []
     * @Return java.lang.String
     * @Version 1.0
     **/
    @RequestMapping("/test")
    public String getString(){
        return "hello mac auth2 demo";
    }
}
