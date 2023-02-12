package com.uniovi.sdi2223908spring.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MarksController {
    @RequestMapping("/mark/list")
    public String getList() {
        return "Getting List";
    }
    @RequestMapping("/mark/add")
    public String setMark() {
        return "Adding Mark";
    }
    @RequestMapping("/mark/details")
    public String getDetail() {
        return "Getting Details";
    }

}