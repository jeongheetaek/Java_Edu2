package ch_01;

public class Ex04 {

	public static void main(String[] args) {

		try {
			method1();
		} catch(Exception e) {
			System.out.println("예외처리 " + e.getMessage());
		}
		
	}
	
	static void method1() throws Exception{
		method2();
	}
	static void method2() throws Exception{
		System.out.println("예외처리 method2");
		throw new Exception("method2 error 발생...");
	}

}
