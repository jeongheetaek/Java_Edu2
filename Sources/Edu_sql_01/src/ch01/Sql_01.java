package ch01;

import java.sql.Connection;
import java.sql.DriverManager;

public class Sql_01 {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		// Localhost -> 127.0.0.1;, port 번호 : 1521, xe(orcl) -> Service ID(Sid)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "scott", "TIGER");
			System.out.println("Strart");
			if(conn!=null) { 
				System.out.println("Success 연결 성공");
			}else {
				System.out.println("Fail");
			}
			conn.close();
		}catch(Exception e) {
			System.out.println("Error" + e.getMessage());
		}
	}

}
