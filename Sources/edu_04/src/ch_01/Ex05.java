package ch_01;

public class Ex05 {
	
	static void callDriver()	throws ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("완료");
	}

	public static void main(String[] args) {
		try {
			callDriver();			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("시스템 종료");
		}
	}
}
