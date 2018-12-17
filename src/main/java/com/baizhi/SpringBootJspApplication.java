package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.baizhi.mapper")
public class SpringBootJspApplication {


    public static void main(String[] args) {
        //调用API
        //第一个参数为当前类的类对象，第二个参数为 main函数的参数，启动相关的参数
        SpringApplication.run(SpringBootJspApplication.class,args);
    }
}
