package bo;

import dao.AdmininforDao;

public class AdmininforBo {
	AdmininforDao adDao = new AdmininforDao();
	
	public boolean ktDangNhap(String un, String pass) throws Exception {
		return adDao.ktDangNhap(un, pass);
	}
}
