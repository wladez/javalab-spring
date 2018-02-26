<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title><spring:message code="form.userlist.name"/></title>
</head>
<body>

<h3><spring:message code="form.table.userlist.title"/></h3>

<table border="1">
    <tr>
        <th><spring:message code="form.table.userlist.col.id"/></th>
        <th><spring:message code="form.table.userlist.col.firstname"/></th>
        <th><spring:message code="form.table.userlist.col.lastname"/></th>
    </tr>
    <c:forEach var="x" items="${userList}">
        <tr>
            <td>${x.id}</td>
            <td>${x.firstName}</td>
            <td>${x.lastName}</td>
        </tr>
    </c:forEach>
</table>

<hr/>

<a href="http://localhost:8080/adduser.form"><spring:message code="form.adduser.name"/></a>

</body>
</html>