package com.ccs.professorlol.web;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@NoArgsConstructor
public class FrontController {

    @GetMapping({"/page/**","/login"})
    public String index(){
        return "/index.html";
    }

}
