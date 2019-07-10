package ch_01;

public class MyExeptionEx2 { //run as 로 argument 실행합니다.

	public static void main(String[] args) {
		try {
			int kkk = Integer.parseInt(args[0]);
			if (kkk < 100) throw new MyException1();
			if (kkk > 1000) throw new MyException2();
			System.out.println("정상실행.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java MyExceptionEx2 num1");
			
		} catch (MyException1 e) {
			System.out.println(e.getMessage());
		} catch (MyException2 e) {
			System.out.println(e.getMessage());
		}

	}

}
