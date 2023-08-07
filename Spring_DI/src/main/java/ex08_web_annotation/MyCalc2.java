package ex08_web_annotation;

import org.springframework.stereotype.Component;

@Component
public class MyCalc2 {
	int result = 0;
	
	public int mul(int s1, int s2) {
		return s1 * s2;
	}
	public void div(int s1, int s2) {
		result =  s1 / s2;
	}
}
