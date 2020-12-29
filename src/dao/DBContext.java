package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
	public static String url = "jdbc:sqlserver://DESKTOP-I013DUI\\SQLEXPRESS:1433;databaseName=PhongKham";
	public static String un = "sa";
	public static String pass = "123";
	public Connection cn;
	public void KetNoi() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		cn = DriverManager.getConnection(url,un,pass);
		System.out.println("Ket noi thanh cong!");
	}
}
