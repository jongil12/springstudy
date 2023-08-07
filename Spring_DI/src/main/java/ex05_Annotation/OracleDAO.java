package ex05_Annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class OracleDAO implements DAO{
	public OracleDAO() {
		System.out.println("Oracle 생성자");
	}
	
	@Override
public void prn() {
	System.out.println("Oracle 메서드");
	
}
}
