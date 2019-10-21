package com.ityan.web;

import com.ityan.pojo.Hero;
import com.ityan.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddController {
    @Autowired
      HeroService heroService;
    @PostMapping("/addHero")
    public String addHero(Hero hero){
            heroService.addHero(hero);
            return "redirect :/index";
    }
}
