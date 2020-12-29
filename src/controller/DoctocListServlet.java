package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DoctorBean;
import bean.ExamineBean;
import bo.DoctorBo;
import bo.ExamineBo;

/**
 * Servlet implementation class DoctocListServlet
 */
@WebServlet("/doctorlist")
public class DoctocListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctocListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		DoctorBo dBo = new DoctorBo();
		try {
			//lay danh sach doctor
			System.out.println("ok1");
			List<DoctorBean> dList = dBo.getDoctorList();
			
			int doctorId = 0;
			if(request.getParameter("doctorid")!=null) {
				doctorId = Integer.parseInt(request.getParameter("doctorid"));
			}
			else {
				if(dList.size()>0) {
					doctorId = dList.get(0).getDoctorID();
				}
			}
			System.out.println("ok2");
			// lay du lieu examine
			ExamineBo eBo = new ExamineBo();
			List<ExamineBean> eList = eBo.getExamine(doctorId);
			System.out.println("dID: "+ doctorId);
			//set du lieu de gui qua jsp
			request.setAttribute("dList", dList);
			request.setAttribute("eList", eList);
			request.setAttribute("dID", doctorId);
			
			RequestDispatcher rd = request.getRequestDispatcher("pages/benhan-list.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
