package ex03_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain_DI {
	public static void main(String[] args) {
		// ������ �����̳ʴ� ���� ������ �̿��ؾ� �ȴ�.
		ApplicationContext context = 
				new GenericXmlApplicationContext("ex03_DI/config.xml");
		MyProcess p1 = (MyProcess) context.getBean("m1"); 
		p1.prn();
		
		MyProcess p2 = (MyProcess) context.getBean("m2"); 
		p2.prn();
		
		MyProcess p3 = (MyProcess) context.getBean("m3"); 
		p3.prn();
	}
}
