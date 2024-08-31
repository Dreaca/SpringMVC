package org.example.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class Demo {
    @GetMapping
    public String healthTest(){
        return "Health Test";
    }
    @PostMapping
    public String healthTestPost(){
        return "Health TestPost";
    }
    @GetMapping("otherGet")
    public String healthTestGet(){
        return "Health TestGet";
    }
}
