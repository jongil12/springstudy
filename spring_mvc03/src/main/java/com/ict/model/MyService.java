package com.ict.model;

import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component("service")
public class MyService {
	public MyService() {
		System.out.println("MyService ������");
	}
	public String getGreeting() {
		String str = "";
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour >= 7 && hour<=8) {
			str = "���� ��ħ";
		}else if(hour >= 12 && hour <=14) {
			str = "���ɽĻ� �ϼ̳���?";
		}else if(hour >= 22 && hour <=24) {
			str = "���� �� �ټ���";
		}else {
			str = "�ȳ��ϼ���";
		}
		return str;
	}
	
	public String getCalc(String s1, String s2, String op) {
		int result = 0;
		int su1 = Integer.parseInt(s1);
		int su2 = Integer.parseInt(s2);
		switch (op) {
		case "+":result = su1 + su2;break;
		case "-":result = su1 - su2;break;
		case "*":result = su1 * su2;break;
		case "/":result = su1 / su2;break;

		}
		
		return String.valueOf(result);
	}
	
}

