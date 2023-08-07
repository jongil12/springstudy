package com.ict.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class StartController implements Controller{
@Override
public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	ModelAndView mv = new ModelAndView("result");
	
	mv.addObject("name", "Èñµ¿ÀÌ");
	request.setAttribute("age", 3);
	request.getSession().setAttribute("addr", "Á¦ÁÖµµ ¼­±ÍÆ÷½Ã");
	return mv;
}
}
