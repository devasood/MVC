package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("</head>\r\n");
      out.write("<body onLoad=\"addResults();next();\">\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("var clicks = parseInt(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("var no_of_pages=parseInt(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${no_of_records}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\")/10+1;    \r\n");
      out.write("var message=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("var stop=1;\r\n");
      out.write("\r\n");
      out.write("if(message.length>0)\r\n");
      out.write("alert(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function next() {        \r\n");
      out.write("\r\n");
      out.write("document.getElementById(\"jump\").setAttribute(\"max\",parseInt(no_of_pages));\r\n");
      out.write("\r\n");
      out.write("if(no_of_pages>1.1)\r\n");
      out.write("document.getElementById(\"test\").innerHTML=parseInt(no_of_pages*10-10)+\" records displayed in ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stats}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("else\r\n");
      out.write("document.getElementById(\"test\").innerHTML=(no_of_pages)*10-10+\" record displayed.\";\r\n");
      out.write("\r\n");
      out.write("    if(no_of_pages>clicks)    \r\n");
      out.write("    document.getElementById(\"one\").innerHTML = clicks;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"one\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+1)\r\n");
      out.write("    document.getElementById(\"two\").innerHTML = clicks+1;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"two\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+2)\r\n");
      out.write("    document.getElementById(\"three\").innerHTML = clicks+2;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"three\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+3)\r\n");
      out.write("    document.getElementById(\"four\").innerHTML = clicks+3;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"four\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+4)\r\n");
      out.write("    document.getElementById(\"five\").innerHTML = clicks+4;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"five\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+5)\r\n");
      out.write("    document.getElementById(\"six\").innerHTML = clicks+5;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"six\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+6)\r\n");
      out.write("    document.getElementById(\"seven\").innerHTML = clicks+6;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"seven\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+7)\r\n");
      out.write("    document.getElementById(\"eight\").innerHTML = clicks+7;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"eight\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+8)\r\n");
      out.write("    document.getElementById(\"nine\").innerHTML = clicks+8;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"nine\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+9)\r\n");
      out.write("    document.getElementById(\"ten\").innerHTML = clicks+9;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"ten\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>=clicks+10)    \r\n");
      out.write("    clicks += 10;\r\n");
      out.write("    if(stop>1)\r\n");
      out.write("    goToPage(document.getElementById(\"one\").innerHTML);\r\n");
      out.write("    else\r\n");
      out.write("    stop=2;\r\n");
      out.write("};\r\n");
      out.write("    \r\n");
      out.write("function prev() {\r\n");
      out.write("\tif(clicks>11)\r\n");
      out.write("        clicks -= 10;\r\n");
      out.write("    else\r\n");
      out.write("        clicks=1;\r\n");
      out.write("    if(no_of_pages>clicks)    \r\n");
      out.write("    document.getElementById(\"one\").innerHTML = clicks;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"one\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+1)\r\n");
      out.write("    document.getElementById(\"two\").innerHTML = clicks+1;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"two\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+2)\r\n");
      out.write("    document.getElementById(\"three\").innerHTML = clicks+2;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"three\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+3)\r\n");
      out.write("    document.getElementById(\"four\").innerHTML = clicks+3;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"four\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+4)\r\n");
      out.write("    document.getElementById(\"five\").innerHTML = clicks+4;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"five\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+5)\r\n");
      out.write("    document.getElementById(\"six\").innerHTML = clicks+5;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"six\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+6)\r\n");
      out.write("    document.getElementById(\"seven\").innerHTML = clicks+6;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"seven\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+7)\r\n");
      out.write("    document.getElementById(\"eight\").innerHTML = clicks+7;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"eight\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+8)\r\n");
      out.write("    document.getElementById(\"nine\").innerHTML = clicks+8;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"nine\").innerHTML = \"\";\r\n");
      out.write("    if(no_of_pages>clicks+9)\r\n");
      out.write("    document.getElementById(\"ten\").innerHTML = clicks+9;\r\n");
      out.write("    else\r\n");
      out.write("    document.getElementById(\"ten\").innerHTML = \"\";\r\n");
      out.write("    goToPage(document.getElementById(\"one\").innerHTML);\r\n");
      out.write("};    \r\n");
      out.write("\r\n");
      out.write("function addResults() {\r\n");
      out.write("\t\r\n");
      out.write("\tvar sr=document.getElementById(\"searchResults\");\r\n");
      out.write("\tvar empty=\"\";\r\n");
      out.write("\tvar text=\"<table id=\\\"result\\\"><tr><th>UPC</th><th>Manufacturer</th><th>Brand</th><th>Update</th><th>Delete</th></tr>\";\r\n");
      out.write("\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s00}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\".length>0)\r\n");
      out.write("\t\ttext+=\"<tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s00}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s01}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s02}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td><a class=\\\"linksTable\\\" onClick=\\\"updateRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s00}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Update</a></td><td><a class=\\\"linksTable\\\" onClick=\\\"deleteRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s00}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Delete</a></td></tr>\";\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\tempty=\"No Results to display.\"\r\n");
      out.write("\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s10}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\".length>0)\r\n");
      out.write("\t\ttext+=\"<tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s10}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s11}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s12}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td><a class=\\\"linksTable\\\" onClick=\\\"updateRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s10}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Update</a></td><td><a class=\\\"linksTable\\\" onClick=\\\"deleteRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s10}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Delete</a></td></tr>\";\r\n");
      out.write("\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s20}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\".length>0)\r\n");
      out.write("\t\ttext+=\"<tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s20}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s21}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s22}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td><a class=\\\"linksTable\\\" onClick=\\\"updateRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s20}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Update</a></td><td><a class=\\\"linksTable\\\" onClick=\\\"deleteRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s20}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Delete</a></td></tr>\";\r\n");
      out.write("\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s30}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\".length>0)\r\n");
      out.write("\t\ttext+=\"<tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s30}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s31}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s32}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td><a class=\\\"linksTable\\\" onClick=\\\"updateRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s30}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Update</a></td><td><a class=\\\"linksTable\\\" onClick=\\\"deleteRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s30}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Delete</a></td></tr>\";\r\n");
      out.write("\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s40}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\".length>0)\r\n");
      out.write("\t\ttext+=\"<tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s40}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s41}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s42}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td><a class=\\\"linksTable\\\" onClick=\\\"updateRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s40}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Update</a></td><td><a class=\\\"linksTable\\\" onClick=\\\"deleteRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s40}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Delete</a></td></tr>\";\r\n");
      out.write("\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s50}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\".length>0)\r\n");
      out.write("\t\ttext+=\"<tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s50}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s51}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s52}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td><a class=\\\"linksTable\\\" onClick=\\\"updateRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s50}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Update</a></td><td><a class=\\\"linksTable\\\" onClick=\\\"deleteRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s50}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Delete</a></td></tr>\";\r\n");
      out.write("\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s60}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\".length>0)\r\n");
      out.write("\t\ttext+=\"<tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s60}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s61}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s62}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td><a class=\\\"linksTable\\\" onClick=\\\"updateRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s60}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Update</a></td><td><a class=\\\"linksTable\\\" onClick=\\\"deleteRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s60}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Delete</a></td></tr>\";\r\n");
      out.write("\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s70}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\".length>0)\r\n");
      out.write("\t\ttext+=\"<tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s70}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s71}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s72}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td><a class=\\\"linksTable\\\" onClick=\\\"updateRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s70}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Update</a></td><td><a class=\\\"linksTable\\\" onClick=\\\"deleteRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s70}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Delete</a></td></tr>\";\r\n");
      out.write("\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s80}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\".length>0)\r\n");
      out.write("\t\ttext+=\"<tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s80}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s81}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s82}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td><a class=\\\"linksTable\\\" onClick=\\\"updateRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s80}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Update</a></td><td><a class=\\\"linksTable\\\" onClick=\\\"deleteRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s80}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Delete</a></td></tr>\";\r\n");
      out.write("\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s90}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\".length>0)\r\n");
      out.write("\t\ttext+=\"<tr><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s90}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s91}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s92}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td><td><a class=\\\"linksTable\\\" onClick=\\\"updateRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s90}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Update</a></td><td><a class=\\\"linksTable\\\" onClick=\\\"deleteRec(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s90}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\\\">Delete</a></td></tr>\";\r\n");
      out.write("\t\ttext+=\"</table>\";\r\n");
      out.write("\tsr.innerHTML+=text;\r\n");
      out.write("\tsr.innerHTML+=empty;\r\n");
      out.write("\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function deleteRec(upc)\r\n");
      out.write("{\tif(confirm('Are you sure you want to delete?'))\r\n");
      out.write("   location.href = URL_add_parameter(location.href, 'Delete', upc);\r\n");
      out.write("\t\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function updateRec(upc)\r\n");
      out.write("{\tvar x=URL_add_parameter(\"/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/update?\", 'UPC', upc);\r\n");
      out.write("\tx=URL_add_parameter(x, 'src', encodeURIComponent(location.href));\r\n");
      out.write("   \tlocation.href = x;\r\n");
      out.write("\t\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goToPage(page)\r\n");
      out.write("{location.href = URL_add_parameter(location.href, 'Page', page);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function URL_add_parameter(url, param, value){\r\n");
      out.write("    var hash       = {};\r\n");
      out.write("    var parser     = document.createElement('a');\r\n");
      out.write("\r\n");
      out.write("    parser.href    = url;\r\n");
      out.write("\r\n");
      out.write("    var parameters = parser.search.split(/\\?|&/);\r\n");
      out.write("\r\n");
      out.write("    for(var i=0; i < parameters.length; i++) {\r\n");
      out.write("        if(!parameters[i])\r\n");
      out.write("            continue;\r\n");
      out.write("\r\n");
      out.write("        var ary      = parameters[i].split('=');\r\n");
      out.write("        hash[ary[0]] = ary[1];\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    hash[param] = value;\r\n");
      out.write("\r\n");
      out.write("    var list = [];  \r\n");
      out.write("    Object.keys(hash).forEach(function (key) {\r\n");
      out.write("        list.push(key + '=' + hash[key]);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    parser.search = '?' + list.join('&');\r\n");
      out.write("    return parser.href;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2><a href=\"/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/create\">Insert a new Product</a></h2>\r\n");
      out.write("\r\n");
      out.write("<h2>Search repository by:</h2>\r\n");
      out.write("\r\n");
      out.write("<form id=\"search\" action=\"index#searchResults\" method=\"get\">\r\n");
      out.write("\r\n");
      out.write("<table style=\"width:40%\">\r\n");
      out.write("\r\n");
      out.write("<tr><td>UPC:</td><td><input type=\"text\" name=\"UPC\" size=\"35\" ></td></tr>\r\n");
      out.write("<tr><td>Manufacturer:</td><td><input type=\"text\" name=\"Manufacturer\" size=\"35\"></td></tr>\r\n");
      out.write("<tr><td>Brand:</td><td><input type=\"text\" name=\"Brand\" size=\"35\"></td></tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<button type=\"submit\" value=\"submit\" >Search</Button>\r\n");
      out.write("<button type=\"reset\" value=\"reset\" >Reset</Button>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("<h2>Search Results:</h2>\r\n");
      out.write("<div id=\"searchResults\" ></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table class=\"links\" >\r\n");
      out.write("<tr>\r\n");
      out.write("<td class=\"links\"><a id=\"first\" class=\"linksTable\" onClick=\"goToPage(1)\">First</a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"prev\" class=\"linksTable\" onClick=\"prev()\"><<</a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"one\" class=\"linksTable\" onClick=\"goToPage(this.innerHTML)\">1</a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"two\" class=\"linksTable\" onClick=\"goToPage(this.innerHTML)\">2</a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"three\" class=\"linksTable\" onClick=\"goToPage(this.innerHTML)\">3</a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"four\" class=\"linksTable\" onClick=\"goToPage(this.innerHTML)\">4</a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"five\" class=\"linksTable\" onClick=\"goToPage(this.innerHTML)\">5</a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"six\" class=\"linksTable\" onClick=\"goToPage(this.innerHTML)\">6</a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"seven\" class=\"linksTable\" onClick=\"goToPage(this.innerHTML)\">7</a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"eight\" class=\"linksTable\" onClick=\"goToPage(this.innerHTML)\">8</a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"nine\" class=\"linksTable\" onClick=\"goToPage(this.innerHTML)\">9</a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"ten\" class=\"linksTable\" onClick=\"goToPage(this.innerHTML)\">10</a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"next\" class=\"linksTable\" onClick=\"next()\">>></a></td>\r\n");
      out.write("<td class=\"links\"><a id=\"last\" class=\"linksTable\" onClick=\"goToPage(parseInt(no_of_pages))\">Last</a></td>\r\n");
      out.write("<td class=\"links\">Goto Page: <input id=\"jump\" name=\"Page\" form=\"search\" type=\"number\" value=\"1\" min=\"1\"max=\"\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<p id=\"test\"></p>\r\n");
      out.write("<p id=\"test2\"></p>\r\n");
      out.write("<br><br><br>\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${backlink}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("<br><br>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/pages/index.jsp(4,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/css/main.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/pages/index.jsp(5,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/js/jquery-2.1.4.js");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }
}
