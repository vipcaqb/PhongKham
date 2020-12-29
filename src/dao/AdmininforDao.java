package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdmininforDao {
	DBContext db = new DBContext();
	
	public boolean ktDangNhap (String un, String pass) throws Exception {
		db.KetNoi();
		String sql = "SELECT * from ADMININFOR WHERE [User] = ? AND Pass = ?";
		System.out.println(un + " "+ pass);
		PreparedStatement cmd = db.cn.prepareStatement(sql);
		cmd.setNString(1, un);
		cmd.setNString(2, pass);;
		
		ResultSet rs = cmd.executeQuery();
		
		if(rs.next()) {
			return true;
		}
		return false;
	}
}
