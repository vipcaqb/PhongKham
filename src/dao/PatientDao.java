package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bean.PatientBean;

public class PatientDao {
	DBContext db = new DBContext();
	public List<PatientBean> getPatient() throws Exception{
		List<PatientBean> patientList = new ArrayList<PatientBean>();
		db.KetNoi();
		String sql = "select * from Patient";
		PreparedStatement cmd= db.cn.prepareStatement(sql);
		
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			int patientID = rs.getInt(1);
			String patientName = rs.getNString(2);
			int sex =rs.getInt(3);
			Date birthday = rs.getDate(4);
			String address = rs.getNString(5);
			String phoneNumber = rs.getNString(6);
			
			patientList.add(new PatientBean(patientID, patientName, sex, birthday, address, phoneNumber));
		}
		
		return patientList;
	}
}
