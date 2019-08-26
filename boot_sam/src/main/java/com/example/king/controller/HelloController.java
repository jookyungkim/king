package com.example.king.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public ModelAndView main(ModelAndView mav)
	{
		mav.setViewName("hello");
		mav.addObject("message", "스플링 부트 애플리케이션");
		return mav;
		
	} 

}
