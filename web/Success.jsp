<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success!</title>
    </head>
    <body>
        
     
    <h1>Success!</h1>
  
    <table>
        <tr>
           <td>${user.FirstName}</td>
           <td>${user.LastName}</td>   
           <td>${user.Username}</td>
           <td>${user.Password}</td>
           <td>${user.PhoneNumber}</td>
           <td>${user.Address}</td>
           <td>${user.City}</td>
           <td>${user.State}</td>
           <td>${user.ZipCode}</td>
           <td>${user.Email}</td>
        </tr>
    </table>
    
    
    
   <% String message = (String)request.getAttribute("message"); %>
    
   


<c:import url="footer.jsp" />
        
    </body>
</html>
