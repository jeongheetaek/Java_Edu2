package ch01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Procedure {

	public static void main(String[] args) throws SQLException{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("부서코드"); String deptno = sc.nextLine(); //nextline 은 입력된 값을 deptno에 넣겟다 라는 뜻
		System.out.println("부서명"); String dname = sc.nextLine();
		System.out.println("근무지"); String loc = sc.nextLine();
		
		Connection conn = null;
		CallableStatement cs = null; //
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		String sql = "{call DEPT_INSERT(?,?,?)}"; // 프로시저를 call 한다. dept에 ? ? ?를 넣는다.
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "TIGER");
			cs = conn.prepareCall(sql); // 준비하고
			cs.setString(1,deptno);
			cs.setString(2,dname);
			cs.setString(3,loc);
			
			int result = cs.executeUpdate();
			if(result > 0 )System.out.println("입력성공");
			else System.out.println("입력실패");
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(cs != null) cs.close();
			if(conn != null) conn.close();
		}
		sc.close();

	}
//기본키의 경우는 최소성과 유일성을 만족해야한다. DEPTNO는 기본키
}
