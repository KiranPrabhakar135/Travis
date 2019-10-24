package com.travisci.travisci.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/home")
    public String sayHi(){
        return "Welcome to Travis CI Demo  ... 12 ";
    }
}