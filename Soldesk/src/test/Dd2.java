package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost/xe";
		String que = "insert into emp(empno,ename,job,sal) values(?, ?, ?, ?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "C##SCOTT", "TIGER");
			pstmt = con.prepareStatement(que);
			pstmt.setInt(1, 1234);
			pstmt.setString(2, "JACK");
			pstmt.setString(3, "ANALYST");
			pstmt.setInt(4, 1300);
			int n = pstmt.executeUpdate();
			System.out.println(n>0 ? "성공" : "실패");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
