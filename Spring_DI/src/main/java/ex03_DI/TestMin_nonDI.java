package ex03_DI;

public class TestMin_nonDI {
	public static void main(String[] args) {
		// �����ڸ� �̿��ϴ� ���
		MyProcess mp = new MyProcess("�Ѹ�", 23);
		mp.prn();
		System.out.println("=================");
		
		MyProcess mp2 = new MyProcess();
		mp2.setName("����");
		mp2.setAge(3);
		
		mp2.prn();				
	}
}
