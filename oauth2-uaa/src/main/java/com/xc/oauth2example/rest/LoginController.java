package com.xc.oauth2example.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(HttpServletRequest request) {
        String jwt = request.getHeader("jwt");
        System.out.println("login");
        return "login";
    }

}
