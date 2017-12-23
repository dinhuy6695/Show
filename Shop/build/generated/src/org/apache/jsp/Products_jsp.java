package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Cart;
import dao.CategoryDAO;
import model.Category;
import model.Product;
import dao.ProductDAO;

public final class Products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Products</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/component.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Eshop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!--webfont-->\n");
      out.write("        <!-- for bootstrap working -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("        <!-- //for bootstrap working -->\n");
      out.write("        <!-- cart -->\n");
      out.write("        <script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("        <!-- cart -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("                <!-- Cap nhat code -->\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!-- content-section-starts -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"products-page\">\n");
      out.write("                    <div class=\"products\">\n");
      out.write("                        <div class=\"product-listy\">\n");
      out.write("                            <h2>DANH MỤC SẢN PHẨM</h2>\n");
      out.write("                            <ul class=\"product-list\">\n");
      out.write("                                                <!-- Bo sung 2 -->\n");
      out.write("                                                ");

                                                    for (Category c : categoryDAO.getListCategory()) {
                                                
      out.write("\n");
      out.write("                                                <li><a href=\"Products.jsp?categoryID=");
      out.print(c.getCategoryID());
      out.write("&pages=1\">");
      out.print(c.getCategoryName());
      out.write("</a></li>\n");
      out.write("                                                    ");

                                                        }
                                                    
      out.write("\n");
      out.write("                                                <!-- End bo sung -->\n");
      out.write("                                                <li><a href=\"Login.jsp\">Đăng nhập</a></li>\n");
      out.write("                                <li><a href=\"Register.jsp\">Đăng ký</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"new-product\">\n");
      out.write("                        <div class=\"new-product-top\">\n");
      out.write("                            <ul class=\"product-top-list\">\n");
      out.write("                                <li><a href=\"index.html\">Trang chủ</a>&nbsp;<span>&gt;</span></li>\n");
      out.write("                                <li><span class=\"act\">Sản phẩm</span>&nbsp;</li>\n");
      out.write("                            </ul>\n");
      out.write("                            <p class=\"back\"><a href=\"Index.jsp\">Về trang chủ</a></p>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mens-toolbar\">\n");
      out.write("\n");
      out.write("                            <ul class=\"women_pagenation\">\n");
      out.write("                                 <li>Trang:</li>\n");
      out.write("                                 <li><a href=\"#\"><i></i></a></li>\n");
      out.write("                                ");
for(int i=1;i<=(total/3)+1;i++){
      out.write("\n");
      out.write("                                <li><a href=\"#\"><i></i></a></li>\n");
      out.write("                                       <li><a href=\"Products.jsp?categoryID=");
      out.print(categoryID);
      out.write("&pages=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\n");
      out.write("                                       ");
}
      out.write("\n");
      out.write("                                       \n");
      out.write("                         \n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"clearfix\"></div>\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"cbp-vm\" class=\"cbp-vm-switcher cbp-vm-view-grid\">\n");
      out.write("\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"cbp-vm-image\" href=\"single.html\">\n");
      out.write("                                        <div class=\"simpleCart_shelfItem\">\n");
      out.write("                                            \n");
      out.write("                                                                <!-- Bo sung lab5 -->\n");
      out.write("                ");
 for (Product p : listProduct) {   
      out.write("\n");
      out.write("                <!-- End bo sung lab5 -->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                                            <div class=\"view view-first\">\n");
      out.write("                                                <div class=\"inner_content clearfix\">\n");
      out.write("                                                    <div class=\"product_image\">\n");
      out.write("                                                        <a href=\"Single.jsp?product=");
      out.print(p.getProductID());
      out.write("\"><img src=\"");
      out.print(p.getProductImage());
      out.write("\" alt=\"");
      out.print(p.getProductName());
      out.write("\" /></a>\n");
      out.write("\n");
      out.write("                                                        <div class=\"product_container\">\n");
      out.write("                                                            <div class=\"cart-left\">\n");
      out.write("                                                                <p class=\"title\"><a href=\"Single.jsp?product=");
      out.print(p.getProductID());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></p>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"pricey\"><span class=\"item_price\">");
      out.print(String.format("%1$,.0f", p.getProductPrice()));
      out.write(" VNĐ</span></div>\n");
      out.write("                                                            <div class=\"clearfix\"></div>\n");
      out.write("                                                        </div>\t\t\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"cbp-vm-details\">\n");
      out.write("                                        <p>");
      out.print(p.getProductDescription());
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                                            <!-- Dieu chinh code them gio hang lab8 -->\n");
      out.write("                                    <a class=\"cbp-vm-icon cbp-vm-add item_add\" href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\">THÊM VÀO GIỎ HÀNG</a>\n");
      out.write("                                    </div>\n");
      out.write("                \n");
      out.write("                                    <!-- Dong ngoac -->\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                    <!-- End dong ngoac -->\n");
      out.write("                    \n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                                <!-- Da xoa cac san pham 2 den 9 o day -->\n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <script src=\"js/cbpViewModeSwitch.js\" type=\"text/javascript\"></script>\n");
      out.write("                        <script src=\"js/classie.js\" type=\"text/javascript\"></script>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                                      \n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("            <!-- content-section-ends -->\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
