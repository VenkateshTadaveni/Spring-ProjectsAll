<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <body bgcolor="pink">
        <h1>This is Teachers Deatils...., </h1>
        <div>
            <table border="1"
            align="center"
            cellspacing="10px"
            cellpadding="10px">
           <tr>
            <th>TeacherName</th>
            <th>Subject</th>
            <th>MobileNO</th>
           </tr>
           <c:forEach items="${teachers}" var="teacher">
<tr>
    <td>${teacher.name}</td>
    <td>${teacher.subject}</td>
    <td>${teacher.mobileno}</td>
</tr>


           </c:forEach>


            </table>
        </div>
    </body>
</html>