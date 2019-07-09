package ch02;

public class Person2 {

	private String name;
	private int age;
	
	//생성자는 인스턴스 생성시 초기값 설정 (P
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	};
	
	public void print() {
		System.out.println("----------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
