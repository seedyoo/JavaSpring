package human.dao;
import java.sql.*;

// 회원테이블에 접속하는 기능
public class FaqDao {
		
	public static String user = "jsp";
	public static String passwd = "123456";
	public static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	public static Connection conn = null;
	public static Statement stmt = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet rs = null;
	
	public void getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);			
		}catch(Exception e) {
			System.out.println("오라클접속에러: " + e.getMessage());
		}
	}
	
	public void closeConn() {
		try {
			if(conn!=null) conn.close();
			if(stmt!=null) stmt.close();
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
		}catch(SQLException se) {
			System.out.println("오라클닫기에게: " + se.getMessage());
		}
	}
	
	public void listMemberAll() {
		
		System.out.println("회원목록을 가져옴");
		
		getConnect();
		// 쿼리작업
		
		closeConn();
	}
	
	public String getQseq() {
		
		System.out.println("회원 목록 수를 가져옴");
		String rst = null;
		
		getConnect();
		// 쿼리작업
		try {
			String sql = "SELECT QSEQ, SUBJECT, CONTENT, REPLY, ID FROM QNA";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				rst =  rs.getString("QSEQ");
			}
		}catch(SQLException se) {
			System.out.println("getMemberCount 쿼리에러: " + se.getMessage());
		}
		
		closeConn();
		return rst;
	}
	
	public String getSubject() {
		
		System.out.println("회원 목록 수를 가져옴");
		String rst = null;
		
		getConnect();
		// 쿼리작업
		try {
			String sql = "SELECT QSEQ, SUBJECT, CONTENT, REPLY, ID FROM QNA";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {

				rst =  rs.getString("SUBJECT");
//				rst =  rs.getString("CONTENT");
//				rst =  rs.getString("REPLY");
//				rst =  rs.getString("ID");
			}
		}catch(SQLException se) {
			System.out.println("getMemberCount 쿼리에러: " + se.getMessage());
		}
		
		closeConn();
		return rst;
	}
	
	public String getContent() {
		
		System.out.println("회원 목록 수를 가져옴");
		String rst = null;
		
		getConnect();
		// 쿼리작업
		try {
			String sql = "SELECT QSEQ, SUBJECT, CONTENT, REPLY, ID FROM QNA";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {

				rst =  rs.getString("CONTENT");
//				rst =  rs.getString("REPLY");
//				rst =  rs.getString("ID");
			}
		}catch(SQLException se) {
			System.out.println("getMemberCount 쿼리에러: " + se.getMessage());
		}
		
		closeConn();
		return rst;
	}

	public String getReply() {
		
		System.out.println("회원 목록 수를 가져옴");
		String rst = null;
		
		getConnect();
		// 쿼리작업
		try {
			String sql = "SELECT QSEQ, SUBJECT, CONTENT, REPLY, ID FROM QNA";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {

				rst =  rs.getString("REPLY");

			}
		}catch(SQLException se) {
			System.out.println("getMemberCount 쿼리에러: " + se.getMessage());
		}
		
		closeConn();
		return rst;
	}
	
	public String getId() {
		
		System.out.println("회원 목록 수를 가져옴");
		String rst = null;
		
		getConnect();
		// 쿼리작업
		try {
			String sql = "SELECT QSEQ, SUBJECT, CONTENT, REPLY, ID FROM QNA";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {

				rst =  rs.getString("Id");

			}
		}catch(SQLException se) {
			System.out.println("getMemberCount 쿼리에러: " + se.getMessage());
		}
		
		closeConn();
		return rst;
	}
	// 여러개의 디비 접속하는 함수

}