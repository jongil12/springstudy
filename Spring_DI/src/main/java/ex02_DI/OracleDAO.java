package ex02_DI;

public class OracleDAO implements DAO{
	public OracleDAO() {
		System.out.println("Oracle ������");
	}
	
	@Override
public void prn() {
	System.out.println("Oracle �޼���");
	
}
}
