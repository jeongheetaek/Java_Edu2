package ch_01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int result = 0;
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.println("첫번째 숫자 입력하세요");
				num1 = Integer.parseInt(sc.nextLine());
				if(num1 == 0) break;
				System.out.println("두번째 숫자 입력하세요");
				num2 = Integer.parseInt(sc.nextLine());
				result = num1/num2;
				System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
			} catch(Exception e) {
				System.out.println("나머지 Error" + e.getMessage());
				break;
			}
			finally {
				System.out.println("난 무조건 나온다.");
			}
		} while(true);
		System.out.println("프로그램 종료");
		sc.close();
	} 

}
