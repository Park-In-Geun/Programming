<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr" import="java.net.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#t1{
	border: 3px solid blue; /* t1클래스를 지정하고 t1 클래스의 속성을 테두리 3px의 solid blue 색상으로 지정합니다. */
	table-layout: auto; /* 셀 너비를 분량에 따라 자동으로 조절합니다. */
}
td{
	border: 2px solid black; /* td태그의 속성을 테두리 2px의 solid blue 색상으로 지정합니다. */
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%request.setCharacterEncoding("euc-kr"); /* euc-kr로 인코딩해서 한글을 나타나게 합니다. */
school.School_member login = (school.School_member)session.getAttribute("login"); /* school패키지의 School_member 클래스의 login 객체를 생성하고 session.getAttribute를 사용해 login의 값을 가져옵니다. */
%>
<center>
<strong>
<font size=20 color=red>수강 신청 목록입니다!</font> <!-- 글자 크기는 20 색상은 빨간색으로 지정합니다.  -->
<table id="t1" border="1"> <!-- style 태그에서 설정한 t1클래스의 속성을 table 태그에 적용합니다. -->
<tr> <!-- 1행 시작 -->
	<td>학교 <!-- 1열 -->
	<td><%=login.getSchool() %> <!-- 2열의 내용을 login.getSchool을 사용해 입력받은 정보를 출력합니다. -->
<tr> <!-- 2행 시작 -->
	<td>아이디(학번) <!-- 1열 -->
	<td><%=login.getId_number() %> <!-- 2열의 내용을 login.getId_number을 사용해 입력받은 정보를 출력합니다. -->
<tr> <!-- 3행 시작 -->
	<td>이름</td> <!-- 1열 -->
	<td><%=login.getName() %></td> <!-- 2열의 내용을 login.getName을 사용해 입력받은 정보를 출력합니다. -->
<tr> <!-- 4행 시작 -->
	<td>과목</td> <!-- 1열 -->
	<td> <!-- 2열을 입력받은 subject값을 subjects 배열에 저장하고 반복문을 사용해 출력합니다. -->
	<%
  	 String subjects[] = request.getParameterValues("subject");
   		for(String subject : subjects){
      		out.println(subject); 
      }
     %>
   	</td>
</table><p>
<img src="1475413835329.gif" alt=image width=200 height=200> <!-- img태그를 사용해   너비 200 높이 200으로 크기를 적용하고 이미지를 삽입합니다. -->
</strong>
</center>
</body>
</html>