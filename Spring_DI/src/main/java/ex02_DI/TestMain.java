package ex02_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// Spring Container ���� ��ü(Bean)�� �����ϰ� �����Ѵ�.
		// Container�� ��ü�� �����ϰ� ������ �� �ֵ��� ���� ������ ������ �Ѵ�.
		
		// Spring Container => BeanFoctory => ApplicationContext 	(java)
		//								   => WepApplicationContext (Web)
		// �ش� �����̳ʰ� ���� ������ �о ��ü�� ����/�����ϰ� ������ ������ �� �� �ִ�.
		ApplicationContext context = 
				new GenericXmlApplicationContext("ex02_DI/config.xml"); //(�������� ��ġ)
		
		// Service�� �ִ� biz() ����
		// ex02_DI/config.xml���� ������� ��ü ȣ��
		// getBean �� ������Ʈ�� �ɽ�Ʈ ������Ѵ�.
		Service service = (Service) context.getBean("service");
		service.biz();
	}
}
