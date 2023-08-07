package com.ict.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// ����� ���� �ʰ� @Controller ������̼��� ����ϹǷ� �ش� Ŭ������ ��Ʈ�ѷ���� ���� ���Ѵ�. 
// ����� �޾��� ���� �ڵ����� ���� �޼��带 ����Ʈ ������ 
// ����� ���� ���� ���� �˾Ƽ� ���� �޼��带 ������ �Ѵ�.

@Controller
public class IndexController {

	// ���� �޼��� ���� ���� ���� �Ǵ� ���� ����� �ȴ�.
	@RequestMapping(value= "/index.do", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("output");
		mv.addObject("name", "�Ѹ�");
		mv.addObject("age", 10);
		mv.addObject("addr", "����");
		
		return mv;
	}
}
