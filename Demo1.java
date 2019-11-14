package day01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","mingge","123456");
		Statement state = conn.createStatement();
		
		state.execute("insert into user34 values(seq_user34_id.nextval,'马天海','666666')");
		
		state.close();
		conn.close();
		System.out.println("执行结束！");

	}

}