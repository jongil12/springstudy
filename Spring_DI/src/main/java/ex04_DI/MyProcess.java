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
	
	// 실행하고 싶은 메서드
	public void prn() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age.count(jumin, gender));
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
