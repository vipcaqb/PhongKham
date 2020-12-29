package bo;

import java.util.List;

import bean.ExamineBean;
import dao.ExamineDao;

public class ExamineBo {
	ExamineDao eDao = new ExamineDao();
	
	public List<ExamineBean> getExamine(int dID) throws Exception{
		return eDao.getExamine(dID);
	}
}
