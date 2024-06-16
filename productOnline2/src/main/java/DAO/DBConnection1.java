package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection1 {

	
	private  static Connection con;
	
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sam","bhavesh");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return con;
	}
}
