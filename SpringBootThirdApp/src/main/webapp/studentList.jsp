<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <body bgcolor="pink">
        <h1>This is Student Deatils...., </h1>
        <div>
            <table border="1"
            align="center"
            cellspacing="10px"
            cellpadding="10px">
           <tr>
            <th>StudentId</th>
            <th>StudentName</th>
            <th>StudentMarks</th>
           </tr>
           <c:forEach items="${students}" var="stu">
<tr>
    <td>${stu.sId}</td>
    <td>${stu.sName}</td>
    <td>${stu.sMarks}</td>
</tr>


           </c:forEach>


            </table>
        </div>
    </body>
</html>