package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Category;
import model.Product;
import dao.CategoryDAO;
import dao.ProductDAO;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<title>Index</title>\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Eshop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--webfont-->\n");
      out.write("<!-- for bootstrap working -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("<!-- //for bootstrap working -->\n");
      out.write("<!-- cart -->\n");
      out.write("\t<script src=\"js/simpleCart.min.js\"> </script>\n");
      out.write("<!-- cart -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
           
            ProductDAO productDAO = new ProductDAO(); 
            CategoryDAO categoryDAO = new CategoryDAO();
            long categoryID = 0;
            if (request.getParameter("categoryID") != null) {
                categoryID = (long) Long.parseLong(request.getParameter("categoryID"));
            }
        
      out.write("        \n");
      out.write("        \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, false);
      out.write("    \n");
      out.write("\n");
      out.write("\t\t<!-- content-section-starts-here -->\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"main-content\">\n");
      out.write("\t\t\t\t<div class=\"online-strip\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 follow-us\">\n");
      out.write("\t\t\t\t\t\t<h3>fanpage : <a class=\"twitter\" href=\"#\"></a><a class=\"facebook\" href=\"https://vi-vn.facebook.com/hutechuniversity/\"></a></h3>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 shipping-grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"shipping\">\n");
      out.write("                    \t\t\t\t\t<img src=\"images/shipping.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"shipping-text\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Miễn phí vận chuyển</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>với đơn hàng trên 300 ngàn VNĐ</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 online-order\">\n");
      out.write("\t\t\t\t\t\t<p>Liên hệ</p>\n");
      out.write("\t\t\t\t\t\t<h3>SĐT: 0938 752 847</h3>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"products-grid\">\n");
      out.write("\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t<h3 class=\"head text-center\">Sản phẩm mới</h3>\n");
      out.write("\t\t\t\t</header>\n");
      out.write("                                        ");
 for (Product p : productDAO.getListProduct()) {   
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 product simpleCart_shelfItem text-center\">\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(p.getProductImage());
      out.write("\" alt=\"");
      out.print(p.getProductName());
      out.write("\"/>\n");
      out.write("\t\t\t\t\t\t<div class=\"mask\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"Single.jsp?product=");
      out.print(p.getProductID());
      out.write("\">Xem Nhanh</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a class=\"product_name\">");
      out.print(p.getProductName());
      out.write("</a>\n");
      out.write("\t\t\t\t\t\t<p><a class=\"item_add\"><i></i> <span class=\"item_price\">");
      out.print(String.format("%1$,.0f", p.getProductPrice()));
      out.write(" VNĐ</span></a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("  \n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("   \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("                                        \t\t<div class=\"other-products\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3 class=\"like text-center\">Sản phẩm ngẫu nhiên</h3>\n");
      out.write("                       \n");
      out.write("\t\t\t\t     <ul id=\"flexiselDemo3\">\n");
      out.write("                                                                 ");
 for (Product p : productDAO.getListProduct()) {   
      out.write(" \n");
      out.write("\t\t\t\t\t\t<li><a href=\"Single.jsp?product=");
      out.print(p.getProductID());
      out.write("\"><img src=\"");
      out.print(p.getProductImage());
      out.write("\" class=\"img-responsive\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product liked-product simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"like_name\">");
      out.print(p.getProductName());
      out.write("</a>\n");
      out.write("\t\t\t\t\t\t\t<p><a class=\"item_add\"><i></i> <span class=\" item_price\">");
      out.print(String.format("%1$,.0f", p.getProductPrice()));
      out.write(" VNĐ</span></a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("  \n");
      out.write("\t\t\t\t     </ul>\n");
      out.write("                                                        \n");
      out.write("\n");
      out.write("\t\t\t\t    <script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t $(window).load(function() {\n");
      out.write("\t\t\t\t\t\t$(\"#flexiselDemo3\").flexisel({\n");
      out.write("\t\t\t\t\t\t\tvisibleItems: 4,\n");
      out.write("\t\t\t\t\t\t\tanimationSpeed: 1000,\n");
      out.write("\t\t\t\t\t\t\tautoPlay: true,\n");
      out.write("\t\t\t\t\t\t\tautoPlaySpeed: 3000,    \t\t\n");
      out.write("\t\t\t\t\t\t\tpauseOnHover: true,\n");
      out.write("\t\t\t\t\t\t\tenableResponsiveBreakpoints: true,\n");
      out.write("\t\t\t\t\t    \tresponsiveBreakpoints: { \n");
      out.write("\t\t\t\t\t    \t\tportrait: { \n");
      out.write("\t\t\t\t\t    \t\t\tchangePoint:480,\n");
      out.write("\t\t\t\t\t    \t\t\tvisibleItems: 1\n");
      out.write("\t\t\t\t\t    \t\t}, \n");
      out.write("\t\t\t\t\t    \t\tlandscape: { \n");
      out.write("\t\t\t\t\t    \t\t\tchangePoint:640,\n");
      out.write("\t\t\t\t\t    \t\t\tvisibleItems: 2\n");
      out.write("\t\t\t\t\t    \t\t},\n");
      out.write("\t\t\t\t\t    \t\ttablet: { \n");
      out.write("\t\t\t\t\t    \t\t\tchangePoint:768,\n");
      out.write("\t\t\t\t\t    \t\t\tvisibleItems: 3\n");
      out.write("\t\t\t\t\t    \t\t}\n");
      out.write("\t\t\t\t\t    \t}\n");
      out.write("\t\t\t\t\t    });\n");
      out.write("\t\t\t\t\t    \n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t   </script>\n");
      out.write("                                   \n");
      out.write("\t\t\t\t   <script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\n");
      out.write("                                   \n");
      out.write(" \n");
      out.write("\t\t\t\t   </div>\n");
      out.write("                                                        \n");
      out.write("\t\t\t\t   </div>\n");
      out.write("\t\t<!-- content-section-ends-here -->\n");
      out.write("                \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
