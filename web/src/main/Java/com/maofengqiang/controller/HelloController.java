package com.maofengqiang.controller;

import com.maofengqiang.dubboApi.UserService;
import com.maofengqiang.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("helloWorld")
    @ResponseBody
    public String helloWorldPage(HttpServletRequest request, HttpServletResponse response){
        //String result = baseService.sayHello("第一个Dobbo项目");
        String result =userService.sayHi("the first dubbo project");
        return result;
    }
}
