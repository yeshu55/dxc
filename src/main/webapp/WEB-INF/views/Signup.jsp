<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>User Signup Form</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%">
   
    <tr>
     <td>First Name</td>
     <td><input type="text" name="firstName" /></td>
    </tr>
    
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lastName" /></td>
    </tr>
    
    <tr>
     <td>Contact </td>
     <td><input type="text" name="contact" /></td>
    </tr>

    <tr>
     <td>Email</td>
     <td><input type="text" name="email" /></td>
    </tr>
    <tr>
    
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
    
   </table>
   <button type="sign up" value="Sign Up">sign up</button>
  </form>
 </div>
</body>
</html>