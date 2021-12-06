package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Checkout | E-Shopper</title>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->       \n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "snow.jsp", out, false);
      out.write("\n");
      out.write("</head><!--/head-->\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\t<section id=\"cart_items\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"breadcrumbs\">\n");
      out.write("\t\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t\t  <li><a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t\t  <li class=\"active\">Check out</li>\n");
      out.write("\t\t\t\t</ol>\n");
      out.write("\t\t\t</div><!--/breadcrums-->\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"step-one\">\n");
      out.write("\t\t\t\t<h2 class=\"heading\">Step1</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"checkout-options\">\n");
      out.write("\t\t\t\t<h3>New User</h3>\n");
      out.write("\t\t\t\t<p>Checkout options</p>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div><!--/checkout-options-->\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"register-req\">\n");
      out.write("\t\t\t\t<p>Please use Register And Checkout to easily get access to your order history, or use Checkout as Guest</p>\n");
      out.write("\t\t\t</div><!--/register-req-->\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"shopper-informations\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\n");
      out.write("                                    <div class=\"col-sm-12 clearfix\">\n");
      out.write("\t\t\t\t\t\t<div class=\"bill-to\">\n");
      out.write("\t\t\t\t\t\t\t<p>Bill To</p>\n");
      out.write("                                                        <div class=\"newform\">\n");
      out.write("                                                            <form action=\"SendMailControl\" method=\"post\" style=\"display:flex;  flex-wrap: wrap;\">\n");
      out.write("                                                                <input name=\"email\" type=\"text\" placeholder=\"Email*\"/>\n");
      out.write("                                                                <input name=\"firstname\" type=\"text\" placeholder=\"First Name *\"/>\n");
      out.write("                                                                <input name=\"lastname\" type=\"text\" placeholder=\"Last Name *\"/>\n");
      out.write("                                                                <input name=\"phonenumber\" type=\"text\" placeholder=\"Phone Number \"/>\n");
      out.write("                                                                <input name=\"address\" type=\"text\" placeholder=\"Address *\"/>\n");
      out.write("                                                                <select name=\"country\">\n");
      out.write("                                                                    <option>-- Country --</option>\n");
      out.write("                                                                    <option value=\"United States\">United States</option>\n");
      out.write("                                                                    <option value=\"VietNam\">VietNam</option>\n");
      out.write("                                                                    <option value=\"UK\">UK</option>\n");
      out.write("                                                                </select>\n");
      out.write("                                                                \n");
      out.write("                                                                 <select name=\"province\">\n");
      out.write("                                                                    <option>Province</option>\n");
      out.write("                                                                    <option value=\"TP HCM\">TP HCM</option>\n");
      out.write("                                                                    <option value=\"Ha Noi\">Ha Noi</option>\n");
      out.write("                                                                    <option value=\"Da Nang\">Da Nang</option>\n");
      out.write("                                                                </select>\n");
      out.write("                                                             \t<input name=\"zip\" type=\"text\" placeholder=\"Zip / Postal Code \">\n");
      out.write("                                                                <input name=\"shippingorder\" type=\"text\" placeholder=\"Notes about your order, Special Notes for Delivery\" style=\"width: 100%;height: 120px\"/>\n");
      out.write("                                                                <button type=\"submit\" class=\"btn btn-success\" style=\"margin-left: 10px;\">CHECKOUT</button>\n");
      out.write("                                                            </form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"review-payment\">\n");
      out.write("\t\t\t\t<h2>Review & Payment</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"table-responsive cart_info\">\n");
      out.write("\t\t\t\t<table class=\"table table-condensed\">\n");
      out.write("\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr class=\"cart_menu\">\n");
      out.write("\t\t\t\t\t\t\t<td class=\"image\">Item</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"description\"></td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"price\">Price</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"quantity\">Quantity</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"total\">Total</td>\n");
      out.write("\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t<tbody>\n");
      out.write("                                             ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"4\">&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table table-condensed total-result\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Cart Sub Total</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td> $");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.totalorder}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Exo Tax</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>$2</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"shipping-cost\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Shipping Cost</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Free</td>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Total</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><span>$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.totalorder+2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</section> <!--/#cart_items-->\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("item");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"cart_product\">\n");
          out.write("\t\t\t\t\t\t\t\t    <a href=\"\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 250px;height: 250px;\"></a>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"cart_description\">\n");
          out.write("\t\t\t\t\t\t\t\t<h4><a href=\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"cart_price\">\n");
          out.write("\t\t\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"cart_quantity\">\n");
          out.write("                                                            <div class=\"cart_quantity_button\">\n");
          out.write("                                                                    <a class=\"cart_quantity_up\" href=\"upquantity?iid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.iid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&&qid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.iquanity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&&value1=1\">+</a>\n");
          out.write("                                                                    <input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.iquanity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" autocomplete=\"off\" size=\"2\">\n");
          out.write("                                                                    <a class=\"cart_quantity_down\" href=\"upquantity?iid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.iid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&&qid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.iquanity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&&value1=0\"> - </a>\n");
          out.write("                                                            </div>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"cart_total\">\n");
          out.write("\t\t\t\t\t\t\t\t<p class=\"cart_total_price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.totalprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("                                                        <td class=\"cart_delete\">\n");
          out.write("                                                            <a class=\"cart_quantity_delete\" href=\"deleteitemcart?iid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.iid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"fa fa-times\"></i></a>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("                                             ");
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
}
