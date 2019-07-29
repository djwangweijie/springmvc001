package com.wwj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	@RequestMapping("/testCookie")
	public String testCookie(@CookieValue(value = "name", required = false) String name,
			@CookieValue(value = "age", required = false) Integer age) {
		System.out.println(name + "," + age);
		return "hello";
	}
}
