package com.jt.controller;

import com.jt.service.UserService;
import com.jt.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class userController {
    @Autowired
    private UserService userSevice;
    @RequestMapping("/user_ajax/checkUserName")
    @ResponseBody
    public SysResult ajaxCheckUser(@RequestParam("userName") String username) {
        int exit = userSevice.checkUserName(username);
        return SysResult.build(exit, "ok", null);
    }
}
