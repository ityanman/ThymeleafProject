package com.ityan.web;

import net.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
/*    @GetMapping("/login")
    public String login(){
         return "login";
    }*/
//登录
@PostMapping("/userLogin")
public String userLogin(String username, String password, Model model, HttpSession session){
    if (!StringUtils.isEmpty(username) && "1234".equals(password)){
        session.setAttribute("user",username);
        System.out.println(username);
        return "redirect:/index";
    }

    model.addAttribute("msg","用户名或密码错误");
    return "login";
}
}
