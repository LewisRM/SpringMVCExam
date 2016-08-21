<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
 		<link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css">		
		<title></title>
		<style type="text/css">	
			.container-fluid{
				background-image: url(img/1.jpg);
				background-size: cover;
				background-repeat: no-repeat;
				width: 100vw; 
				height: 100vh; 
			}
			
			#num{
				font-size: 40px;
				font-family: cursive;
				padding: 30px;
				color: wheat;
			}
			
			#sys{
				font-size: 26px;
				font-family: cursive;
				padding: 30px;
				color: wheat;
			}
			
			
		</style>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-2" id="num">10960</div>
			</div>
			<div class="row">
				<div class="col-md-3 col-md-offset-2" id="sys">电影租赁管理系统</div>
			</div>	
			<div class="row">
				<div class="col-md-5 col-md-offset-2">
				<form action="loginAction.do" method="post" class="col-md-5" name="form1" >   
					 <div class="form-group">
    					<label for="exampleInputEmail1">用户名</label>
    						<input  class="form-control" type="text" name="firstName" placeholder="Name">
  					</div>
  					<div class="form-group">
    					<label for="exampleInputPassword1">密　码</label>
    					<input type="password" class="form-control" name="password" placeholder="Password">
  					</div>
  					<button type="button" class="btn btn-default" onclick="check()">登录</button>
				</form> 
				</div>  
				</div>
			</div>
				
		</div>
		
		
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
    
    <script type="text/javascript">
         function check(){
        	 if(document.forms.form1.firstName.value==""){
        		 alert("please write the firstName");
        		 document.forms.form1.firstName.focus();
        	 }else if(document.forms.form1.password.value==""){
        		 alert("please write the password");
        		 document.forms.form1.password.focus();
        	 }else{
        		 document.forms.form1.submit();
        		 
        	 }       	
         }
   </script>
	</body>
</html>
