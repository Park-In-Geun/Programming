<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr" import="java.net.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#t1{
	border: 3px solid blue; /* t1Ŭ������ �����ϰ� t1 Ŭ������ �Ӽ��� �׵θ� 3px�� solid blue �������� �����մϴ�. */
	table-layout: auto; /* �� �ʺ� �з��� ���� �ڵ����� �����մϴ�. */
}
td{
	border: 2px solid black; /* td�±��� �Ӽ��� �׵θ� 2px�� solid blue �������� �����մϴ�. */
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%request.setCharacterEncoding("euc-kr"); /* euc-kr�� ���ڵ��ؼ� �ѱ��� ��Ÿ���� �մϴ�. */
school.School_member login = (school.School_member)session.getAttribute("login"); /* school��Ű���� School_member Ŭ������ login ��ü�� �����ϰ� session.getAttribute�� ����� login�� ���� �����ɴϴ�. */
%>
<center>
<strong>
<font size=20 color=red>���� ��û ����Դϴ�!</font> <!-- ���� ũ��� 20 ������ ���������� �����մϴ�.  -->
<table id="t1" border="1"> <!-- style �±׿��� ������ t1Ŭ������ �Ӽ��� table �±׿� �����մϴ�. -->
<tr> <!-- 1�� ���� -->
	<td>�б� <!-- 1�� -->
	<td><%=login.getSchool() %> <!-- 2���� ������ login.getSchool�� ����� �Է¹��� ������ ����մϴ�. -->
<tr> <!-- 2�� ���� -->
	<td>���̵�(�й�) <!-- 1�� -->
	<td><%=login.getId_number() %> <!-- 2���� ������ login.getId_number�� ����� �Է¹��� ������ ����մϴ�. -->
<tr> <!-- 3�� ���� -->
	<td>�̸�</td> <!-- 1�� -->
	<td><%=login.getName() %></td> <!-- 2���� ������ login.getName�� ����� �Է¹��� ������ ����մϴ�. -->
<tr> <!-- 4�� ���� -->
	<td>����</td> <!-- 1�� -->
	<td> <!-- 2���� �Է¹��� subject���� subjects �迭�� �����ϰ� �ݺ����� ����� ����մϴ�. -->
	<%
  	 String subjects[] = request.getParameterValues("subject");
   		for(String subject : subjects){
      		out.println(subject); 
      }
     %>
   	</td>
</table><p>
<img src="1475413835329.gif" alt=image width=200 height=200> <!-- img�±׸� �����   �ʺ� 200 ���� 200���� ũ�⸦ �����ϰ� �̹����� �����մϴ�. -->
</strong>
</center>
</body>
</html>