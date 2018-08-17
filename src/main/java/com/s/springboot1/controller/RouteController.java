package com.s.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class RouteController {

    @GetMapping(value={"", "index"})
    public String index(Model m){return "default/index";}

    @RequestMapping("award")
    public String award(Model m){
        return "default/award/award";
    }

    @RequestMapping("discover")
    public String discover(Model m){
        return "default/discover/discover";
    }

    @RequestMapping("mine")
    public String mine(Model m){
        return "default/mine/mine";
    }

    @GetMapping("activity")
    public String activity(Model m){return "default/activity/activities";}

}
