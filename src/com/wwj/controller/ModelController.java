package com.wwj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wwj.model.Girl;

@Controller
public class ModelController {

	
    @ModelAttribute("girl")
    public Girl init(Model model){
        Girl g  = new Girl();
        g.setAge(28);
        g.setName("菲菲");
        return g;
    }


    @RequestMapping("/m1")
    public String m1(Model model) {
        System.out.println(model.containsAttribute("girl"));
        return "msg";
    }
    
    @RequestMapping("/m2/{name}/{age}")
    public String m1(@ModelAttribute Girl girl) {
        System.out.println(girl.getName()+girl.getAge());
        return "msg";
    }
    
    @RequestMapping(value="m3",method=RequestMethod.POST)
    public String m3(@ModelAttribute Girl girl) {
        System.out.println(girl.getName()+girl.getAge());
        return "msg";
    }
    
    
    
}
