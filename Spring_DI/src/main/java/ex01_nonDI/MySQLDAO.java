package ex01_nonDI;

public class MySQLDAO implements DAO{
	public MySQLDAO() {
	System.out.println("MySQL 생성자");	
	}
	@Override
	public void prn() {
		System.out.println("MySQL 메서드");
	}
}
