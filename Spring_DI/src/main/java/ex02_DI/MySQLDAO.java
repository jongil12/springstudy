package ex02_DI;

public class MySQLDAO implements DAO{
	public MySQLDAO() {
		System.out.println("MySQL ������");	
		}
		@Override
		public void prn() {
			System.out.println("MySQL �޼���");
		}
}
