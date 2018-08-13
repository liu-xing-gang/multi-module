package com.s.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(Model m){
        List<Object> animals = new ArrayList<Object>();
        for(int i=0; i<3; i ++){
            Map<String, Object> map = new HashMap<>();
            map.put("name", "animal"+i);
            map.put("size", "size"+i);
            map.put("price", "price"+i);
            animals.add(map);
        }

        m.addAttribute("hello", "Hello World");
        m.addAttribute("animals", animals);

        return "default/hello";
    }
}
