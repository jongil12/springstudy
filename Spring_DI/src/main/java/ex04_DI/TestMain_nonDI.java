package ex04_DI;

public class TestMain_nonDI {
	public static void main(String[] args) {
		Age age = new Age();
		MyProcess mp1 = new MyProcess("홍길동", "940808", 2, age);
		mp1.prn();
		
		System.out.println("====================");
		MyProcess mp2 = new MyProcess();
		mp2.setName("고은별");
		mp2.setJumin("020202");
		mp2.setGender(4);
		mp2.setAge(age);
		
		mp2.prn();
	}
}
