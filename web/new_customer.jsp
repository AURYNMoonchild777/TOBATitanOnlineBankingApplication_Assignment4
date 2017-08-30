

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> New Customer Registration</title>
    </head>
    
    
    <body>
        <h1>New Customer Registration</h1>
        
         <form action="new_customer.jsp" method="post">

    <label><b>First Name</b></label>
    <input type="text" name="First Name" required>

    <label><b>Last Name</b></label>
    <input type="text" name="Last Name" required>
 
    <label><b>Phone Number</b></label>
    <input type="text" name="Phone Number" required>

    <label><b>Address</b></label>
    <input type="text" name="Address" required>
    
    <label><b>City</b></label>
    <input type="text" name="City" required>

    <label><b>State</b></label>
    <input type="text" name="State" required>
    
     <label><b>Zip Code</b></label>
    <input type="text" name="Zip Code" required>

    <label><b>Email</b></label>
    <input type="email" name="Email" required>
       
    <button type="submit">Join</button>
    
        </form>
        
        
        
        
        
    </body>
</html>
