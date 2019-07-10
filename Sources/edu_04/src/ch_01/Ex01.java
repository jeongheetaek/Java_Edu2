package ch_01;

public class Ex01 {

	static void method(boolean b) {
		
		try {
			System.out.println(1 + "b  -- >" + b);
			if(b) throw new ArithmeticException(); //true 경우 실행됨
			System.out.println(0/0);
			//예외발생시 실행되지않음
		} catch(RuntimeException r) { //아르쓰메틱스의 아버지가 런타임예외이기에 실행함
			System.out.println("RuntimeException " + " -- > " + 3);
			return;
		} catch(Exception e) { //매서드를 빠져나간다 runtime 에러가 아닌 다른 에러가 발생했을때 이 예외문을 다닌다.
			System.out.println(4);
			return;
		}finally {
			//예외방생여부에 관계없이 항상 실행되는 무장
			System.out.println("예외발생 여부에 관계없이 항상 실행되는 문장" + 5);
		}
		System.out.println("정상적으로 끝나야 실행되는 문장");
		

	}
	public static void main( String [] args) {
		method(true);
		method(false);
	}

}
