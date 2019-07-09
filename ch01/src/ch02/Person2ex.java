package ch02;

public class Person2ex {
	public static void main(String[]args) {
		Person2[] ps = new Person2[5];
		ps[0] = new Student2("옥주현", 23, "1203667");
		ps[1] = new Student2("김우신", 53, "1363566");
		ps[2] = new Teacher2("대조영", 48, "Java");
		
		ps[3] = new Manager2("김소현", 28, "청소");
		ps[4] = new Manager2("전현무", 40, "비대");
		
		for( Person2 p : ps) {
			p.print();
			if(p instanceof Manager2) { //매니저에 있는 요소가 p와 같은지 확인
				System.out.println("두 번째 방법 :" +((Manager2)p).getPart());
			}
		}
	}
}
