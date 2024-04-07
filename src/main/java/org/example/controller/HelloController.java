package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("helloWorld")
    public String getHello(){
        return "Hello world";
    }
    @GetMapping("hello")
    public String getHello(@RequestParam(defaultValue = "world") String name){
        return "Hello " + name;
    }

}
