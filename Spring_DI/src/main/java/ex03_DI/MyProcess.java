package ex03_DI;

public class MyProcess {
	private String name="ȫ�浿";
	private int age= 13;
	
	public MyProcess() {}
	public MyProcess(String name, int age) {
	// �ҽ�-> ��¡ �ʵ�
		this.name = name;
		this.age = age;
	}
	
	// �����ϰ� ���� �޼���
	public void prn() {
		System.out.println("�̸� :" + name);
		System.out.println("���� :" + age);
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
