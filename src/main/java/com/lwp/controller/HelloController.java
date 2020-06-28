package com.lwp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //员工2又想整个活
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
    //修改了一句话
   //多整了一句话

    //员工1想说一句话

    //员工1又想说话
}
