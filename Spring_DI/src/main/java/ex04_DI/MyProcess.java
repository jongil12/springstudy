package ex04_DI;

public class MyProcess {
	private String name;
	private String jumin;
	private int gender;
	private Age age;
	
	public MyProcess() {}

	public MyProcess(String name, String jumin, int gender, Age age) {
		super();
		this.name = name;
		this.jumin = jumin;
		this.gender = gender;
		this.age = age;
	}
	
	// �����ϰ� ���� �޼���
	public void prn() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age.count(jumin, gender));
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}


	
}
