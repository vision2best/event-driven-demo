package com.example.eventdrivendemo;

import com.example.eventdrivendemo.api.ApiStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@RestController
public class EventDrivenDemoApplication {
    @Autowired
    ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(EventDrivenDemoApplication.class, args);
    }

    @Resource
    private ApiStudent apiStudent;

    @GetMapping("/custom-autoconfig")
    @ResponseBody
    public String autoConfig() {
        return apiStudent.getName();
    }

}
