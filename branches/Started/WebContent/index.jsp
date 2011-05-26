<%@page import="org.hibernate.Session"%>
<%@page import="dao.SessionFactory"%>
<%@page import="dao.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Session s = SessionFactory.createSession();
	

	User u = new User();
	u.setCpf("00000000000");
	u.setName("Franzé Jr.");
	s.getTransaction().begin();
	s.save(u);
	s.getTransaction().commit();



%>



</body>
</html>