<%@page import="bean.ExamineBean"%>
<%@page import="bean.DoctorBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.PatientBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=uft-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-3.5.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<title>Danh sách bệnh án</title>
</head>
<body>
	<%
	List<DoctorBean> dList=null;
	List<ExamineBean> eList=null;
		if (request.getAttribute("dList") != null) {
		dList = (ArrayList<DoctorBean>) request.getAttribute("dList");
	}

	if (request.getAttribute("eList") != null) {
		 eList = (ArrayList<ExamineBean>) request.getAttribute("eList");
	}
	int dID = 0;
	dID = (int)request.getAttribute("dID");
	%>
	<%@include file="/pages/shared/topmenu.jsp"%>
	<div class='row mt-5'>
		<%@include file="/pages/shared/leftmenu.jsp"%>
		<section class='col-md-9'>
			<div class="h3">Danh sách bác sĩ</div>
			<div class="row">

				<div class="col-md-3">

					<ul class="list-group">
						<%
							if(dList!=null){
								for (DoctorBean item : dList) {
							%>
						<a href="doctorlist?doctorid=<%=item.getDoctorID()%>"><li
							class="list-group-item list-group-item-action <% 
							if(item.getDoctorID()==dID) {out.print(" active ");};
							%>">
							<%=item.getDoctorName()%></li></a>
						<%
								}
							}
						%>
					</ul>
				</div>
				<div class="col-md-9">
					<table class='table table-striped table-bordered'>
						<thead>
							<tr>
								<th>PatientID</th>
								<th>ExamineDate</th>
								<th>Results</th>
								<th>Treatments</th>
							</tr>
						</thead>
						<tbody>
							<%
								if (request.getAttribute("eList") != null) {
									for(ExamineBean i : eList){
							%>
							<tr>
								<td><a href="sua.html"><%=i.getPatientID() %></a></td>
								<td><%=i.getExamineDate() %></td>
								<td><%=i.getResult() %></td>
								<td><%=i.getTreatments()%></td>
							</tr>
							<%
								}
								}
							%>

						</tbody>
					</table>
				</div>
			</div>
		</section>
	</div>
</body>
</html>