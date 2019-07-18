package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Sql_03 {

	public static void main(String[] args) throws SQLException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수정할 부서를 입력하세요 "); String deptno = sc.nextLine(); //nextline 은 입력된 값을 deptno에 넣겟다 라는 뜻
		System.out.println("부서명"); String dname = sc.nextLine();
		System.out.println("근무지"); String loc = sc.nextLine();
		
		String sql = String.format("Update dept set dname = '%s', " + "loc='%s' where deptno=%s", dname, loc, deptno); // data 타입에 따라서 형 변환을 해야함 '%s' = 문자, %s = 숫자
		
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	
		//String url = "jdbc:oracle:thin:@192.168.50.26:1521:xe";
		
		Connection conn = null;
		java.sql.Statement stmt = null;
		
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, "scott", "TIGER");
				stmt = conn.createStatement();
				int result = ((java.sql.Statement) stmt).executeUpdate(sql); // 입력 수정 삭제시 -> executeupdate  , selecte는 executequary 를 사용한다.
				
				if(result > 0 ) System.out.println("입력성공"); // return 값이 입력시 입력된 개수, 수정시 수정된 개수, 삭세시 삭제된 개수
				else System.out.println("입력실패");
				
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				if(stmt != null) stmt.close(); //서버를 닫아줘야지 객체호출을 멈춰야지 버퍼가 안찬다.
				if(conn != null) conn.close();
			}
			sc.close();
	}

}
