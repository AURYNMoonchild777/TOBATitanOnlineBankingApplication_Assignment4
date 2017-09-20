<%@page import="java.util.GregorianCalendar, java.util.Calendar" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        
        <% 
            GregorianCalendar currentDate = new GregorianCalendar();;
            int currentYear = currentDate.get(Calendar.YEAR);                    
        %>
       
        
        <p> &copy; Copyright <%= currentYear %> Brad Corser Universal </p>       
        
    </body>
</html>
