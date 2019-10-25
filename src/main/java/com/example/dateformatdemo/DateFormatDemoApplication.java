package com.example.dateformatdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class DateFormatDemoApplication {

    @RequestMapping("/")
    public Person hi(@RequestBody Person person) {

        return person;
    }

    public static void main(String[] args) {
        SpringApplication.run(DateFormatDemoApplication.class, args);
    }

}
