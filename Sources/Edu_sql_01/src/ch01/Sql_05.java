package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Sql_05 {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서코드를 입력하세요");
		String deptno=sc.nextLine();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "Delete from dept where deptno= " + deptno; //이곳에 sql 언어를 보여주면 됨!
		
		Connection conn = null;
		java.sql.Statement stmt = null;
		//ResultSet rs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "TIGER");
			stmt = conn.createStatement();
			
			int result = ((java.sql.Statement) stmt).executeUpdate(sql); 
			
			if(result > 0) System.out.println("삭제성공");
			else System.out.println("삭제실패");
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(stmt != null) stmt.close(); //서버를 닫아줘야지 객체호출을 멈춰야지 버퍼가 안찬다.
			if(conn != null) conn.close();
		}
		sc.close();
		
	}

}
