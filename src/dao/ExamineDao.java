package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.ExamineBean;

public class ExamineDao {
	public List<ExamineBean> getExamine(int dID) throws Exception{
		DBContext db = new DBContext();
		db.KetNoi();
		
		String sql = "select * from Patient join Examine on Patient.PatientID = Examine.PatientID where Examine.DoctorID = ?";
		PreparedStatement cmd = db.cn.prepareStatement(sql);
		cmd.setInt(1, dID);
		
		ResultSet rs = cmd.executeQuery();
		List<ExamineBean> eList = new ArrayList<ExamineBean>();
		while(rs.next()) {
			eList.add(new ExamineBean(rs.getInt("patientID"), rs.getInt("doctorID"), rs.getDate("examineDate"), rs.getNString("result"), rs.getNString("treatments")));
		}
		return eList;
	}
}
