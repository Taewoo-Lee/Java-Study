package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dd1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		String que = "select * from emp";
		conn = Cc.get();
		psmt = conn.prepareStatement(que);
		rs = psmt.executeQuery();

		while (rs.next()) {
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			Date hiredate = rs.getDate("hiredate");
			int sal = rs.getInt("sal");
			int comm = rs.getInt("comm");
			int deptno = rs.getInt("deptno");
			System.out.println(empno + " " + ename + " " + job);
		}

		rs.close();
		psmt.close();
		conn.close();
	}

}
