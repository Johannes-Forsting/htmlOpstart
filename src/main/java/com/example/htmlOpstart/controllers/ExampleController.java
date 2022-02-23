package com.example.htmlOpstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("/test")
    public String test(){
        return "index";
    }

    @GetMapping("/error")
    public String error(){
        return "error";
    }
}
