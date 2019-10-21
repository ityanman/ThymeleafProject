package com.ityan.service;

import com.ityan.pojo.Hero;

import java.util.List;

public interface HeroService {
    //查询所有英雄信息
    public List<Hero> selectAll();
    //添加英雄
    public void addHero(Hero hero);
}
