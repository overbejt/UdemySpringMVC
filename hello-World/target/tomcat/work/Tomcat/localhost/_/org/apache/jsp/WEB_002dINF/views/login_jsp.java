/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-25 05:03:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>This is awesome!!!!</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<h1>\n");
      out.write("Look! I'm doing it!\n");
      out.write("</h1>\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("I will have to look and see if I can use css in the\n");
      out.write("jsp files.  It would be nice to use bootstrap again.  \n");
      out.write("But for now, I'm just messing around with things to \n");
      out.write("see what works and what doesn't work.  \n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("So far I have noticed a few things:\n");
      out.write("<ol>\n");
      out.write("<li>\n");
      out.write("White space does not matter in the jsp file.\n");
      out.write("I can break lines to make it easier to read the\n");
      out.write("file that I am working on, and it ignores the \n");
      out.write("breaks when it runs in the browser.  \n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("The html tags are valid.  They seem to work the \n");
      out.write("same way that I'm used to.  \n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("I want to look up what all is involved when using\n");
      out.write("css with a jsp file.  \n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("I also want to see what all is involved with using\n");
      out.write("a database with Spring.\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("Aaaaand, I want to know how to use this on the google\n");
      out.write("cloud platform.\n");
      out.write("</li>\n");
      out.write("</ol>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
