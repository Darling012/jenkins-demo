package com.jenkins.demo.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("test")
    public  String test () {
        return "Ok";
    }
    @GetMapping("testGet")
    public  String testGet () {
        return "Okget";
    }
}
