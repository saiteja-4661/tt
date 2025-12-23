package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class  index{ 
    @GetMapping("/"){
        String m1(){
            return "Hello";
        }
    }
}