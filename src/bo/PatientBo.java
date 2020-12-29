package bo;

import java.util.List;

import bean.PatientBean;
import dao.PatientDao;

public class PatientBo {
	PatientDao pDao = new PatientDao();
	
	public List<PatientBean> getPatient() throws Exception{
		return pDao.getPatient();
	}
}
