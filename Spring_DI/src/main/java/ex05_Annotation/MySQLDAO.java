package ex05_Annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class MySQLDAO implements DAO{
	public MySQLDAO() {
		System.out.println("MySQL ������");	
		}
		@Override
		public void prn() {
			System.out.println("MySQL �޼���");
		}
}
