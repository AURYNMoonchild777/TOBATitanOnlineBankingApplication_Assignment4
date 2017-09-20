

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Activity</title>
    </head>
    <body>
        <h1>Account Activity</h1>
   
<br><br><br><br>
<table style="border:1px solid #000000;">
<%
if(session.getAttribute("uname")!=null && session.getAttribute("uname")!="")
{
String user = session.getAttribute("uname").toString();
%>
<tr><td align="center"><h1>Welcome <b><%= String firstName %> <%= String lastName %></b></h1></td></tr>
<%
}
%>
</table>

<c:import url="footer.jsp" />
</body>

    
</html>
