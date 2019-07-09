package ch01;

public class Ch07 {

	private String name;
	private int age;
	
	Ch07(String name, int age){
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
	
	
	

}
