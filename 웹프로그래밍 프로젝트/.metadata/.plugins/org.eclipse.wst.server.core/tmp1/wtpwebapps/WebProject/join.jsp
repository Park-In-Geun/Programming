<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
<center>
<%request.setCharacterEncoding("euc-kr");%>
<jsp:useBean id="join" class="school.School_member" scope="page"/>
<jsp:useBean id="dbconnect" class="school.DBConnection" scope="page"/>
<jsp:setProperty name="join" property="*"/>

<% if ( dbconnect.insertMember(join)){
			out.print("<strong>");
			out.print("<font size=20 color=red>가입되셨습니다.</font><p>");
			session.setAttribute("join","success");
			out.print("<table id=t1 border=1>");
			out.print("<tr>");
			out.print("<td align=center colspan=2>가입정보");
			out.print("<tr>");
			out.print("<td align=center>학교이름");
			out.print("<td>"+join.getSchool());
			out.print("<tr>");
			out.print("<td align=center>아이디(학번)");
			out.print("<td>"+join.getId_number());
			out.print("<tr>");
			out.print("<td align=center>이름");
			out.print("<td>"+join.getName());
			out.print("</table>");
			out.print("<a href=login.html>로그인 페이지로 이동</a><p>");
			out.print("<img src=1477184011028.gif alt=image width=200 height=200>");
			out.print("</strong>");
			}
		
	else{
			out.print("<font size=20 color=red>가입되지 않았습니다.</font><p>");
			out.print("<a href=join.html>회원가입페이지로 이동</a>");
			out.print("<p><img src=45.gif alt=image width=200 height=200>");
		}
		
%>

</center>
</body>
</html>