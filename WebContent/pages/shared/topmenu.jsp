<%@ page language="java" contentType="text/html; charset=uft-8"
    pageEncoding="utf-8"%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <!-- Brand/logo -->
        <a class="navbar-brand" href="#">Trang chủ</a>
        <%
        	if(session.getAttribute("user")!=null){
        		String user = (String)session.getAttribute("user");
        		out.print("<a style='color:white; margin-left:30px'> Hi: "+user+" </a>");
        	}
        %>
      </nav>