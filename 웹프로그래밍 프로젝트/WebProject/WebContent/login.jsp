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
<%request.setCharacterEncoding("euc-kr");%> <!-- euc-kr로 인코딩해서 한글을 나타나게 합니다. -->
<jsp:useBean id="login" class="school.School_member" scope="page"/> <!-- jsp:useBean태그를 사용해 school패키지에 있는 School_member클래스를  login이란 이름을 적용하고 사용할 수 있게 합니다. -->
<jsp:useBean id="dbconnect" class="school.DBConnection" scope="page"/> <!-- jsp:useBean을 사용하여 school패키지에 있는 DBConnection 클래스를 dbconnect라는 이름을 적용하고 사용할 수 있게 합니다. -->
<jsp:setProperty name="login" property="*"/> <!-- setProperty를 이용해  HTML 폼 값을 빈즈 클래스 멤버변수로 매핑합니다. -->

<% if ( dbconnect.isMember(login.getId_number(),login.getPassword())){ /* dbconnect.isMember에 login.getId_number와 login.getPassword를 넣고 조건을 확인합니다. */
	        school.School_member sm = dbconnect.getMember(login.getId_number(),login.getPassword()); /* school패키지의 School_member클래스의 sm객체를 생성하고 dbconnect.getMember에 login.getId_number()와 login.getPassword를 준 값을 저장합니다. */
			out.print("<center>"); /* 중앙 정렬합니다. */
			out.print("<font size=20 color=red>"); /* 글자 크기는 20 색상은 빨간색으로 지정합니다. */
			out.print("로그인 성공!<p>"); /* 줄바꿈 합니다.  */
			out.print("</font>"); 
			session.setAttribute("login",sm); /* session을 사용해 login에 sm 객체의 값을 줍니다. */
			out.println("<a href=subject.html>과목선택 페이지로 이동</a>"); /* a태그를 사용해 클릭시 subject.html로 가도록 설정합니다. */
			out.print("<p><img src=1471189648017.gif alt=image width=200 height=200>"); /* 줄바꿈 해주고 img태그를 사용해   너비 200 높이 200으로 크기를 적용하고 이미지를 삽입합니다. */
			out.print("</center>");
			}
		
	else{
			out.print("<center>");
			out.print("<font size=20 color=red>"); /* 글자 크기는 20 색상은 빨간색으로 지정합니다. */
			out.print("로그인 실패!<p>");/* 줄바꿈 합니다. */
			out.print("</font>");
			out.print("<a href=join.html>회원가입페이지로 이동</a>"); /* a태그를 사용해 클릭시 join.html로 가도록 설정합니다. */
			out.print("<p><img src=4.gif alt=image width=200 height=200>"); /* 줄바꿈 해주고 img태그를 사용해   너비 200 높이 200으로 크기를 적용하고 이미지를 삽입합니다. */
			out.print("</center>");
		}
		
%>
</body>
</html>