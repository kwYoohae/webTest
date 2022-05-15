package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() throws InterruptedException {
        for(int i = 0; i < 15; i++){
            Thread.sleep(1000);
            System.out.println((i+1) + "초입니다.");
        }
        return "index.html";
    }

    @GetMapping("/")
    public String index(){
        return "home.html";
    }
}
