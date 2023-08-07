package ex03_DI;

public class MyProcess {
	private String name="홍길동";
	private int age= 13;
	
	public MyProcess() {}
	public MyProcess(String name, int age) {
	// 소스-> 유징 필드
		this.name = name;
		this.age = age;
	}
	
	// 실행하고 싶은 메서드
	public void prn() {
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
