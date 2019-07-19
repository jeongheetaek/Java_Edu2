package ch01;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) throws SQLException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드"); String deptno = sc.nextLine();
		System.out.println("부서명"); String dname = sc.nextLine();
		System.out.println("근무지"); String loc = sc.nextLine();
		
		Connection conn = null;
		java.sql.Statement stmt = null;
		
		//String deptno = sc.nextLine();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		String sql = String.format("Insert into dept values(%s, '%s', '%s')", deptno, dname, loc);
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "TIGER");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) System.out.println("입력성공");
			else System.out.println("입력실패");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
		
		sc.close();	
		

	}

}
