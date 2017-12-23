
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<title>Register</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Eshop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<!-- for bootstrap working -->
	<script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
<!-- //for bootstrap working -->
<!-- cart -->
	<script src="js/simpleCart.min.js"> </script>
<!-- cart -->
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

<!-- Cap nhat code lab7-->
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"
type="text/javascript"></script>
 <script type="text/javascript">
 $(document).ready(function () {
 var x_timer;
 $("#email").keyup(function (e) {
 clearTimeout(x_timer);
 var user_name = $(this).val();
 x_timer = setTimeout(function () {
 check_username_ajax(user_name);
 }, 1000);
 });
 function check_username_ajax(username) {
 $("#user-result").html('<img src="img/ajax-loader.gif" />');
 $.post('CheckEmailServlet', {'username': username}, function (data) {
 $("#user-result").html(data);
 });
 }
 });
 </script>
 
 
    </head>
    <body>
        
<jsp:include page="header.jsp"></jsp:include>
    
		<!-- registration-form -->
<div class="registration-form">
	<div class="container">
	<div class="dreamcrub">
			   	 <ul class="breadcrumbs">
                    <li class="home">
                       <a href="Index.jsp" title="Go to Home Page">Trang chủ</a>&nbsp;
                       <span>&gt;</span>
                    </li>
                    <li class="women">
                       Đăng ký
                    </li>
                </ul>
                <ul class="previous">
                	<li><a href="Index.jsp">Về trang chủ</a></li>
                </ul>
                <div class="clearfix"></div>
			   </div>
		<h2>THÔNG TIN ĐĂNG KÝ</h2>
                <form action="UsersServlet" method="POST">
		<div class="registration-grids">
			<div class="reg-form">
				<div class="reg">

					 <form>
						 <ul>
							 <li class="text-info">Họ và tên(*): </li>
							 <li><input type="text" name="fullname" required="yes"></li>
						 </ul>
			 
						<ul>
							 <li class="text-info">Email(*): </li>
							 <li><input type="text" name="email" id="email" required="yes">
                            <span id="user-result"></span></li>
						 </ul>
						 <ul>
							 <li class="text-info">Password(*): </li>
							 <li>                            <input type="password" name="pass" required="yes">
                            <span></span></li>
						 </ul>
						 <ul>
							 <li class="text-info">Nhập lại Password(*):</li>
							 <li>                            <input type="password" name="pass" required="yes">
                            <span></span></li>
						 </ul>
					
						                         <input type="hidden" value="insert" name="command">
                        <input type="submit" value="ĐĂNG KÝ"> 
					 </form>
				 </div>
			</div>

			<div class="clearfix"></div>
                </div>
	</div>
</div>
<!-- registration-form -->


<jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
