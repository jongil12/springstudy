package ex01_nonDI;

public class TestMain {
	public static void main(String[] args) {
		// ���1
		// Service service = new Service();
		// service.biz();
		
		// ���2
		Service service = new Service(new OracleDAO());
		service.biz();
		
		// setter �̿�
		Service service2 = new Service();
		service2.setDao(new MySQLDAO());
		service2.biz();
		
	}
}
