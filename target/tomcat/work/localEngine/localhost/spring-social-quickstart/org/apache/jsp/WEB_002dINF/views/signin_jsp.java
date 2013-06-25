package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/views/header.jspf");
  }

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
      out.write("\t\t <!DOCTYPE html> \n");
      out.write("\t");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\">");
      out.write("<head>");
      out.write("<title>");
      out.write("Tenmarks");
      out.write("</title>");
      out.write("<meta charset=\"utf-8\"/>");
      out.write("<meta content=\"\" name=\"description\"/>");
      out.write("<meta content=\"\" name=\"author\"/>");
      out.write("<script src=\"resources/js/jquery-1.6.4.min.js\">");
      out.write("<!-- -->");
      out.write("</script>");
      out.write("<script src=\"resources/js/jquery-ui-1.8.16.custom.min.js\">");
      out.write("<!-- -->");
      out.write("</script>");
      out.write("<script src=\"resources/js/form.js\">");
      out.write("<!-- -->");
      out.write("</script>");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/bootstrap-1.4.0.min.css\"/>");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/flick/jquery-ui-1.8.16.custom.css\"/>");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/style.css\"/>");
      out.write("</head>");
      out.write("<body>");
      out.write("<div class=\"container\">");
      out.write("<div class=\"row\">");
      out.write("<div class=\"span14 columns offset2\">");
      out.write("<h1>");
      out.write("Login");
      out.write("</h1>");
      out.write("<form method=\"POST\" action=\"signin/google\">");
      out.write("<button class=\"btn large primary\" type=\"submit\">");
      out.write("Sign in with Google");
      out.write("</button>");
      out.write("<input value=\"https://www.googleapis.com/auth/userinfo.profile https://www.googleapis.com/auth/userinfo#email\" name=\"scope\" type=\"hidden\"/>");
      out.write("</form>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</body>");
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
