<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<html ng-app="loginApp">
<head><title>Login</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body >
<div class="container" ng-controller="loginCtrl">
     <div class="dropdown btn btn-primary pull-right">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Select Language
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a id="zh">CHINESE &nbsp;&nbsp;<img border="0" src="${pageContext.request.contextPath}/resources/images/china.png" width="50" height="30"></a></li>
      <li><a id="es">SPANISH &nbsp;&nbsp;<img border="0" src="${pageContext.request.contextPath}/resources/images/spanish.png" width="50" height="30"></a></li>
      <li><a id="en">ENGLISH &nbsp;&nbsp;<img border="0" src="${pageContext.request.contextPath}/resources/images/english.png" width="50" height="30"></a></li>
      <li><a id="ru">RUSSION &nbsp;&nbsp;<img border="0" src="${pageContext.request.contextPath}/resources/images/russion.png" width="50" height="30"></a></li>
      <li><a id="ja">JAPANESE &nbsp;&nbsp;<img border="0" src="${pageContext.request.contextPath}/resources/images/japanese.png" width="50" height="30"></a></li>
      <li><a id="de">GERMAN &nbsp;&nbsp;<img border="0" src="${pageContext.request.contextPath}/resources/images/german.png" width="50" height="30"></a></li>
    </ul>
  </div>
 <center>
    
   <h1 id="loginheading">Login</h1>
     
     <!-- /login?error=true -->
     <c:if test="${param.error == 'true'}">
         <div style="color:red;margin:10px 0px;">
          
                <p id="loginfailmsg">Login Failed!!!</p><br />
                <p id="loginfailreson">Reason</p> :  ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
                 
         </div>
    </c:if>
       
   <h3 id="loginentermsg">Enter user name and password :</h3>  
     
   <form name='f' action="${pageContext.request.contextPath}/j_spring_security_check" method='POST'>
      <table>
         <tr>
            <td id="loginusername">User :</td>
            <td><input type='text' name='username' value=''></td>
         </tr>
         <tr>
         
         </tr>
         <tr>
            <td id="loginpassword">Password :</td>
            <td><input type='password' name='password' /></td>
         </tr>
         <tr>
            <td><input id="loginsubmit" name="submit" type="submit"/></td>
         </tr>
      </table>
  </form>
  </center>
      <script src="./resources/js/translate.js"></script>
</div>
</body>
</html>