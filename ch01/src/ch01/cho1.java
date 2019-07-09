package ch01;

import java.util.Scanner;

public class cho1 {
	public static void main(String[] args) {
		boolean run = true;
		int money;
		int balance = 0;
		 
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.  예금    2.  출금   3.  잔고   4.  종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			
			int num = scanner.nextInt();
			
			if(num == 1) {
				System.out.print("예금액> ");
				money = scanner.nextInt();
				balance = balance + money;
			}
			else if(num == 2) {
				System.out.print("출금액> ");
				money = scanner.nextInt();
				if(money <= balance)
					balance = balance - money;
				else
					System.out.println("금액이 없습니다.");
				
			}
			else if(num == 3) {
				System.out.print("잔고> ");
				System.out.println(balance);				
			}
			else if(num == 4) {
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
}