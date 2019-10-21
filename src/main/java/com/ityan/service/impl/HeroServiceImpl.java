package com.ityan.service.impl;
import com.ityan.mapper.HeroMapper;
import com.ityan.pojo.Hero;
import com.ityan.service.HeroService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {
    @Resource
    HeroMapper heroMapper;
    //获取所有英雄
    @Override
    public List<Hero> selectAll() {
        return heroMapper.selectAll();
    }

    //添加英雄
    @Override
    public void addHero(Hero hero) {
        heroMapper.insert(hero);
    }
}
