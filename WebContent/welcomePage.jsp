<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
  <font face="verdana" size="2">
     ${welcomeMessage}
  </font>
  <form action="login" method="post">
  <div class="container"> 
   Username :<input type="text" placeholder="Enter Username" name="username" required>   
     </div> 
     <div class="container">   
    Password :<input type="password" placeholder="Enter Password" name="password" required>     
     </div>
     <div>
     <button type="submit" class="btn btn-success">Login</button>
     
     </div>  
     </form> 
</body>
</html>
 