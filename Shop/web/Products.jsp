<%@page import="java.util.ArrayList"%>
<%@page import="model.Cart"%>
<%@page import="dao.CategoryDAO"%>
<%@page import="model.Category"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Products</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/component.css" rel='stylesheet' type='text/css' />
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
        
                <!-- Cap nhat code -->
        <%
            CategoryDAO categoryDAO = new CategoryDAO();
            ProductDAO productDAO = new ProductDAO();           
            long categoryID = 0;
            if (request.getParameter("categoryID") != null) {
                categoryID = (long) Long.parseLong(request.getParameter("categoryID"));
            }
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
             int pages = 0, firstResult = 0, maxResult = 0, total = 0, pagesize=2;
            if (request.getParameter("pages") != null) {
                pages = (int) Integer.parseInt(request.getParameter("pages"));
            }
            total = productDAO.countProductByCategory(categoryID);
            if (total <= 3) {
                firstResult = 1;
                maxResult = total;
            }else{
                firstResult = (pages - 1) * 3;
                maxResult = 3;
            }
            ArrayList<Product> listProduct = productDAO.getListProductByNav(categoryID, firstResult, maxResult);
        %>

            
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
                        <div class="new-product-top">
                            <ul class="product-top-list">
                                <li><a href="index.html">Trang chủ</a>&nbsp;<span>&gt;</span></li>
                                <li><span class="act">Sản phẩm</span>&nbsp;</li>
                            </ul>
                            <p class="back"><a href="Index.jsp">Về trang chủ</a></p>
                            <div class="clearfix"></div>
                        </div>
                        <div class="mens-toolbar">

                            <ul class="women_pagenation">
                                 <li>Trang:</li>
                                 <li><a href="#"><i></i></a></li>
                                <%for(int i=1;i<=(total/3)+1;i++){%>
                                <li><a href="#"><i></i></a></li>
                                       <li><a href="Products.jsp?categoryID=<%=categoryID%>&pages=<%=i%>"><%=i%></a></li>
                                       <%}%>
                                       
                         
                            </ul>
                            <div class="clearfix"></div>		
                        </div>
                        <div id="cbp-vm" class="cbp-vm-switcher cbp-vm-view-grid">

                            <div class="clearfix"></div>
                            <ul>
                                <li>
                                    <a class="cbp-vm-image" href="single.html">
                                        <div class="simpleCart_shelfItem">
                                            
                                                                <!-- Bo sung lab5 -->
                <% for (Product p : listProduct) {   %>
                <!-- End bo sung lab5 -->
                
                
                                            <div class="view view-first">
                                                <div class="inner_content clearfix">
                                                    <div class="product_image">
                                                        <a href="Single.jsp?product=<%=p.getProductID()%>"><img src="<%=p.getProductImage()%>" alt="<%=p.getProductName()%>" /></a>

                                                        <div class="product_container">
                                                            <div class="cart-left">
                                                                <p class="title"><a href="Single.jsp?product=<%=p.getProductID()%>"><%=p.getProductName()%></a></p>
                                                            </div>
                                                            <div class="pricey"><span class="item_price"><%=String.format("%1$,.0f", p.getProductPrice())%> VNĐ</span></div>
                                                            <div class="clearfix"></div>
                                                        </div>		
                                                    </div>
                                                </div>
                                            </div>
                                    </a>
                                    <div class="cbp-vm-details">
                                        <p><%=p.getProductDescription()%></p>
                                    </div>
                                                            <!-- Dieu chinh code them gio hang lab8 -->
                                    <a class="cbp-vm-icon cbp-vm-add item_add" href="CartServlet?command=plus&productID=<%=p.getProductID()%>">THÊM VÀO GIỎ HÀNG</a>
                                    </div>
                
                                    <!-- Dong ngoac -->
                    <%
                        }
                    %>
                    <!-- End dong ngoac -->
                    
                                </li>

                                
                                <!-- Da xoa cac san pham 2 den 9 o day -->
                                
                            </ul>
                        </div>
                        <script src="js/cbpViewModeSwitch.js" type="text/javascript"></script>
                        <script src="js/classie.js" type="text/javascript"></script>
                    </div>
                    <div class="clearfix"></div>
                                      
                </div>
                <div class="clearfix"></div>
            </div>
            <!-- content-section-ends -->

        <jsp:include page="footer.jsp"></jsp:include>

    </body>
</html>
