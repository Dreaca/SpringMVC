package org.example.springmvc.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("map")
public class Maping {
//    @GetMapping("hello?")
//    @GetMapping("hello/*")
    @GetMapping("hello/**")
    public String helloMapping(){
        return "Hello World";
    }
    @PostMapping("/{name}/{value}")
    public String postMapping(@PathVariable("name") String name, @PathVariable("value") double value){
        return "Hello World by Post Mapping." + name+ " . "+value;
    }
    @PostMapping("/{id:\\d{4}}") //regex mapping 
    public String idMapping(@PathVariable("id")int id){
        return "Hello World by Id Mapping."+id;
    }
    @PostMapping(params = {"name","age"})//Request parameter mapping
    public String paramMapping(@RequestParam("name") String name, @RequestParam("age") int age){
        return "Hello World by Param Mapping. Name is :"+name+" Age is :"+age;
    }
    @PostMapping(headers = {"X-item","Content-Type"})
    public String headerMapping(@RequestHeader("X-item")String item, @RequestHeader("Content-Type")String type){
        return "Hello World by Header Mapping. Item is :"+item+" Type is :"+type;
    }
}
