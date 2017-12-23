
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
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
        <script src="js/simpleCart.min.js"></script>
        <!-- cart -->
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
    </head>
    <body>

        <jsp:include page="header.jsp"></jsp:include>

            <!-- content-section-starts -->
            <div class="content">
                <div class="container">
                    <div class="login-page">
                        <div class="dreamcrub">
                            <ul class="breadcrumbs">
                                <li class="home">
                                    <a href="Index.jsp" title="Go to Home Page">Trang chủ</a>&nbsp;
                                    <span>&gt;</span>
                                </li>
                                <li class="women">
                                    Đăng nhập
                                </li>
                            </ul>
                            <ul class="previous">
                                <li><a href="Index.jsp">Về trang chủ</a></li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div class="account_grid">
                            <div class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s">
                                <h2>CHƯA CÓ TÀI KHOẢN</h2>
                                <p>Hãy tạo một tài khoản mới giúp bạn thuận tiện hơn trong việc đặt hàng, mua hàng và thanh toán.</p>
                                <a class="acount-btn" href="Register.jsp">Tạo tài khoản</a>
                            </div>
                            <div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s">
                                
                                <!-- Chinh sua lab 7 -->
                                <h3>ĐĂNG NHẬP</h3>
			<form action="UsersServlet" method="POST">
                            <%if(session.getAttribute("error")!=null){%>
                               <div>
                                   <p style="color:red"><%=session.getAttribute("error")%></p>
                               </div> 
                               <%}%>

                                <form>
                                    <div>
                                        <span>Email<label>(*)</label></span>
                                        <input type="text" name="email"> 
                                    </div>
                                    <div>
                                        <span>Mật khẩu<label>(*)</label></span>
                                        <input type="password" name="pass">
                                    </div>
                                    
                                        <input type="hidden" value="login" name="command">
                                        <input type="submit" value="Đăng Nhập">
                                </form>
                            </div>	
                            <div class="clearfix"> </div>
                        </div>
                    </div>
                </div>

            </div>


        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
