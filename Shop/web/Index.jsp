<%@page import="model.Category"%>
<%@page import="model.Product"%>
<%@page import="dao.CategoryDAO"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<title>Index</title>
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
    </head>
    <body>
        <%           
            ProductDAO productDAO = new ProductDAO(); 
            CategoryDAO categoryDAO = new CategoryDAO();
            long categoryID = 0;
            if (request.getParameter("categoryID") != null) {
                categoryID = (long) Long.parseLong(request.getParameter("categoryID"));
            }
        %>        
        
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="banner.jsp"></jsp:include>    

		<!-- content-section-starts-here -->
		<div class="container">
			<div class="main-content">
				<div class="online-strip">
					<div class="col-md-4 follow-us">
						<h3>fanpage : <a class="twitter" href="#"></a><a class="facebook" href="https://vi-vn.facebook.com/hutechuniversity/"></a></h3>
					</div>
					<div class="col-md-4 shipping-grid">
						<div class="shipping">
                    					<img src="images/shipping.png" alt="" />
						</div>
						<div class="shipping-text">
							<h3>Miễn phí vận chuyển</h3>
							<p>với đơn hàng trên 300 ngàn VNĐ</p>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="col-md-4 online-order">
						<p>Liên hệ</p>
						<h3>SĐT: 0938 752 847</h3>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="products-grid">
				<header>
					<h3 class="head text-center">Sản phẩm mới</h3>
				</header>
                                        <% for (Product p : productDAO.getListProduct()) {   %>
					<div class="col-md-4 product simpleCart_shelfItem text-center">
						<img src="<%=p.getProductImage()%>" alt="<%=p.getProductName()%>"/>
						<div class="mask">
							<a href="Single.jsp?product=<%=p.getProductID()%>">Xem Nhanh</a>
						</div>
						<a class="product_name"><%=p.getProductName()%></a>
						<p><a class="item_add"><i></i> <span class="item_price"><%=String.format("%1$,.0f", p.getProductPrice())%> VNĐ</span></a></p>
					</div>

                                                <%
                                                    }
                                                %>  
					<div class="clearfix"></div>
   
				</div>
			</div>

		</div>

                                        		<div class="other-products">
		<div class="container">
			<h3 class="like text-center">Sản phẩm ngẫu nhiên</h3>
                       
				     <ul id="flexiselDemo3">
                                                                 <% for (Product p : productDAO.getListProduct()) {   %> 
						<li><a href="Single.jsp?product=<%=p.getProductID()%>"><img src="<%=p.getProductImage()%>" class="img-responsive" alt="" /></a>
							<div class="product liked-product simpleCart_shelfItem">
							<a class="like_name"><%=p.getProductName()%></a>
							<p><a class="item_add"><i></i> <span class=" item_price"><%=String.format("%1$,.0f", p.getProductPrice())%> VNĐ</span></a></p>
							</div>
						</li>
                                                <%
                                                    }
                                                %>  
				     </ul>
                                                        

				    <script type="text/javascript">
					 $(window).load(function() {
						$("#flexiselDemo3").flexisel({
							visibleItems: 4,
							animationSpeed: 1000,
							autoPlay: true,
							autoPlaySpeed: 3000,    		
							pauseOnHover: true,
							enableResponsiveBreakpoints: true,
					    	responsiveBreakpoints: { 
					    		portrait: { 
					    			changePoint:480,
					    			visibleItems: 1
					    		}, 
					    		landscape: { 
					    			changePoint:640,
					    			visibleItems: 2
					    		},
					    		tablet: { 
					    			changePoint:768,
					    			visibleItems: 3
					    		}
					    	}
					    });
					    
					});
				   </script>
                                   
				   <script type="text/javascript" src="js/jquery.flexisel.js"></script>
                                   
 
				   </div>
                                                        
				   </div>
		<!-- content-section-ends-here -->
                
<jsp:include page="footer.jsp"></jsp:include>


    </body>
</html>