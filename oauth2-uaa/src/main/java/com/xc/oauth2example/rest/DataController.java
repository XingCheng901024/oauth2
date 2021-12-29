package com.xc.oauth2example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @RequestMapping("add")
    public String add() {
        return "add";
    }

    @RequestMapping("edit")
    public String edit() {
        return "edit";
    }

    @RequestMapping("delete")
    public String delete() {
        return "delete";
    }

    @RequestMapping("select")
    public String select() {
        return "select";
    }

}
