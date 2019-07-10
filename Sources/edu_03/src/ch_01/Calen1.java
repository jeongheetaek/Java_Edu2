package ch_01;

import java.util.Calendar;
import java.util.Date;


public class Calen1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
			
		while(cal.get(Calendar.SECOND) != 59) {
			
			cal = Calendar.getInstance();
			
			//Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR); // 중요하다. class 명 그대로 사용하면  Static 변수가 된다.
			int month = cal.get(Calendar.MONTH) + 1; 
			int date = cal.get(Calendar.DATE);
			
			System.out.printf("오늘은 %d년 %d월 %d 입니다.\n", year,month,date);
			
			int hour = cal.get(Calendar.HOUR);
			int min = cal.get(Calendar.MINUTE) + 1; 
			int sec = cal.get(Calendar.SECOND);
			
			System.out.printf("지금은 %d:%d:%d 입니다.\n", hour, min, sec);
			
			try {

				Thread.sleep(1000); //1초 대기

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			
			Date dt = cal.getTime();
			System.out.println(dt);
			
			int dy1 = cal.get(Calendar.DAY_OF_MONTH);
			int dy2 = cal.get(Calendar.DAY_OF_YEAR);
		
			System.out.println(dy1 + " , " + dy2);
		}

	}

}
