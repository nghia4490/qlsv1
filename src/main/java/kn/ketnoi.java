package kn;

import java.sql.Connection;
import java.sql.DriverManager;

public class ketnoi {

	public static Connection getconnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv","root","");
			System.out.println("kn ok");
			

			
		} catch (Exception e) {
			System.out.println(e);
		}

		return con;
	}
//	public static void main(String[] args) {
//		getconnection();
//	}

}
