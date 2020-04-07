package com.inok.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
 
    // 1. 화면에 helloworld 출력
    @GetMapping(value="/helloworld/string")
    public String helloworldString() {
        return "helloworld";
    }

    // 2. 화면에 {message:"helloworld"} 출력
    @GetMapping(value="/helloworld/json")
    @ResponseBody
    public Hello helloworldJson() {
        Hello hello = new Hello();
        hello.message = "helloworld";
        return hello;
    }

    // 3. 화면에 helloworld.ftl 출력
    @GetMapping(value="/helloworld/page")
    public String helloworld() {
        return "helloworld";
    }

    public static class Hello {
        private String message;
    }
    
    

}