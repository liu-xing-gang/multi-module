package com.s.springboot1.controller;

import com.s.springboot1.model.User;
import com.s.springboot1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
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

    @PostMapping("/add")
    public User addUser(){
        User user = new User();
        user.setId(2);
        user.setGender("男");
        user.setAge(12);
        user.setName("stranger");

        return userService.addUser(user);
    }

    @GetMapping("/findAll")
    public Iterable<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/findById")
    public User findById(){
        return userService.findByIdUser(2);
    }

    @PostMapping("/delete")
    public String deleteUser(){
        Integer id = 2;
        userService.delUser(id);
        return "success";
    }

    /**
     * JWT实现token-based会话管理
     */
    @RequestMapping("/token-based")
    public String tokenBased(Model m){
        return "default/token-based";
    }

}
