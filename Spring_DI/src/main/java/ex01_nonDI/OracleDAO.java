package ex01_nonDI;

public class OracleDAO implements DAO{
	public OracleDAO() {
		System.out.println("����Ŭ ������");
	}
	
	@Override
public void prn() {
	System.out.println("����Ŭ �޼���");
	
}
}
