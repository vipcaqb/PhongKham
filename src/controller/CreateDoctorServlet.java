package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.DoctorBean;
import bo.DoctorBo;

/**
 * Servlet implementation class CreateDoctorServlet
 */
@WebServlet("/adddoctor")
public class CreateDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateDoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		if(session.getAttribute("user")==null) {
			response.sendRedirect("login");
			return ;
		}
		RequestDispatcher rd = request.getRequestDispatcher("pages/adddoctor.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String add = request.getParameter("add");
		String phone = request.getParameter("phone");
		DoctorBean dr = new DoctorBean(1, name, add, phone);
		
		DoctorBo dbo = new DoctorBo();
		
		try {
			dbo.createDoctor(dr);
			response.sendRedirect("doctorlist");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
