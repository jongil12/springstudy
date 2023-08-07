package com.ict.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// ������̼��� �ƴ� ��Ʈ�ѷ��� �ݵ�� Controller �� ��� �޾ƾ� �Ѵ�.
public class IndexController implements Controller{
@Override
public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	ModelAndView mv = new  ModelAndView();
	mv.setViewName("result");
	
	// �� ó�� = DBó��, ����Ͻ� ����ó��
	// ��ó�� �� ������ ����
	mv.addObject("name", "ȫ�浿");
	request.setAttribute("age", 17);
	request.getSession().setAttribute("addr", "���� ������ �ż���");
	
	return mv;
}
}
