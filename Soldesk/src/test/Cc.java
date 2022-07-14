package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Cc {
	public static Connection con;
	
	public static Connection get() {
		Connection conn = null;
		
		try {
			String id = "C##SCOTT";
			String pw = "1234";
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url, id, pw);
			System.out.println("데이터베이스에 연결됐습니다.");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("로딩 실패");
		}
		
		return conn;
	}
	
}
