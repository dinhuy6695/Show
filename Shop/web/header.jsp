<%@page import="model.Item"%>
<%@page import="java.util.Map"%>
<%@page import="model.Cart" %>
<%@page import="model.Category"%>
<%@page import="dao.CategoryDAO"%>
<%@page import="model.Users"%>
<%@page import="dao.UsersDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>header</title>
        
        <!-- Tich hop facebook comment -->
        <div id="fb-root"></div>
<script>(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = "//connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v2.8&appId=306871193047618";
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>

    </head>
    <body>

        <!-- Cap nhat code -->
        <%
            CategoryDAO categoryDAO = new CategoryDAO();
        %>
        <!-- End cap nhat -->       


        <!-- Cap nhat lab 7>
        <%
            Users users = new Users();
            if (session.getAttribute("user") != null) {
                users = (Users) session.getAttribute("user");
            } else {
                users.setUserEmail("");
            }
        %>
         
        <!-- Cap nhat lab 8 -->
                <%
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
        %>
        
        <!-- header-section-starts -->
        <div class="header">
            <div class="header-top-strip">
                <div class="container">
                    <div class="header-top-left">
                        <ul>
                            <!-- Bo sung code ten user -->
                       <li><a href="Login.jsp"><span class="glyphicon glyphicon-user"> </span><li><a href="Login.jsp">Tài khoản  <%=users.getUserEmail() %></a> </li></a></li>
                            <li><a href="Register.jsp"><span class="glyphicon glyphicon-lock"> </span>Đăng ký</a></li>			
                        </ul>
                    </div>
                    <div class="header-right">
                        
                       
                        <div class="cart box_1">   
                            
                            <p><a href="checkout.jsp" class="simpleCart_empty"><img src="images/bag.png" alt="">   Giỏ hàng</a></p>
                            
                            <div class="clearfix"> </div>
                        </div>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        <!-- header-section-ends -->
        <div class="banner-top">
            <div class="container">
                <nav class="navbar navbar-default" role="navigation">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <div class="logo">
                            <h1><a href="Index.jsp"><span>H</span> -Shop</a></h1>
                        </div>
                    </div>
                    <!--/.navbar-header-->

                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li><a href="Index.jsp">TRANG CHỦ</a></li>

                                  
                                                <!-- Bo sung 2 -->
                                                <%
                                                    for (Category c : categoryDAO.getListCategory()) {
                                                %>
                                                <li><a href="Products.jsp?categoryID=<%=c.getCategoryID()%>&pages=1"><%=c.getCategoryName()%></a></li>
                                                    <%
                                                        }
                                                    %>
                                                <!-- End bo sung -->
                                             
                                                
                            <li><a href="Contact.jsp">LIÊN HỆ</a></li>
                        </ul>
                    </div>
                    <!--/.navbar-collapse-->
                </nav>
                <!--/.navbar-->
            </div>
        </div>


    </body>
</html>
