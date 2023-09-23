package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class AboutPageController {

    @GetMapping("/showAboutPage")
    public String showAboutPage(){
        return "about";

    }

}
