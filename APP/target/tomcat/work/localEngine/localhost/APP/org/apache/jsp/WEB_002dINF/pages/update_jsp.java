package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("</head>\r\n");
      out.write("<body onLoad=\"doT()\">\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function doT() {\r\n");
      out.write("\tdocument.getElementById(\"src\").setAttribute(\"value\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${src}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 1em;\r\n");
      out.write("}\r\n");
      out.write("table,th,td {\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("    padding: 5px;\r\n");
      out.write("    vertical-align: bottom;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-right: 40px;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\twidth=50px;height:30px\r\n");
      out.write("}\r\n");
      out.write("div.round{\r\n");
      out.write("\tborder: 1px solid brown;\r\n");
      out.write("    border-radius: 25px;\r\n");
      out.write("    width: 700px;\r\n");
      out.write("    box-shadow: 10px 10px 5px #888888;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<h2>Update:</h2>\r\n");
      out.write("<form action=\"update.do\" method=\"POST\">\r\n");
      out.write("<div class=\"round\">\r\n");
      out.write("<table >\r\n");
      out.write("\r\n");
      out.write("<tr><th>Column</th><th>Value</th></tr>\r\n");
      out.write("<tr><td>UPC:</td><td><input type=\"text\" name=\"UPC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"35\" ></td></tr>\r\n");
      out.write("<tr><td>Manufacturer:</td><td><input type=\"text\" name=\"Manufacturer\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${manufacturer}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"35\"  autofocus></td></tr>\r\n");
      out.write("<tr><td>Brand:</td><td><input type=\"text\" name=\"Brand\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"35\" ></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<input type=\"hidden\" id=\"src\" name=\"src\" value=\"\" />\r\n");
      out.write("<button type=\"submit\" value=\"submit\">Update</Button> <button type=\"reset\" value=\"reset\">Reset</Button>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<p id=\"test\"></p>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${src}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Go Back</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
