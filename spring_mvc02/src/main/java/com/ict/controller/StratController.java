package com.ict.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StratController {
	
	@GetMapping(value= "/start.do")
	public ModelAndView exec(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("admin/output");
		String [] dogName = {"초복이", "중복이", "말복이", "개똥이"};
		mv.addObject("dogName", dogName);
		
		return mv;
		
	}
}
