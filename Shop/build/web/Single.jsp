<%@page import="dao.CategoryDAO"%>
<%@page import="model.Category"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<title>Single</title>
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
        
                        <!-- Cap nhat code -->
        <%
            CategoryDAO categoryDAO = new CategoryDAO();
        %>
        <!-- End cap nhat -->    
        
        
        <!-- Bo sung code Lab6 -->
                <%
            ProductDAO productDAO = new ProductDAO();
            Product product = new Product();
            String productID = "";
            if (request.getParameter("product") != null) {
                productID = request.getParameter("product");
            product = productDAO.getProduct(Long.parseLong(productID));
            }
        %>
        <!-- End bo sung code -->
        
 <jsp:include page="header.jsp"></jsp:include>       
 
		<!-- content-section-starts -->
	<div class="container">
	   <div class="products-page">
			<div class="products">
				<div class="product-listy">
					<h2>DANH MỤC SẢN PHẨM</h2>
					<ul class="product-list">
                                                <!-- Bo sung 2 -->
                                                <%
                                                    for (Category c : categoryDAO.getListCategory()) {
                                                %>
                                                <li><a href="Products.jsp?categoryID=<%=c.getCategoryID()%>&pages=1"><%=c.getCategoryName()%></a></li>
                                                    <%
                                                        }
                                                    %>
                                                <!-- End bo sung -->
                                                <li><a href="Login.jsp">Đăng nhập</a></li>
                                <li><a href="Register.jsp">Đăng ký</a></li>
					</ul>
				</div>



			</div>
			<div class="new-product">
				<div class="col-md-5 zoom-grid">
					<div class="flexslider">
						<ul class="slides">
							<li data-thumb="<%=product.getProductImage()%>">
								<div class="thumb-image"> <img src="<%=product.getProductImage()%>" alt="<%=product.getProductName()%>" data-imagezoom="true" class="img-responsive" alt="" /> </div>
							</li>

						</ul>
					</div>
				</div>
				<div class="col-md-7 dress-info">
					<div class="dress-name">
						<h3><%=product.getProductName()%></h3>
						<span><%=String.format("%1$,.0f", product.getProductPrice())%> VNĐ</span>
						<div class="clearfix"></div>
						<p><%=product.getProductDescription()%></p>

					</div>

					<div class="purchase">
						                                                            <!-- Dieu chinh code them gio hang lab8 -->
                                    <a class="cbp-vm-icon cbp-vm-add item_add" href="CartServlet?command=plus&productID=<%=product.getProductID()%>">THÊM VÀO GIỎ HÀNG</a>

                                                
						<div class="clearfix"></div>
					</div>
				<script src="js/imagezoom.js"></script>
					<!-- FlexSlider -->
					<script defer src="js/jquery.flexslider.js"></script>
					<script>
						// Can also be used with $(document).ready()
						$(window).load(function() {
						  $('.flexslider').flexslider({
							animation: "slide",
							controlNav: "thumbnails"
						  });
						});
					</script>
				</div>
				<div class="clearfix"></div>


			</div>
			<div class="clearfix"></div>
                        
                        <!-- Facebook comment -->
                        <div class="fb-comments" data-href="http://localhost:8080/Shop/Single.jsp?product=<%=product.getProductID()%>" data-width="700" data-numposts="5"></div>
                        
			</div>
   </div>

   <!-- content-section-ends -->
   
<jsp:include page="footer.jsp"></jsp:include>   
    </body>
</html>
