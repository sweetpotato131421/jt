package com.jt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class indexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/page/{page}")
    public String toPage(@PathVariable("page") String page){
            return page;
    }
}
