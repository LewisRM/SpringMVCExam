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
		    *{
		    	margin: 0;
				padding: 0;
		    }
			.container-fluid{
				/*background-image: url(1.jpg);*/
				background-color: #aaeeff;
				background-size: cover;
				background-repeat: no-repeat;
				width: 100vw; 
				height: 100vh; 
			}
			
			.num{
				font-size: 40px;
				font-family: cursive;
				padding: 5px;
				margin-left: 30px;
				margin-bottom: 10px;
				color: #001111;
			}
			
			#logout{
				font-size: 26px;
				font-family: cursive;
				padding: 5px;
				margin-right: 30px;
				float: right;
				display: block;
				color: #001111;
			}
			
			#sys ul{
				list-style: none;
			}
			
			#sys ul li{
				clear: both;
				margin-left: 32px;
			}
			
			#sys ul li a{
				text-decoration: none;
				font-size: 22px;
				font-family: cursive;
				padding: 10px;
				color: #11bbff;
			}
			
		
			
			.mya{
				text-decoration: none;
				color: white;
			}
			
		</style>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-12" >
					<span class="num">10960</span>
					<a href="logout.do" ><span id="logout">退出</span></a>
				</div>
			</div>
			<div class="row">
				<div class="col-md-2" id="sys">
					<ul >
    					<li class="active"><a href="#Customer" aria-controls="home" role="tab" data-toggle="tab">Customer管理</a></li>
    					<li><a href="#Film"  data-toggle="tab">Film管理</a></li>
  					</ul>
				</div>
				<div class="col-md-9" id="content">
					<div class="tab-content">
   					<div role="tabpanel" class="tab-pane active" id="Customer">
   						<div class="row">
   							<h3>客户管理</h3>
   							<a href="findcustomer.do" class="mya btn btn-primary">查询</a>
   				
  							</div>
   					</div>	
    				<div role="tabpanel" class="tab-pane" id="Film">暂时无内容</div>
  				</div>
				</div>
			</div>	

		</div> 
		
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
	</body>
</html>


