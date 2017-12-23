package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
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
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!-- content-section-starts -->\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"login-page\">\n");
      out.write("                        <div class=\"dreamcrub\">\n");
      out.write("                            <ul class=\"breadcrumbs\">\n");
      out.write("                                <li class=\"home\">\n");
      out.write("                                    <a href=\"Index.jsp\" title=\"Go to Home Page\">Trang chủ</a>&nbsp;\n");
      out.write("                                    <span>&gt;</span>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"women\">\n");
      out.write("                                    Đăng nhập\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul class=\"previous\">\n");
      out.write("                                <li><a href=\"Index.jsp\">Về trang chủ</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"account_grid\">\n");
      out.write("                            <div class=\"col-md-6 login-left wow fadeInLeft\" data-wow-delay=\"0.4s\">\n");
      out.write("                                <h2>CHƯA CÓ TÀI KHOẢN</h2>\n");
      out.write("                                <p>Hãy tạo một tài khoản mới giúp bạn thuận tiện hơn trong việc đặt hàng, mua hàng và thanh toán.</p>\n");
      out.write("                                <a class=\"acount-btn\" href=\"Register.jsp\">Tạo tài khoản</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 login-right wow fadeInRight\" data-wow-delay=\"0.4s\">\n");
      out.write("                                \n");
      out.write("                                <!-- Chinh sua lab 7 -->\n");
      out.write("                                <h3>ĐĂNG NHẬP</h3>\n");
      out.write("\t\t\t<form action=\"UsersServlet\" method=\"POST\">\n");
      out.write("                            ");
if(session.getAttribute("error")!=null){
      out.write("\n");
      out.write("                               <div>\n");
      out.write("                                   <p style=\"color:red\">");
      out.print(session.getAttribute("error"));
      out.write("</p>\n");
      out.write("                               </div> \n");
      out.write("                               ");
}
      out.write("\n");
      out.write("\n");
      out.write("                                <form>\n");
      out.write("                                    <div>\n");
      out.write("                                        <span>Email<label>(*)</label></span>\n");
      out.write("                                        <input type=\"text\" name=\"email\"> \n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <span>Mật khẩu<label>(*)</label></span>\n");
      out.write("                                        <input type=\"password\" name=\"pass\">\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                        <input type=\"hidden\" value=\"login\" name=\"command\">\n");
      out.write("                                        <input type=\"submit\" value=\"Đăng Nhập\">\n");
      out.write("                                </form>\n");
      out.write("                            </div>\t\n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
