package com.wwj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes(value={"user"})
@Controller
public class SessionController {

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        model.addAttribute("user", "wwj");
        return "success";
    }
}

