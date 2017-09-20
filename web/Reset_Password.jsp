<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
    </head>
    <body>
        <h1>Reset Password</h1>
        
        
<form method="post" action="Reset_Password.jsp">
    <table>
        <tr><td>Current Password</td><td><input type="password" name="current" ></td></tr>
        
        <tr><td>New Password</td><td><input type="password" name="new"></td></tr>
        
        <tr><td>Confirm Password</td><td><input type="password" name="confirm"></td></tr>
        
        <tr><td><input type="submit" value="Change Password"></td></tr>
    </table>
</form>


        <c:import url="footer.jsp" />
    </body>
</html>
