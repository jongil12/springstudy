package com.ict.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ExamController implements Controller{
@Override
public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	ModelAndView mv = new ModelAndView("result");
	
	// �迭
	String [] dogName = {"�ʺ���","�ߺ���","������","�ٵ���"};
	mv.addObject("dogName", dogName);
	
	// List
	List<String> list = new ArrayList<String>();
	list.add("�츮����");
	list.add("����");
	list.add("��");
	list.add("������");
	mv.addObject("list", list);
	
	return mv;
}
}
