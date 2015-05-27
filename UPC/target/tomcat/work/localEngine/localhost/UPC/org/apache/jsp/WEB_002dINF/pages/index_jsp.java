package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("Search by:<br>\n");
      out.write("\n");
      out.write("<form action=\"form.asp\" method=\"get\">\n");
      out.write("<table style=\"width:100%\">\n");
      out.write("<tr><td>UPC:</td><td><input type=\"text\" name=\"UPC\" size=\"35\"></td></tr>\n");
      out.write("<tr><td>Manufacturer:</td><td><input type=\"text\" name=\"Manufacturer\" size=\"35\"></td></tr>\n");
      out.write("<tr><td>Brand:</td><td><input type=\"text\" name=\"Brand\" size=\"35\"></td></tr>\n");
      out.write("<tr><td>Size:</td><td><input type=\"text\" name=\"Size\" size=\"35\"></td></tr>\n");
      out.write("</table>\n");
      out.write("<button type=\"submit\" value=\"submit\">Search</Button> <button type=\"reset\" value=\"reset\">Reset</Button>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<br>Insert into table:<br>\n");
      out.write("\n");
      out.write("<form action=\"formI.asp\" method=\"post\">\n");
      out.write("<table style=\"width:100%\">\n");
      out.write("<tr><td>UPC:</td><td><input type=\"text\" name=\"UPCI\" size=\"35\"></td></tr>\n");
      out.write("<tr><td>Manufacturer:</td><td><input type=\"text\" name=\"ManufacturerI\" size=\"35\"></td></tr>\n");
      out.write("<tr><td>Brand:</td><td><input type=\"text\" name=\"BrandI\" size=\"35\"></td></tr>\n");
      out.write("<tr><td>Size:</td><td><input type=\"text\" name=\"SizeI\" size=\"35\"></td></tr>\n");
      out.write("</table>\n");
      out.write("<button type=\"submit\" value=\"submitI\">Insert</Button> <button type=\"reset\" value=\"resetI\">Reset</Button>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<table style=\"width:100%\" border=\"1\" >\n");
      out.write("<tr><th><b>UPC</th>\n");
      out.write("<th><b>Manufacturer</th>\n");
      out.write("<th><b>Brand</th>\n");
      out.write("<th><b>Size</th>\n");
      out.write("</tr>\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${glob}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("<tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\n");
      out.write("<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${manf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\n");
      out.write("<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\n");
      out.write("<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<h2>Operation : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${op}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h2>\n");
      out.write("</body>\n");
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
