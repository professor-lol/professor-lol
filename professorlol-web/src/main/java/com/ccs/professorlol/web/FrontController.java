package com.ccs.professorlol.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

    @GetMapping({"/page/**","/login"})
    public String index(){
        return "/index.html";
    }

}
