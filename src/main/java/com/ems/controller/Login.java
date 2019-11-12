package com.ems.controller;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Component
@RequestMapping(value = "/login")
public class Login {

    @RequestMapping(value="/getid/{id}/reciept", method =RequestMethod.GET)
    public String loginMsg(@PathVariable ("id") int number, @RequestParam(value="date", required=false) Date dateOrNull ) {
        System.out.println("id::::::"+  dateOrNull);
        System.out.println(number);
        return "Success";
    }

    @RequestMapping(value = "/method3", method = { RequestMethod.POST, RequestMethod.GET })
    @ResponseBody
    public String loginData() {
        return "heloo";
    }
    
    @GetMapping
    public String m1() {
        return "m1";
    }
//    @GetMapping
//    public String m2() {
//        return "m2";
//    }

}
