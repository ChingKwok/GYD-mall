package com.chowi.gydmall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String index(){
        return "hi,Jenkins";
    }

    @RequestMapping(value = "say")
    @ResponseBody
    public String say(){
        return "i can tell you";
    }
}
