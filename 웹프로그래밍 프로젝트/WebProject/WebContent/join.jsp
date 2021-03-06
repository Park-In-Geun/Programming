<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
<center>
<%request.setCharacterEncoding("euc-kr");%> <!-- euc-kr로 인코딩해서 한글을 나타나게 합니다. -->
<jsp:useBean id="join" class="school.School_member" scope="page"/> <!-- jsp:useBean태그를 사용해 school패키지에 있는 School_member클래스를 join이란 이름을 적용하고 사용할 수 있게 합니다. -->
<jsp:useBean id="dbconnect" class="school.DBConnection" scope="page"/> <!-- jsp:useBean을 사용하여 school패키지에 있는 DBConnection 클래스를 dbconnect라는 이름을 적용하고 사용할 수 있게 합니다. -->
<jsp:setProperty name="join" property="*"/> <!-- setProperty를 이용해  HTML 폼 값을 빈즈 클래스 멤버변수로 매핑합니다. -->

<% if ( dbconnect.insertMember(join)){ /* dbconnect의 insertMember함수에 join의 값을 넣어서 조건을 확인합니다.*/
			out.print("<strong>"); /* 글씨체를 굵게 합니다. */
			out.print("<font size=20 color=red>가입되셨습니다.</font><p>"); /* 글자 크기는 20 색상은 빨간색으로 지정합니다. */ 
			session.setAttribute("join","success"); /* session을 사용해 join에 success라는 값을 줍니다. */
			out.print("<table id=t1 border=1>");  /* style 태그에서 설정한 t1클래스의 속성을 table 태그에 적용합니다. */
			out.print("<tr>"); /* 1행 시작 */
			out.print("<td align=center colspan=2>가입정보"); /* 1열의 내용을 중앙정렬하고 1,2열을 병합합니다. */
			out.print("<tr>"); /* 2행 시작 */
			out.print("<td align=center>학교이름"); /* 1열의 내용을 중앙정렬합니다. */
			out.print("<td>"+join.getSchool()); /* 2열의 내용을 join.getSchool()을 사용해 입력받은 값을 출력합니다. */
			out.print("<tr>"); /* 3행 시작 */
			out.print("<td align=center>아이디(학번)"); /* 1열의 내용을 중앙정렬합니다. */ 
			out.print("<td>"+join.getId_number()); /* 2열의 내용을 join.getId_number을 사용해 입력받은 값을 출력합니다. */
			out.print("<tr>"); /* 4행 시작 */
			out.print("<td align=center>이름"); /* 1열의 내용을 중앙정렬합니다. */
			out.print("<td>"+join.getName()); /* 2열의 내용을 join.getName()을 사용해 입력받은 값을 출력합니다. */
			out.print("</table>"); /* table태그를 종료합니다. */
			out.print("<a href=login.html>로그인 페이지로 이동</a><p>"); /* a태그를 사용해  클릭시 login.html로 보내줍니다.  */
			out.print("<img src=1477184011028.gif alt=image width=200 height=200>"); /* 이미지 태그를 사용해 너비 200 높이 200으로 크기를 적용하고 이미지를 삽입합니다. */
			out.print("</strong>"); /* strong 태그를 끝냅니다. */
			}
		
	else{
			out.print("<font size=20 color=red>가입되지 않았습니다.</font><p>"); /* 글자 크기는 20 색상은 빨간색으로 지정합니다. */
			out.print("<a href=join.html>회원가입페이지로 이동</a>"); /* a태그를 사용해 클릭시 join.html로 보내줍니다. */
			out.print("<p><img src=45.gif alt=image width=200 height=200>"); /* 줄을 바꾼후 img태그를 사용해   너비 200 높이 200으로 크기를 적용하고 이미지를 삽입합니다. */
		}
		
%>

</center>
</body>
</html>