package com.s.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class IndexController {

    @RequestMapping("login")
    public String login(ModelMap mm){
        mm.addAttribute("name", "Hello Tom");
        return "default/login";
    }
}
