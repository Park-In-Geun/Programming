<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr" import="java.net.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#t1{
	border: 3px solid blue;
	table-layout: auto;
}
td{
	border: 2px solid black;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%request.setCharacterEncoding("euc-kr");
school.School_member login = (school.School_member)session.getAttribute("login");
%>
<center>
<strong>
<font size=20 color=red>수강 신청 목록입니다!</font>
<table id="t1" border="1">
<tr>
	<td>학교
	<td><%=login.getSchool() %>
<tr>
	<td>아이디(학번)
	<td><%=login.getId_number() %>
<tr>
	<td>이름</td>
	<td><%=login.getName() %></td>
<tr>
	<td>과목</td>
	<td>
	<%
  	 String subjects[] = request.getParameterValues("subject");
   		for(String subject : subjects){
      		out.println(subject); 
      }
     %>
   	</td>
</table><p>
<img src="1475413835329.gif" alt=image width=200 height=200>
</strong>
</center>
</body>
</html>