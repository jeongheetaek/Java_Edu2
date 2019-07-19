package ch01;

/*import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
*/
import java.sql.*; // 차라리 sql *로 다 해주자
import java.util.Scanner;

public class Oraproc2 {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정보가 궁금한 사람 사번"); //사번만을 통해서 아래 사번과 급여가 나옴
		
		int empno = sc.nextInt();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		String sql = "{call EMP_INFO2(?,?,?)}"; // 프로시저를 call 한다. dept에 ? ? ?를 넣는다.
		
		Connection conn = null;
		CallableStatement cs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "TIGER");
			cs = conn.prepareCall(sql); // 준비하고
			
			cs.setInt(1, empno); // 프로시저에서 in으로 들어간다.
			
			//import java.sql.* 로 해버려서 에러 안만들기
			cs.registerOutParameter(2, java.sql.Types.VARCHAR); // out해오는것 프로시저로부터 GET을 하기 위해 선행조건으로 하는것
			cs.registerOutParameter(3, java.sql.Types.INTEGER);
			
						
			cs.executeQuery();
			
			String ename = cs.getString(2);
			Double sal = cs.getDouble(3);  // 정수부분과 소수점 부분이 합쳐신 것 (테이블에서 입력형태를 확인)
			
			System.out.println("사번 : " + empno);
			System.out.println("이름 : " + ename);
			System.out.println("급여 : " + sal);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(cs != null) cs.close();
			if(conn != null) conn.close();
		}
		sc.close();
	}
}
