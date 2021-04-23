package com.xc.oauth2example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping("/403")
    public String error403() {
        return "sorry！you're forbidde to visit this resource！";
    }

    @RequestMapping("/404")
    public String error404() {
        return "sorry！the page has bean disappeared！";
    }

}
