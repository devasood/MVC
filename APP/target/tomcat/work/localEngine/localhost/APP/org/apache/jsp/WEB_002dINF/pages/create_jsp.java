package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function myFunction() {\r\n");
      out.write("    var inpObj = document.getElementById(\"upc\");\r\n");
      out.write("    if (inpObj.checkValidity() == false) \r\n");
      out.write("        document.getElementById(\"demo\").innerHTML = \"*\"+inpObj.validationMessage;\r\n");
      out.write("    else\r\n");
      out.write("        document.getElementById(\"demo\").innerHTML =\"\";\r\n");
      out.write("        inpObj = document.getElementById(\"manufacturer\");\r\n");
      out.write("    if (inpObj.checkValidity() == false) \r\n");
      out.write("        document.getElementById(\"demo1\").innerHTML = \"*\"+inpObj.validationMessage;\r\n");
      out.write("    else\r\n");
      out.write("        document.getElementById(\"demo1\").innerHTML =\"\";    \r\n");
      out.write("        inpObj = document.getElementById(\"brand\");\r\n");
      out.write("    if (inpObj.checkValidity() == false) \r\n");
      out.write("        document.getElementById(\"demo2\").innerHTML = \"*\"+inpObj.validationMessage;\r\n");
      out.write("    else\r\n");
      out.write("        document.getElementById(\"demo2\").innerHTML =\"\";\r\n");
      out.write("        inpObj = document.getElementById(\"length\");\r\n");
      out.write("    if (inpObj.checkValidity() == false) \r\n");
      out.write("        document.getElementById(\"demo3\").innerHTML = \"*\"+inpObj.validationMessage;\r\n");
      out.write("    else\r\n");
      out.write("        document.getElementById(\"demo3\").innerHTML =\"\";\r\n");
      out.write("        inpObj = document.getElementById(\"height\");\r\n");
      out.write("    if (inpObj.checkValidity() == false) \r\n");
      out.write("        document.getElementById(\"demo4\").innerHTML = \"*\"+inpObj.validationMessage;\r\n");
      out.write("    else\r\n");
      out.write("        document.getElementById(\"demo4\").innerHTML =\"\";\r\n");
      out.write("        inpObj = document.getElementById(\"width\");\r\n");
      out.write("    if (inpObj.checkValidity() == false) \r\n");
      out.write("        document.getElementById(\"demo5\").innerHTML = \"*\"+inpObj.validationMessage;\r\n");
      out.write("    else\r\n");
      out.write("        document.getElementById(\"demo5\").innerHTML =\"\";\r\n");
      out.write("        inpObj = document.getElementById(\"weight\");\r\n");
      out.write("    if (inpObj.checkValidity() == false) \r\n");
      out.write("        document.getElementById(\"demo6\").innerHTML = \"*\"+inpObj.validationMessage;\r\n");
      out.write("    else\r\n");
      out.write("        document.getElementById(\"demo6\").innerHTML =\"\";\r\n");
      out.write("        inpObj = document.getElementById(\"size\");\r\n");
      out.write("    if (inpObj.checkValidity() == false) \r\n");
      out.write("        document.getElementById(\"demo7\").innerHTML = \"*\"+inpObj.validationMessage;\r\n");
      out.write("    else\r\n");
      out.write("        document.getElementById(\"demo7\").innerHTML =\"\";\r\n");
      out.write("        inpObj = document.getElementById(\"type\");\r\n");
      out.write("    if (inpObj.checkValidity() == false) \r\n");
      out.write("        document.getElementById(\"demo8\").innerHTML = \"*\"+inpObj.validationMessage;\r\n");
      out.write("\telse\r\n");
      out.write("        document.getElementById(\"demo8\").innerHTML =\"\";\r\n");
      out.write("} \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("div.alert {\r\n");
      out.write("\tcolor:red;\r\n");
      out.write("\tfont-size:50%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2>Insert new Products:</h2><br>\r\n");
      out.write("<form action=\"create.do\" method=\"get\">\r\n");
      out.write("<table style=\"width:50%\">\r\n");
      out.write("<tr><td>UPC:</td><td><input id=\"upc\" type=\"text\"  size=\"35\" autofocus required placeholder=\"100066\">\r\n");
      out.write("<div class=\"alert\" id=\"demo\"></div></td></tr>\r\n");
      out.write("<tr><td>Manufacturer:</td><td><input id=\"manufacturer\" type=\"text\" name=\"Manufacturer\" size=\"35\" required placeholder=\"Frito Lays\">\r\n");
      out.write("<div class=\"alert\" id=\"demo1\"></div></td></td></tr>\r\n");
      out.write("<tr><td>Brand:</td><td><input id=\"brand\" type=\"text\" name=\"Brand\" size=\"35\" required placeholder=\"Lays\">\r\n");
      out.write("<div class=\"alert\" id=\"demo2\"></div></td></td></tr>\r\n");
      out.write("<tr><td>Length:</td><td><input id=\"length\" type=\"number\" min=\"0\" name=\"Length\" size=\"35\" required placeholder=\"5\">\r\n");
      out.write("<div class=\"alert\" id=\"demo3\"></div></td></td></tr>\r\n");
      out.write("<tr><td>Height:</td><td><input id=\"height\" type=\"number\" min=\"0\" name=\"Height\" size=\"35\" required placeholder=\"12\">\r\n");
      out.write("<div class=\"alert\" id=\"demo4\"></div></td></td></tr>\r\n");
      out.write("<tr><td>Width:</td><td><input id=\"width\" type=\"number\" min=\"0\" name=\"Width\" size=\"35\" required placeholder=\"7\">\r\n");
      out.write("<div class=\"alert\" id=\"demo5\"></div></td></td></tr>\r\n");
      out.write("<tr><td>Weight:</td><td><input id=\"weight\" type=\"number\" min=\"0\" name=\"Weight\" size=\"35\" required placeholder=\"60\">\r\n");
      out.write("<div class=\"alert\" id=\"demo6\"></div></td></td></tr>\r\n");
      out.write("<tr><td>Size:</td><td><input id=\"size\" type=\"number\" min=\"0\" name=\"Size\" size=\"35\" required placeholder=\"235\">\r\n");
      out.write("<div class=\"alert\" id=\"demo7\"></div></td></td></tr>\r\n");
      out.write("<tr><td>Type:</td><td><input id=\"type\" type=\"text\" name=\"Type\" size=\"35\" required placeholder=\"Eatables\">\r\n");
      out.write("<div class=\"alert\" id=\"demo8\"></div></td></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<button type=\"submit\" value=\"submit\" onClick=\"return myFunction();\">Insert</Button> <button type=\"reset\" value=\"reset\">Reset</Button>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form action=\"create.random\" method=\"get\">\r\n");
      out.write("<button type=\"submit\" value=\"submit\">InsertRandom</Button>\r\n");
      out.write("</form>\r\n");
      out.write("<br>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${backlink}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
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
