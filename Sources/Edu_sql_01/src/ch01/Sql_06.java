package ch01;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Sql_06 {

	public static void main(String[] args) throws SQLException{
		
		Scanner sc = new Scanner(System.in);
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		String sql = "Select * from emp where comm is not null and comm != 0";
		
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		System.out.println("사원명단");
		System.out.println("사번\t이름\t업무\t\t급여\t입사일");
		System.out.println("==========================");
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "TIGER");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				do {
					int empno = rs.getInt(1);
					String ename = rs.getString(2);
					String job = rs.getString(3); // 3번째 속성
					int sal = rs.getInt("sal"); //rs.getInt(6) 6번째 속성 컬럼명을 적어도 됨
					int coo = rs.getInt("comm");
					Date date = rs.getDate("hiredate");
					if (job.length() > 7) System.out.printf("%d\t%s\t%s\t%d\t%TF\t%d\n",empno,ename,job,sal,date,coo);
					else System.out.printf("%d\t%s\t%s\t\t%d\t%TF\t%d\n",empno,ename,job,sal,date,coo);
				} while(rs.next());
			} else {
				System.out.println("data no");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally{
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
		sc.close();
	} 
}