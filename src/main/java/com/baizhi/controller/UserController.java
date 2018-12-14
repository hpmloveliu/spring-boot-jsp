package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("usertest")
@Log4j
public class UserController {
    //注入UserMapper
    @Autowired
    UserMapper userMapper;

    @RequestMapping("test")
    public String test(){
        return "index";
    }

    @RequestMapping("queryUserAll")
    //@ResponseBody
    public List<User> queryUserAll(){
       //FastJson 和 JackSon 在结果返回到页面时才起作用

        log.info("我是info日志，你好啊");//自定义日志信息，info普通信息
        log.debug("");
        log.error("错误");//错误信息
        log.warn("我是警告");//敬告信息
        List<User> list = userMapper.selectAll();

        return list;
    }

}
