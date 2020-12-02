package cn.bdqn.springboot_day1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

    @RequestMapping("/hello")
    public  String hello(){

        return "hello , StringBoot";
    }
}
