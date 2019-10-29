<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students</title>
</head>
<body>
  <c:forEach var="stud" items="${students}">
  
 <h2><c:out value="${stud.id}" /></h2>
 <h2><c:out value="${stud.name}" /></h2>
 <h2><c:out value="${stud.department}" /></h2>
<h2>--------------------------------</h2>
  </c:forEach>
</body>
</html>