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
	
	// a ��ũ�� get ��� �̴�.
	@GetMapping("/exam01.do")
	public ModelAndView exec01(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("output");
		mv.addObject("name", "��õ��");
		mv.addObject("age", "1004");
		mv.addObject("addr", "�ϴó���");
		
		return mv;
	}
	
	@GetMapping("/exam02.do")
	public ModelAndView exec02(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("admin/output");
		List<String> dogName = new ArrayList<String>();
		dogName.add("�ٵ���");
		dogName.add("������");
		dogName.add("������");
		dogName.add("�Ҷ���");
		dogName.add("�����");
		mv.addObject("dogName", dogName);
		return mv;
	}
	
}
