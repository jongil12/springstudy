package com.ict.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// 상속을 받지 않고 @Controller 어노테이션을 사용하므로 해당 클래스가 컨트롤러라는 것을 말한다. 
// 상속을 받았을 때는 자동으로 실행 메서드를 임포트 했지만 
// 상속을 받지 않을 때는 알아서 실행 메서드를 만들어야 한다.

@Controller
public class IndexController {

	// 실행 메서드 위에 언제 실행 되는 지를 적어야 된다.
	@RequestMapping(value= "/index.do", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("output");
		mv.addObject("name", "둘리");
		mv.addObject("age", 10);
		mv.addObject("addr", "남극");
		
		return mv;
	}
}
