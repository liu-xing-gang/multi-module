package com.s.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class IndexController {

    /**
     * banner轮播图
     * @param m
     * @return
     */
    @GetMapping("index/banners")
    public Object apiBanners(Model m){
        return null;
    }

    /**
     * 消息
     * @param m
     * @return
     */
    @GetMapping("index/news")
    public Object apiNews(Model m){
        return null;
    }

    /**
     * 投注比赛轮播图
     * @param m
     * @return
     */
    @GetMapping("index/matches")
    public Object apiMatches(Model m){
        return null;
    }

    /**
     * 彩种列表
     * @param m
     * @return
     */
    @GetMapping("index/species")
    public Object apiSpecies(Model m){
        return null;
    }

}
