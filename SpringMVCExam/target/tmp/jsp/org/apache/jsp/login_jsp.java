/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2016-08-21 11:24:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("file:/C:/Users/Lewis/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.3/taglibs-standard-impl-1.2.3.jar", Long.valueOf(1471315281272L));
    _jspx_dependants.put("jar:file:/C:/Users/Lewis/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.3/taglibs-standard-impl-1.2.3.jar!/META-INF/fmt.tld", Long.valueOf(1423570676000L));
    _jspx_dependants.put("file:/C:/Users/Lewis/.m2/repository/jstl/jstl/1.2/jstl-1.2.jar", Long.valueOf(1471314043681L));
    _jspx_dependants.put("jar:file:/C:/Users/Lewis/.m2/repository/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css\">\t\t\r\n");
      out.write("\t\t<title></title>\r\n");
      out.write("\t\t<style type=\"text/css\">\t\r\n");
      out.write("\t\t\t.container-fluid{\r\n");
      out.write("\t\t\t\tbackground-image: url(img/1.jpg);\r\n");
      out.write("\t\t\t\tbackground-size: cover;\r\n");
      out.write("\t\t\t\tbackground-repeat: no-repeat;\r\n");
      out.write("\t\t\t\twidth: 100vw; \r\n");
      out.write("\t\t\t\theight: 100vh; \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t#num{\r\n");
      out.write("\t\t\t\tfont-size: 40px;\r\n");
      out.write("\t\t\t\tfont-family: cursive;\r\n");
      out.write("\t\t\t\tpadding: 30px;\r\n");
      out.write("\t\t\t\tcolor: wheat;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t#sys{\r\n");
      out.write("\t\t\t\tfont-size: 26px;\r\n");
      out.write("\t\t\t\tfont-family: cursive;\r\n");
      out.write("\t\t\t\tpadding: 30px;\r\n");
      out.write("\t\t\t\tcolor: wheat;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\" id=\"num\">10960</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-md-offset-2\" id=\"sys\">电影租赁管理系统</div>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-5 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t<form action=\"loginAction.do\" method=\"post\" class=\"col-md-5\" name=\"form1\" >   \r\n");
      out.write("\t\t\t\t\t <div class=\"form-group\">\r\n");
      out.write("    \t\t\t\t\t<label for=\"exampleInputEmail1\">用户名</label>\r\n");
      out.write("    \t\t\t\t\t\t<input  class=\"form-control\" type=\"text\" name=\"firstName\" placeholder=\"Name\">\r\n");
      out.write("  \t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("    \t\t\t\t\t<label for=\"exampleInputPassword1\">密　码</label>\r\n");
      out.write("    \t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("  \t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" onclick=\"check()\">登录</button>\r\n");
      out.write("\t\t\t\t</form> \r\n");
      out.write("\t\t\t\t</div>  \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("         function check(){\r\n");
      out.write("        \t if(document.forms.form1.firstName.value==\"\"){\r\n");
      out.write("        \t\t alert(\"please write the firstName\");\r\n");
      out.write("        \t\t document.forms.form1.firstName.focus();\r\n");
      out.write("        \t }else if(document.forms.form1.password.value==\"\"){\r\n");
      out.write("        \t\t alert(\"please write the password\");\r\n");
      out.write("        \t\t document.forms.form1.password.focus();\r\n");
      out.write("        \t }else{\r\n");
      out.write("        \t\t document.forms.form1.submit();\r\n");
      out.write("        \t\t \r\n");
      out.write("        \t }       \t\r\n");
      out.write("         }\r\n");
      out.write("   </script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
