package ex05_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// �ش� �����̳ʰ� ���� ������ �о ��ü�� ����/�����ϰ� ������ ������ �� �� �ִ�.
		ApplicationContext context = 
				new GenericXmlApplicationContext("ex05_Annotation/config.xml"); //(�������� ��ġ)
		
		Service service = (Service) context.getBean("sic");
		service.biz();
	}
}
