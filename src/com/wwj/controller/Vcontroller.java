package com.wwj.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wwj.model.User;

@Controller
public class Vcontroller {
	
    @RequestMapping("/user1")
    @ResponseBody
    public User test(@Validated User user, BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError error : errors) {
                System.out.println(error.getDefaultMessage());
            }
        }
        return user;
    }

}
