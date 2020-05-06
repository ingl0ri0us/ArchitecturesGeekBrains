<%@page import="java.util.List" %>
<%@page import="Lesson_7.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Student Record</title>
</head>
<body>
<% List<Employee> employees = (List<Employee>) request.getAttribute("employees"); %>
<table border="1" style="width: 50%" height="50%">
    <thead>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    </thead>
    <tbody>
    <% for (Employee employee : employees) { %>
    <tr>
        <td><%=employee.getId()%>
        </td>
        <td><%=employee.getFirstName()%>
        </td>
        <td><%=employee.getLastName()%>
        </td>
    </tr>
    <%} %>
    </tbody>

</table>
</body>
</html>