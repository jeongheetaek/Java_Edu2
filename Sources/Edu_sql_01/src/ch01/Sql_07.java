package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Sql_07 {

	public static void main(String[] args) throws SQLException{
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("부서코드"); String deptno = sc.nextLine(); //nextline 은 입력된 값을 deptno에 넣겟다 라는 뜻
		System.out.println("부서명"); String dname = sc.nextLine();
		System.out.println("근무지"); String loc = sc.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		
		String sql = "Insert into dept values(?,?,?)";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "TIGER");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,deptno);
			pstmt.setString(2,dname);
			pstmt.setString(3,loc);
			
			int result = pstmt.executeUpdate();
			if(result > 0 )System.out.println("입력성공");
			else System.out.println("입력실패");
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		sc.close();
	}

}
