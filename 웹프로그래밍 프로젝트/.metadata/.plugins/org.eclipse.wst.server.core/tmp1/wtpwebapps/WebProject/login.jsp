<%@page import="school.School_member"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("euc-kr");%>
<jsp:useBean id="login" class="school.School_member" scope="page"/>
<jsp:useBean id="dbconnect" class="school.DBConnection" scope="page"/>
<jsp:setProperty name="login" property="*"/>

<% if ( dbconnect.isMember(login.getId_number(),login.getPassword())){
	        school.School_member sm = dbconnect.getMember(login.getId_number(),login.getPassword());
			out.print("<center>");
			out.print("<font size=20 color=red>");
			out.print("로그인 성공!<p>");
			out.print("</font>");
			session.setAttribute("login",sm);
			out.println("<a href=subject.html>과목선택 페이지로 이동</a>");
			out.print("<p><img src=1471189648017.gif alt=image width=200 height=200>");
			out.print("</center>");
			}
		
	else{
			out.print("<center>");
			out.print("<font size=20 color=red>");
			out.print("로그인 실패!<p>");
			out.print("</font>");
			out.print("<a href=join.html>회원가입페이지로 이동</a>");
			out.print("<p><img src=4.gif alt=image width=200 height=200>");
			out.print("</center>");
		}
		
%>
</body>
</html>