package com.example.htmlOpstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("/")
    public String test(){
        return "index";
    }

    @GetMapping("/følg-udviklingen")
    public String error(){
        return "articleFishFinger";
    }
}
