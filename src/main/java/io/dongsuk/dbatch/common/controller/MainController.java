package io.dongsuk.dbatch.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "login";
    }

    @RequestMapping("/main")
    public String main(){
        return "index";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/forgot-password")
    public String forgotPassword(){
        return "forgot-password";
    }

    @RequestMapping("/tables")
    public String table(){
        return "tables";
    }
}
