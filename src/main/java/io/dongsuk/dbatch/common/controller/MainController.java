package io.dongsuk.dbatch.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/tables")
    public String table(){
        return "tables";
    }
}