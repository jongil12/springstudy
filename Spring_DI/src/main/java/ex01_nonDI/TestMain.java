package ex01_nonDI;

public class TestMain {
	public static void main(String[] args) {
		// 规过1
		// Service service = new Service();
		// service.biz();
		
		// 规过2
		Service service = new Service(new OracleDAO());
		service.biz();
		
		// setter 捞侩
		Service service2 = new Service();
		service2.setDao(new MySQLDAO());
		service2.biz();
		
	}
}
