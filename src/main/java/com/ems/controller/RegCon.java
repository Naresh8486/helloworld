package com.ems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegCon {
    
    @GetMapping(value="/method")
    public String m2() {
        return "m2";
    }

}
