package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.DoctorBean;

public class DoctorDao {
	DBContext db = new DBContext();

	public void createDoctor(DoctorBean dr) throws Exception {
		db.KetNoi();
		String sql = "INSERT INTO Doctor(DoctorName,Address,PhoneNumber) VALUES (?,?,?)";
		PreparedStatement cmd = db.cn.prepareStatement(sql);
		cmd.setNString(1, dr.getDoctorName());
		cmd.setNString(2, dr.getAddress());
		cmd.setNString(3, dr.getPhoneNumber());

		cmd.execute();
		db.cn.close();
	}

	public List<DoctorBean> getDoctorList() throws Exception {
		db.KetNoi();
		String sql = "select * from Doctor";
		PreparedStatement cmd = db.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		List<DoctorBean> dList = new ArrayList<DoctorBean>();
		while (rs.next()) {
			dList.add(new DoctorBean(rs.getInt("doctorID"), rs.getNString("doctorName"), rs.getNString("address"),
					rs.getNString("phoneNumber")));
		}
		return dList;
	}
}
