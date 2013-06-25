package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/views/header.jspf");
    _jspx_dependants.add("/WEB-INF/views/bar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("Spring Social Google - Profile");
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
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("<div class=\"topbar\">");
      out.write("<div class=\"fill\">");
      out.write("<div class=\"container\">");
      out.write("<h3>");
      out.write("<a href=\"./\">");
      out.write("Spring Social Google");
      out.write("</a>");
      out.write("</h3>");
      out.write("<ul>");
      out.write("<li class=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${selected == 'profile' ? 'active' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\">");
      out.write("<a href=\"./\">");
      out.write("Profile");
      out.write("</a>");
      out.write("</li>");
      out.write("</ul>");
      out.write("<ul class=\"secondary-nav\">");
      out.write("<li>");
      out.write("<a href=\"signout\">");
      out.write("Sign Out");
      out.write("</a>");
      out.write("</li>");
      out.write("</ul>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"container\">");
      out.write("<h1>");
      out.write("User Profile");
      out.write("</h1>");
      out.write("<div class=\"row\">");
      out.write("<div class=\"span8 columns\">");
      out.write("<form>");
      out.write("<div class=\"clearfix\">");
      out.write("<label>");
      out.write("Profile ID:");
      out.write("</label>");
      out.write("<div class=\"input\">");
      out.write("<span class=\"uneditable-input\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profile.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"clearfix\">");
      out.write("<label>");
      out.write("E-mail:");
      out.write("</label>");
      out.write("<div class=\"input\">");
      out.write("<span class=\"uneditable-input\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profile.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"clearfix\">");
      out.write("<label>");
      out.write("Display Name:");
      out.write("</label>");
      out.write("<div class=\"input\">");
      out.write("<span class=\"uneditable-input\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profile.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"clearfix\">");
      out.write("<label>");
      out.write("First Name:");
      out.write("</label>");
      out.write("<div class=\"input\">");
      out.write("<span class=\"uneditable-input\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profile.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"clearfix\">");
      out.write("<label>");
      out.write("Last Name:");
      out.write("</label>");
      out.write("<div class=\"input\">");
      out.write("<span class=\"uneditable-input\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profile.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"clearfix\">");
      out.write("<label>");
      out.write("Gender:");
      out.write("</label>");
      out.write("<div class=\"input\">");
      out.write("<span class=\"uneditable-input\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profile.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"clearfix\">");
      out.write("<label>");
      out.write("Locale:");
      out.write("</label>");
      out.write("<div class=\"input\">");
      out.write("<span class=\"uneditable-input\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profile.locale}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("</form>");
      out.write("</div>");
      out.write("<div class=\"span8 columns\">");
      out.write("<div>");
      out.write("Profile Picture");
      out.write("</div>");
      out.write("<img src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profile.profilePictureUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\"/>");
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

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/profile.jsp(17,41) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/profile.jsp(17,41) 'profile'",_el_expressionfactory.createValueExpression("profile",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/profile.jsp(17,41) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("selected");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
