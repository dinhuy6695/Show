<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="model.Cart" %>
<%@page import="model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>CHECKOUT</title>
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
        
                <!-- Cap nhat lab 8 -->
                <%
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
        %>
        
        
         <%
            Users users = (Users) session.getAttribute("user");
            if (users == null) {
                response.sendRedirect("/Shop/Login.jsp");
            }
        %>
        
        <jsp:include page="header.jsp"></jsp:include>
 
                <!-- Gio hang -->
        <div class="cart-items">
	<div class="container">

        			 <h2>GIỎ HÀNG (<%=cart.countItem()%>)</h2>
                                      <%for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {%>
		<div class="cart-gd">
                   
			 <div class="cart-header">
	
				 <div class="cart-sec simpleCart_shelfItem">
						<div class="cart-item cyc">
							 <img src="<%=list.getValue().getProduct().getProductImage()%>" class="img-responsive" alt="">
						</div>
					   <div class="cart-item-info">
                                               
						<h3><a href="#"><%=list.getValue().getProduct().getProductName()%></a> </h3>
							 <div class="delivery">
                                                         <p>Số lượng: <%=list.getValue().getQuantity()%></p></br></br>
                                                         <div class="clearfix"></div>
							 <p>Giá: <%=String.format("%1$,.0f",list.getValue().getProduct().getProductPrice())%> VNĐ</p>
							 <div class="clearfix"></div></br>
                                                         <p>Tổng tiền: <%=String.format("%1$,.0f", cart.total())%> VNĐ</p>
                                                         <div class="clearfix"></div></br>
                                                         <a href="CartServlet?command=remove&productID=<%=list.getValue().getProduct().getProductID()%>">Xóa khỏi giỏ hàng</a>
				        </div>	
					   </div>
                                         
                                        
					   <div class="clearfix"></div>
											
				  </div>
                                        
			 </div>
                                      
 <%}%>

		</div>
                                 
               <!-- End gio hang -->                  
                                 
            <!-- content-section-starts -->
            <div class="content">
                <div class="container">
                    <div class="login-page">
                        <div class="dreamcrub">


                            <div class="clearfix"></div>
                        </div>
                        <div class="account_grid">

                            <div class="col-md-6 login-right wow fadeInLeft" data-wow-delay="0.4s">
                                
                                <!-- Chinh sua lab 7 -->
                                    <!-- chinh sua lan 2 lab 9 -->
                                <h2>CHECKOUT</h2>
	                    <form action="CheckOutServlet" method="POST">
                        <div>
                            <span>Address *</span>
                            <input type="text" name="address">
                        </div> 	
                        <div>
                            <span>Payment *</span>
                            <select name="payment">
                                <option value="Bank transfer"> Bank transfer</option>
                                <option value="Live"> Live</option>
                            </select>
                        </div> 			
                        <input type="submit" value="Checkout"> 
                    </form>

                                </form>
                            </div>	
                            <div class="clearfix"> </div>
                        </div>
                    </div>
                </div>

            </div>
                            </div>

            </div>
<jsp:include page="footer.jsp"></jsp:include>

    </body>
</html>
