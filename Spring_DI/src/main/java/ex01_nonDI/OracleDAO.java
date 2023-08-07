package ex01_nonDI;

public class OracleDAO implements DAO{
	public OracleDAO() {
		System.out.println("오라클 생성자");
	}
	
	@Override
public void prn() {
	System.out.println("오라클 메서드");
	
}
}
