package com.ityan.web;

import com.ityan.pojo.Hero;
import com.ityan.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    HeroService heroService;
    @GetMapping("/index")
    public String index(Model model){
         //取数据
        List<Hero> heroes = heroService.selectAll();
        model.addAttribute("HeroList",heroes);
        return "index";
    }
}
