package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>content</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \t<div id=\"rightContent\">\n");
      out.write("\t<h3>Dashboard</h3>\n");
      out.write("\t<div class=\"quoteOfDay\">\n");
      out.write("\t<b>Quote of the day :</b><br>\n");
      out.write("\t<i style=\"color: #5b5b5b;\">\"If you think you can, you really can\"</i>\n");
      out.write("\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"smallRight\"><h3>Nhóm THT - Lớp 15HTH02</h3>\n");
      out.write("\t\t<table style=\"border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;\">\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Đặng Trần Đình Tú</td><td style=\"border: none;padding: 4px;\"><b>1515061080</b></td></tr>\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Vũ Minh Hiển</td><td style=\"border: none;padding: 4px;\"><b>1515061014</b></td></tr>\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Võ Văn Thắng</td><td style=\"border: none;padding: 4px;\"><b>1515061066</b></td></tr>\n");
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"smallRight\"><h3>Statistik pengunjung web</h3>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<div class=\"clear\"></div>\n");
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
