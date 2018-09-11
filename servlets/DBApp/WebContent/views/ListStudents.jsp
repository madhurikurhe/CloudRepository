<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.techlabs.model.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Show All Students</title>
</head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>Student Id</th>
                <th>Student Name</th>
                
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
        			<%
				ArrayList<Student> student = new ArrayList<Student>();
				if (request.getAttribute("stud") != null) {
					student = (ArrayList<Student>) request.getAttribute("stud");
				}
			%>
        
            <c:forEach items="${student}" var="s">
                <tr>
                    <td><c:out value="${s.id}" /></td>
                    <td><c:out value="${s.name}" /></td>
                    
                    <td><a href="UserController?action=edit&id=<c:out value="${s.id}"/>">Update</a></td>
                    <td><a href="UserController?action=delete&id=<c:out value="${s.id}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p><a href="UserController?action=insert">Add User</a></p>
</body>
</html>