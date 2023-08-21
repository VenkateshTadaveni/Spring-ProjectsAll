<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
    <h1>Person List data...,</h1>
<div>
<table border="1">
    <tr>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Email</th>

    </tr>

    <c:forEach items="${persons}" var="person">
<tr>
    <td>${person.firstName}</td>
    <td>${person.lastName}></td>
    <td>${person.email}</td>
</tr>
    </c:forEach>


</table>
</div>

</body>
</html>