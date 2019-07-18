package ch01;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Sql_04 {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드를 입력하세요");
		
		int deptno = sc.nextInt();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "Select dname ,loc from dept where deptno = " + deptno;
		
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "TIGER");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println("부서코드 :" + deptno);
				System.out.println("부서명 :" + dname);
				System.out.println("위치 :" + loc);
				
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(stmt != null) stmt.close(); //서버를 닫아줘야지 객체호출을 멈춰야지 버퍼가 안찬다.
			if(conn != null) conn.close();
		}
		sc.close();
	}

}
