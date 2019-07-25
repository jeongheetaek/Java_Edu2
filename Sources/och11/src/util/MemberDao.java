package util;
import java.sql.*;
import javax.naming.*;
import javax.sql.*;
 
public class MemberDao {
	private Connection getConnection() {
		Connection conn = null;
		try { Context ctx = new InitialContext(); //context.xml 파일의 리소스들을 초기화시켜준다.
			DataSource ds = (DataSource)
					ctx.lookup("java:comp/env/jdbc/OracleDB"); //자바의 환경파일의 예약어라생각해. jdbc/OracleDB lookup한다.리소스들의 맴버변수를 안에 셋팅시켜준다. 
			conn = ds.getConnection(); //리소스들과 connection시켜준다. 한방에 하는 방법. dbcp.
		}catch(Exception e) {System.out.println(e.getMessage());}
		return conn;
	}
	
	public int insert(MemberDTO member) throws SQLException {
		Connection conn = null;  int result = 0; 
		PreparedStatement pstmt = null;
		String sql = "Insert Into member1 Values(?,?,?,sysdate)";
		
		try {conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			result = pstmt.executeUpdate();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally{
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		}
		return result;
	}
}
