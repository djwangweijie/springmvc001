package com.wwj.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.wwj.model.Person;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView login(){
		//处理业务逻辑
		ModelAndView mv =  new ModelAndView();
		mv.addObject("abc", "wwj");
		mv.setViewName("main");
		return  mv;
	}
	
	@RequestMapping("/a1")
	public void login(@RequestParam(value="a") String a,@RequestParam(value="b") String b){
		System.out.println(a+b);
	}
	
	@RequestMapping("/a2")
	public void login1(Person  p){
		System.out.println(p.getPid());
		System.out.println(p.getName());
		System.out.println(p.getBir().toString());
	}
	
	
	@RequestMapping("/a3")
	public void login2(Person  p){
		System.out.println(p.getPid());
		System.out.println(p.getName());
		System.out.println(p.getBir().toString());
		System.out.println(p.getDognames().size());
	}
	
	@RequestMapping(value="/a4/{pnameattr}/{name}")
	public void login3(@PathVariable(value="pnameattr") String pnameattr,@PathVariable(value="name") String name){
			System.out.println(pnameattr+name);
	}
	
	@RequestMapping("/a5")
	public void login4(@RequestParam("uname") String uname,@RequestParam("uage") String uage){
			System.out.println(uname+uage);

	}
	
	@RequestMapping("/a6")
	public String login5(RedirectAttributes  rs){
			//rs.addAttribute("pname","wwj");
		 	rs.addFlashAttribute("pname", "wwj");
			return  "redirect: index.jsp";
	}
	
}
