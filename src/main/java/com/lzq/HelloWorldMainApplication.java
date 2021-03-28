package com.lzq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: HelloWorldMainApplication
 * @Author: 中都
 * @Date: 2021/3/28 12:00
 * @Description: 主程序   @SpringBootApplication用来标注一个主程序，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        //Spring Boot应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
