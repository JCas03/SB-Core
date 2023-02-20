package com.code.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/api")
public class HelloController {
    @RequestMapping("/hello")
    public String display()
    {
        return "index";
    }
}