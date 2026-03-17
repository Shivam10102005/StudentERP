<%@ page import="java.util.*,com.erp.dao.StudentDAO,com.erp.model.Student" %>

<html>
<head>
    <title>View Students</title>
</head>

<body>

<h2>All Students</h2>

<table border="1">

    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Roll</th>
        <th>Course</th>
        <th>Year</th>
        <th>Semester</th>
        <th>Delete</th>
    </tr>

    <%
        StudentDAO dao=new StudentDAO();

        List<Student> list=dao.getAllStudents();

        for(Student s:list){
    %>

    <tr>
        <td><%=s.getId()%></td>
        <td><%=s.getName()%></td>
        <td><%=s.getRoll()%></td>
        <td><%=s.getCourse()%></td>
        <td><%=s.getYear()%></td>
        <td><%=s.getSemester()%></td>

        <td>
            <a href="student?action=delete&id=<%=s.getId()%>">Delete</a>
        </td>

    </tr>

    <%
        }
    %>

</table>

</body>
</html>