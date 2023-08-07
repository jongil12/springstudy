package ex02_DI;

public class OracleDAO implements DAO{
	public OracleDAO() {
		System.out.println("Oracle 생성자");
	}
	
	@Override
public void prn() {
	System.out.println("Oracle 메서드");
	
}
}
