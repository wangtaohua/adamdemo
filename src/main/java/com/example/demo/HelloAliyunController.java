package com.example.demo;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;import java.util.Scanner;@RestControllerpublic class HelloAliyunController {    @RequestMapping("/")    public String helloAliyun(){        return "测试成功！";    }}