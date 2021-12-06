package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_var_items_end_begin.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Home | E-Shopper</title>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->       \n");
      out.write("    <link rel=\"icon\" href=\"https://upload.wikimedia.org/wikipedia/commons/0/0e/Shopee_logo.svg\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.css\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "snow.jsp", out, false);
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("</head><!--/head-->\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\t\n");
      out.write("\t<section id=\"slider\"><!--slider-->\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t<div id=\"slider-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#slider-carousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#slider-carousel\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#slider-carousel\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item active\"  >\n");
      out.write("                                                            <img src=\"./images/hinh slide/1.png\"/>\n");
      out.write("                                                            \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item\" >\n");
      out.write("                                                            <img src=\"./images/hinh slide/2.png\"/>\n");
      out.write("                                                            \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                   \t<div class=\"item\" >\n");
      out.write("                                                            <img src=\"./images/hinh slide/3.png\"/>\n");
      out.write("                                                            \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<a href=\"#slider-carousel\" class=\"left control-carousel hidden-xs\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-angle-left\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#slider-carousel\" class=\"right control-carousel hidden-xs\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section><!--/slider-->\n");
      out.write("\t\n");
      out.write("\t<section>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "categoryleft.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-sm-9 padding-right\">\n");
      out.write("                           \n");
      out.write("\t\t\t\t\t<div class=\"features_items\"><!--features_items-->\n");
      out.write("                                            <h2 class=\"title text-center\">Features Items</h2>\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                 \n");
      out.write("                                          \n");
      out.write("\t\t\t\t\t</div><!--features_items-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"category-tab\"><!--category-tab-->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-tabs\">\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#tshirt\" data-toggle=\"tab\">TOYS & GAMES</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#blazers\" data-toggle=\"tab\">T-SHIRT</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#sunglass\" data-toggle=\"tab\">SKINCARE</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#kids\" data-toggle=\"tab\">ELECTRICAL</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#poloshirt\" data-toggle=\"tab\">TABLES</a></li>\n");
      out.write(" \n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                         \n");
      out.write("\t\t\t\t\t\t<div class=\"tab-content\">\n");
      out.write("                                                       <!--TAB TOY & GAME-->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade active in\" id=\"tshirt\" >\n");
      out.write("                                                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("\t\t\t\t\t\t\t<!--TAB T-SHIRT-->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"blazers\" >\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<!--TAB SKINCARE-->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"sunglass\" >\n");
      out.write("                                                            ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<!--TAB ELECTRICAL-->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"kids\" >\n");
      out.write("                                                            ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"poloshirt\" >\n");
      out.write("                                                            ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!--/category-tab-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"recommended_items\"><!--recommended_items-->\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title text-center\">recommended items</h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div id=\"recommended-item-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item active\">\t\n");
      out.write("                                                                    ");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                            \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item\">\t\n");
      out.write("                                                                    ");
      if (_jspx_meth_c_forEach_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t <a class=\"left recommended-item-control\" href=\"#recommended-item-carousel\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-left\"></i>\n");
      out.write("\t\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t\t  <a class=\"right recommended-item-control\" href=\"#recommended-item-carousel\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t  </a>\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!--/recommended_items-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <script src=\"js/price-range.js\"></script>\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.js\"></script>\n");
      out.write("    <script src=\"js/ajaxaddtocart.js\"></script>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <div class=\"col-sm-4\">\n");
          out.write("                                                            <div class=\"product-image-wrapper\">\n");
          out.write("                                                                    <div class=\"single-products\">\n");
          out.write("                                               \n");
          out.write("                                                                            <div class=\"productinfo text-center\">\n");
          out.write("                                                                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" />\n");
          out.write("                                                                                    <h2>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                                                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                                                </a>\n");
          out.write("                                                                                    <a name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"Get\" class=\"btn btn-default add-to-cart\"\n");
          out.write("                                                                                       onclick=\"showSwal('auto-close')\">\n");
          out.write("                                                                                           <i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("                                                                            </div>\n");
          out.write("                                                                            <div class=\"product-overlay\">\n");
          out.write("                                                                                    <div class=\"overlay-content\">\n");
          out.write("                                                                                        <a href=\"productdetail?pdid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                                                            <h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                                                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                                                        </a>\n");
          out.write("                                                                                            <a name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"Get\" class=\"btn btn-default add-to-cart\" \n");
          out.write("                                                                                               onclick=\"showSwal('auto-close')\">\n");
          out.write("                                                                                                <i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("\n");
          out.write("                                                                                       \n");
          out.write("                                                                                    </div>\n");
          out.write("                                                                            </div>\n");
          out.write("                                                                      \n");
          out.write("                                                                    </div>\n");
          out.write("                                                               \n");
          out.write("                                                                    <div class=\"choose\">\n");
          out.write("                                                                            <ul class=\"nav nav-pills nav-justified\">\n");
          out.write("                                                                                    <li><a href=\"#\"><i class=\"fa fa-plus-square\"></i>Add to wishlist</a></li>\n");
          out.write("                                                                                    <li><a href=\"#\"><i class=\"fa fa-plus-square\"></i>Add to compare</a></li>\n");
          out.write("                                                                            </ul>\n");
          out.write("                                                                    </div>\n");
          out.write("                                                            </div>\n");
          out.write("                                                      \n");
          out.write("                                                    </div>\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listToys}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    _jspx_th_c_forEach_1.setBegin(4);
    _jspx_th_c_forEach_1.setEnd(7);
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 183px;height:161px \" />\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <a name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"Get\" class=\"btn btn-default add-to-cart\" \n");
          out.write("                                                                                               onclick=\"showSwal('auto-close')\">\n");
          out.write("                                                                                                <i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTshirt}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("o");
    _jspx_th_c_forEach_2.setBegin(4);
    _jspx_th_c_forEach_2.setEnd(7);
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 183px;height:161px \" />\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <a name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"Get\" class=\"btn btn-default add-to-cart\" \n");
          out.write("                                                                                               onclick=\"showSwal('auto-close')\">\n");
          out.write("                                                                                                <i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSkincare}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("o");
    _jspx_th_c_forEach_3.setBegin(4);
    _jspx_th_c_forEach_3.setEnd(7);
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 183px;height:161px \" />\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <a name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"Get\" class=\"btn btn-default add-to-cart\" \n");
          out.write("                                                                                               onclick=\"showSwal('auto-close')\">\n");
          out.write("                                                                                                <i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listElec}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("o");
    _jspx_th_c_forEach_4.setBegin(4);
    _jspx_th_c_forEach_4.setEnd(7);
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 183px;height:161px \" />\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <a name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"Get\" class=\"btn btn-default add-to-cart\" \n");
          out.write("                                                                                               onclick=\"showSwal('auto-close')\">\n");
          out.write("                                                                                                <i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTables}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("o");
    _jspx_th_c_forEach_5.setBegin(4);
    _jspx_th_c_forEach_5.setEnd(7);
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 183px;height:161px \" />\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <a name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"Get\" class=\"btn btn-default add-to-cart\" \n");
          out.write("                                                                                               onclick=\"showSwal('auto-close')\">\n");
          out.write("                                                                                                <i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent(null);
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSPRecommed}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_6.setVar("o");
    _jspx_th_c_forEach_6.setBegin(0);
    _jspx_th_c_forEach_6.setEnd(2);
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
          out.write("                                                                                            <div class=\"productinfo text-center\">\n");
          out.write("                                                                                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 183px;height:161px \" />\n");
          out.write("                                                                                                    <h2>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                                                                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                                                                    <a name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"Get\" class=\"btn btn-default add-to-cart\" \n");
          out.write("                                                                                                       accesskey=\"\"onclick=\"showSwal('auto-close')\">\n");
          out.write("                                                                                                <i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("                                                                                            </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("                                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent(null);
    _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSPRecommed}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_7.setVar("o");
    _jspx_th_c_forEach_7.setBegin(3);
    _jspx_th_c_forEach_7.setEnd(5);
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
          out.write("                                                                                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 183px;height:161px \" />\n");
          out.write("                                                                                                    <h2>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                                                                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                                                                    <a name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"Get\" class=\"btn btn-default add-to-cart\" \n");
          out.write("                                                                                                    onclick=\"showSwal('auto-close')\">\n");
          out.write("                                                                                                    <i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("                                                                                                </div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("                                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_7.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_7);
    }
    return false;
  }
}
