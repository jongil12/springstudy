package com.ict.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExamController {
	
	// a ∏µ≈©¥¬ get πÊΩƒ ¿Ã¥Ÿ.
	@GetMapping("/exam01.do")
	public ModelAndView exec01(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("output");
		mv.addObject("name", "ø¿√µªÁ");
		mv.addObject("age", "1004");
		mv.addObject("addr", "«œ¥√≥™∂Û");
		
		return mv;
	}
	
	@GetMapping("/exam02.do")
	public ModelAndView exec02(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("admin/output");
		List<String> dogName = new ArrayList<String>();
		dogName.add("πŸµœ¿Ã");
		dogName.add("∞≥∂À¿Ã");
		dogName.add("∏ª∂À¿Ã");
		dogName.add("º“∂À¿Ã");
		dogName.add("¡„∂À¿Ã");
		mv.addObject("dogName", dogName);
		return mv;
	}
	
}
