/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-29 10:28:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userInfoPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>User Info</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"https://www.paypalobjects.com/api/checkout.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"dropdown btn btn-primary pull-right\">\r\n");
      out.write("    <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">Select Language\r\n");
      out.write("    <span class=\"caret\"></span></button>\r\n");
      out.write("    <ul class=\"dropdown-menu\">\r\n");
      out.write("      <li><a id=\"zh\">CHINESE &nbsp;&nbsp;<img border=\"0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/china.png\" width=\"50\" height=\"30\"></a></li>\r\n");
      out.write("      <li><a id=\"es\">SPANISH &nbsp;&nbsp;<img border=\"0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/spanish.png\" width=\"50\" height=\"30\"></a></li>\r\n");
      out.write("      <li><a id=\"en\">ENGLISH &nbsp;&nbsp;<img border=\"0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/english.png\" width=\"50\" height=\"30\"></a></li>\r\n");
      out.write("      <li><a id=\"ru\">RUSSION &nbsp;&nbsp;<img border=\"0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/russion.png\" width=\"50\" height=\"30\"></a></li>\r\n");
      out.write("      <li><a id=\"ja\">JAPANESE &nbsp;&nbsp;<img border=\"0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/japanese.png\" width=\"50\" height=\"30\"></a></li>\r\n");
      out.write("      <li><a id=\"de\">GERMAN &nbsp;&nbsp;<img border=\"0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/german.png\" width=\"50\" height=\"30\"></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("    <center>\r\n");
      out.write("     \r\n");
      out.write("    <h2 id=\"userInfoheading\">User Info Page</h2>\r\n");
      out.write(" \r\n");
      out.write("    <h3><span id=\"userInfowelcome\">Welcome</span> : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.userPrincipal.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write(" \r\n");
      out.write("    <b id=\"userInfoprotectedmsg\">This is protected page!</b>  \r\n");
      out.write("\t\t\t<h1 id=\"userInfopaypalindicater\">Please Click On Given Button For Payment<h1>\r\n");
      out.write("\t\t\t<div id=\"paypal-button-container\"></div>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t// Render the PayPal button\r\n");
      out.write("\r\n");
      out.write("\t\t\tpaypal.Button.render({\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// Set your environment\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tenv: 'sandbox', // sandbox | production\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// PayPal Client IDs - replace with your own\r\n");
      out.write("\t\t\t\t// Create a PayPal app: https://developer.paypal.com/developer/applications/create\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tclient: {\r\n");
      out.write("\t\t\t\t\tsandbox:    'AZDxjDScFpQtjWTOUtWKbyN_bDt4OgqaF4eYXlewfBP4-8aqX3PiV8e1GWU6liB2CUXlkA59kJXE7M6R',\r\n");
      out.write("\t\t\t\t\tproduction: 'Aco85QiB9jk8Q3GdsidqKVCXuPAAVbnqm0agscHCL2-K2Lu2L6MxDU2AwTZa-ALMn_N0z-s2MXKJBxqJ'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// Set to 'Pay Now'\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tcommit: true,\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// Wait for the PayPal button to be clicked\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tpayment: function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t// Make a client-side call to the REST api to create the payment\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\treturn paypal.rest.payment.create(this.props.env, this.props.client, {\r\n");
      out.write("\t\t\t\t\t\tintent:'sale',\r\n");
      out.write("\t\t\t\t\t\t payer:{\r\n");
      out.write("\t\t\t\t\t\t\t    payment_method:'paypal'\r\n");
      out.write("\t\t\t\t\t\t\t  },\r\n");
      out.write("\t\t\t\t\t\ttransactions: [\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tamount: { total: '0.01', currency: 'USD' }\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t]\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// Wait for the payment to be authorized by the customer\r\n");
      out.write("\t\t\t\tonAuthorize: function(data, actions) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t// Execute the payment\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\treturn actions.payment.execute().then(function(param) {\r\n");
      out.write("\t\t\t\t\t\tvar res = param.transactions[0].related_resources[0].sale;\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"data \"+JSON.stringify(res.id));\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"data \"+JSON.stringify(res.state));\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById('paypal-button-container').innerText = JSON.stringify(res.id)+\" , \"+JSON.stringify(res.state);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t}, '#paypal-button-container');\r\n");
      out.write("\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script src=\"./resources/js/translate.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}