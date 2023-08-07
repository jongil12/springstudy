package ex05_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// 해당 컨테이너가 설정 정보를 읽어서 객체를 생성/관리하고 의존성 주입을 할 수 있다.
		ApplicationContext context = 
				new GenericXmlApplicationContext("ex05_Annotation/config.xml"); //(설정정보 위치)
		
		Service service = (Service) context.getBean("sic");
		service.biz();
	}
}
