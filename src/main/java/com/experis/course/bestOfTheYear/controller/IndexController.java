package com.experis.course.bestOfTheYear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    @ResponseBody
    public String index() {
        return "<html><body><h1>Best of the year by Wilmer<h1><bogy><html>";
    }


    @GetMapping("home")
    public String home(Model model) {

        String author = "Wilmer";
        model.addAttribute("author", author);
        return "home";
    }


}

