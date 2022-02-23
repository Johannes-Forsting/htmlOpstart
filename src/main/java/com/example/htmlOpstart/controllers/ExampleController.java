package com.example.htmlOpstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/følg-udviklingen")
    public String udvikling(){
        return "articleFishFinger";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
