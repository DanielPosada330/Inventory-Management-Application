package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class AboutPageController {

    @GetMapping("/showAboutPage")
    public String showAboutPage(){
        return "about";

    }

}
