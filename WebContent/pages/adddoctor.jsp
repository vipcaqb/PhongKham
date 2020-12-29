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
<title>Thêm bác sĩ</title>
</head>
<body>
	<%@include file="/pages/shared/topmenu.jsp"%>
	<div class='row mt-5'>
		<%@include file="/pages/shared/leftmenu.jsp"%>
		<section class='col-md-9'>
			<div class='col-md-8'>
			<h3>Create new doctor</h3>
			<form action='adddoctor' method='post'>
                <div class='form-group'>
                    <label for="e1">Doctor Name</label>
                    <input id='e1' class="form-control" type="text" name='name' required="required">
                </div>
                <div class='form-group'>
                    <label for="e2">Address</label>
                    <input id='e2' class="form-control" type="text" name='add' required="required">
                </div>
                <div class='form-group'>
                    <label for="e3">Phone</label>
                    <input id='e3' class="form-control" type="text" name='phone' required="required">
                </div>
                <input class='btn btn-success' type='submit' value='Create'>
            </form>
            </div>
		</section>
	</div>
</body>
</html>