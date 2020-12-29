package bo;

import java.util.List;

import bean.DoctorBean;
import dao.DoctorDao;

public class DoctorBo {
	DoctorDao dDao = new DoctorDao();
	public List<DoctorBean> getDoctorList() throws Exception{
		return dDao.getDoctorList();
	}

	public void createDoctor(DoctorBean dr) throws Exception {
		dDao.createDoctor(dr);
	}
}
