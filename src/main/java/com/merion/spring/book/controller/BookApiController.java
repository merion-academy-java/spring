package com.merion.spring.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootApiController {

    @GetMapping("/")
    public String ok(){
        return "ok";
    }

}
