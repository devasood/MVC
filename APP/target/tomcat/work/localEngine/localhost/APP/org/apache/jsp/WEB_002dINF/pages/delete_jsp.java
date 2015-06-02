package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class delete_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("Search by:<br>\r\n");
      out.write("<form action=\"delete.do\" method=\"get\">\r\n");
      out.write("<table style=\"width:40%\">\r\n");
      out.write("<tr><td>UPC:</td><td><input type=\"text\" name=\"UPC\" size=\"35\"></td></tr>\r\n");
      out.write("<tr><td>Manufacturer:</td><td><input type=\"text\" name=\"Manufacturer\" size=\"35\"></td></tr>\r\n");
      out.write("<tr><td>Brand:</td><td><input type=\"text\" name=\"Brand\" size=\"35\"></td></tr>\r\n");
      out.write("<tr><td>Length:</td><td><input type=\"text\" name=\"Length\" size=\"35\"></td></tr>\r\n");
      out.write("<tr><td>Height:</td><td><input type=\"text\" name=\"Height\" size=\"35\"></td></tr>\r\n");
      out.write("<tr><td>Width:</td><td><input type=\"text\" name=\"Width\" size=\"35\"></td></tr>\r\n");
      out.write("<tr><td>Weight:</td><td><input type=\"text\" name=\"Weight\" size=\"35\"></td></tr>\r\n");
      out.write("<tr><td>Type:</td><td><input type=\"text\" name=\"Type\" size=\"35\"></td></tr>\r\n");
      out.write("<tr><td>Size:</td><td><input type=\"text\" name=\"Size\" size=\"35\"></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<button type=\"submit\" value=\"submit\">Delete</Button> <button type=\"reset\" value=\"reset\">Reset</Button>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
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
