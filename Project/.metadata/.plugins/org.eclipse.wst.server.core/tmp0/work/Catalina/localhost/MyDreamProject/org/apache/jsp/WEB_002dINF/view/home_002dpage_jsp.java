/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2017-08-02 19:44:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_002dpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/view/footer.jsp", Long.valueOf(1501519947000L));
    _jspx_dependants.put("/WEB-INF/view/loginmodule.jsp", Long.valueOf(1501701690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Shop Management System</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<!-- navbar css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/home.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/footer.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/loginfrom.css\" />\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Codystar' rel='stylesheet'>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\"#myNavbar\">\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span> \n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand shopname\" href=\"#\">Nutan Hardware & Tent House</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"#\">AboutUs</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Career</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">FAQ</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<!-- <li><a onclick=\"document.getElementById('id01').style.display='block'\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("\t\t\t\t\t\t\tSign Up</a></li> -->\n");
      out.write("\t\t\t\t\t<li><a onclick=\"document.getElementById('id01').style.display='block'\" href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span>\n");
      out.write("\t\t\t\t\t\t\tLogin/Sign Up</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<!-- Login Form -->\n");
      out.write("\t<div id=\"id01\" class=\"modal\">\n");
      out.write("\t\t ");
      out.write("<div class=\"modal-content animate\">\n");
      out.write("\t\t\t<div class=\"imgcontainer\">\n");
      out.write("\t\t\t\t <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("\t\t\t\t<!-- <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/Store1.jpg\" alt=\"Avatar\" class=\"avatar\"> -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div id=\"loginview\" class=\"row modelbody\" style=\"margin-bottom:5px;\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6\" style=\"border-right:1px solid #f1f1f1;\">\n");
      out.write("\t\t\t\t\t<h4>Login with your account</h4>\n");
      out.write("\t\t\t\t\t<form action=\"\" method=\"POST\">\n");
      out.write("\t\t\t\t\t\t<input class=\"form-control\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" placeholder=\"Enter Username\" name=\"uname\" required/><br/>\n");
      out.write("\t\t\t\t\t\t<input class=\"form-control\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"password\" placeholder=\"Enter Password\" name=\"psw\" required/><br/>\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked=\"checked\"/> Remember me\n");
      out.write("\t\t\t\t\t\t<button class=\"pull-right submitbtn\" type=\"submit\">Login<b>&rarr;</b></button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t<h4>Or login with</h4>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\">FACEBOOK</a>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"pull-right btn btn-primary\">GOOGLE+</a>\t\n");
      out.write("\t\t\t\t\t<hr/>\n");
      out.write("\t\t\t\t\t<h4>Forget your password?</h4>\n");
      out.write("\t\t\t\t\t<p>no worries, click here to <a onclick=\"resetform()\" href=\"#\">reset</a> your password.</p>\n");
      out.write("\t\t\t\t\tDon't have an account yet ?  <a onclick=\"showform()\" href=\"#\">Create an account</a>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"signupview\" class=\"row modelbody\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6\" style=\"border-right:1px solid #f1f1f1;padding-bottom:5px;\">\n");
      out.write("\t\t\t\t\t<h4>Sign Up</h4>\n");
      out.write("\t\t\t\t\t<p>Enter your details below</p>\n");
      out.write("\t\t\t\t\t<form action=\"\" method=\"POST\">\n");
      out.write("\t\t\t\t\t\t<input class=\"form-control\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" placeholder=\"Full Name\" name=\"name\" required/><br/>\n");
      out.write("\t\t\t\t\t\t<input class=\"form-control\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" placeholder=\"Enter Username\" name=\"uname\" required/><br/>\n");
      out.write("\t\t\t\t\t\t<input class=\"form-control\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"password\" placeholder=\"Enter Password\" name=\"psw\" required/><br/>\n");
      out.write("\t\t\t\t\t\t<input class=\"form-control\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"password\" placeholder=\"ReEnter Password\" name=\"psw1\" required/><br/>\n");
      out.write("\t\t\t\t\t\t<a class=\"submitbtn btn\" onclick=\"backform()\" href=\"#\"><b>&larr;</b>Back</a>\n");
      out.write("\t\t\t\t\t\t<button class=\"pull-right submitbtn\" type=\"submit\">Sign Up<b>&rarr;</b></button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t<h4>Or login with</h4>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\">FACEBOOK</a>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"pull-right btn btn-primary\">GOOGLE+</a>\t\n");
      out.write("\t\t\t\t\t<hr/>\n");
      out.write("\t\t\t\t\t<h4>Forget your password?</h4>\n");
      out.write("\t\t\t\t\t<p>no worries, click here to <a onclick=\"resetform()\" href=\"#\">reset</a> your password.</p>\n");
      out.write("\t\t\t\t\tDon't have an account yet ?  <a onclick=\"showform()\" href=\"#\">Create an account</a>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"resetview\" class=\"row modelbody\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6\" style=\"border-right:1px solid #f1f1f1;padding-bottom:5px;\">\n");
      out.write("\t\t\t\t\t<h4>Forget Password?</h4>\n");
      out.write("\t\t\t\t\t<p>Enter your e-mail address below to reset your password.</p>\n");
      out.write("\t\t\t\t\t<form action=\"\" method=\"POST\">\n");
      out.write("\t\t\t\t\t\t<input class=\"form-control\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" placeholder=\"Enter Username\" name=\"uname\" required/><br/>\n");
      out.write("\t\t\t\t\t\t<a class=\"submitbtn btn\" onclick=\"backform()\" href=\"#\"><b>&larr;</b>Back</a>\n");
      out.write("\t\t\t\t\t\t<button class=\"pull-right submitbtn\" type=\"submit\">Submit<b>&rarr;</b></button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t<h4>Or login with</h4>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\">FACEBOOK</a>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"pull-right btn btn-primary\">GOOGLE+</a>\t\n");
      out.write("\t\t\t\t\t<hr/>\n");
      out.write("\t\t\t\t\t<h4>Forget your password?</h4>\n");
      out.write("\t\t\t\t\t<p>no worries, click here to <a onclick=\"resetform()\" href=\"#\">reset</a> your password.</p>\n");
      out.write("\t\t\t\t\tDon't have an account yet ?  <a onclick=\"showform()\" href=\"#\">Create an account</a>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"containerr\">\n");
      out.write("\t\t\t\t<p class=\"text-center\">Thanks for being our part</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- End Login Form -->\n");
      out.write("\t<!-- carousel Start -->\n");
      out.write("\t<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t<!-- Indicators -->\n");
      out.write("\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t</ol>\n");
      out.write("\t\t<!-- Wrapper for slides -->\n");
      out.write("\t\t<div class=\"carousel-inner\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"item active\">\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/nuts_volts.jpg\"\n");
      out.write("\t\t\t\t\talt=\"Nuts Volts\" style=\"width: 100%;\">\n");
      out.write("\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t<h3>Nuts volts</h3>\n");
      out.write("\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/paints.jpg\"\n");
      out.write("\t\t\t\t\talt=\"paits\" style=\"width: 100%;\">\n");
      out.write("\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t<h3>Paints</h3>\n");
      out.write("\t\t\t\t\t<p>We have different colors</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/Store1.jpg\"\n");
      out.write("\t\t\t\t\talt=\"store1\" style=\"width: 100%;\">\n");
      out.write("\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t<h3>Equipment</h3>\n");
      out.write("\t\t\t\t\t<p>We are selling all hardware things.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/kohli-tent-house-9.jpg\"\n");
      out.write("\t\t\t\t\talt=\"store1\" style=\"width: 100%;\">\n");
      out.write("\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t<h3>Marriage Decoration</h3>\n");
      out.write("\t\t\t\t\t<p>We are doing full decoration.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Left and right controls -->\n");
      out.write("\t\t<a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-chevron-left\"></span> <span\n");
      out.write("\t\t\tclass=\"sr-only\">Previous</span>\n");
      out.write("\t\t</a> <a class=\"right carousel-control\" href=\"#myCarousel\"\n");
      out.write("\t\t\tdata-slide=\"next\"> <span\n");
      out.write("\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></span> <span\n");
      out.write("\t\t\tclass=\"sr-only\">Next</span>\n");
      out.write("\t\t</a>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Short details about our SHOP -->\n");
      out.write("\t<div class=\"about\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-8 col-xs-12\">\n");
      out.write("\t\t\t\t\t<h2>NTH is one of leading shop in this market.</h2>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<p>We are a rapidly growing Hardware and Tent House SHOP, focused on good product, services.</p></li>\n");
      out.write("\t\t\t\t\t\t<li><p>Since our beginning in 2002, we have grown in size and scale. We are providing good service according to our customers.</p></li>\n");
      out.write("\t\t\t\t\t\t<li><p>We have more then 2000 products for Hardware shop and More then 500 type of decoration in Tent House.</p></li>\n");
      out.write("\t\t\t\t\t\t<li><p>We are selling quality of product, where we assured that product will worthy according to your investment.</p></li>\n");
      out.write("\t\t\t\t\t\t<li><p>Our customer are valuable for us. We are taking care about his requirement.</p></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-xs-12 text-center\">\n");
      out.write("\t\t\t\t\t<span class=\"glyphicon glyphicon-signal logo\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- ENd Short details -->\n");
      out.write("\t<!-- Start Service in our shop -->\n");
      out.write("\t<div id=\"services\" class=\"container-fluid text-center\">\n");
      out.write("\t\t<h2>SERVICES</h2>\n");
      out.write("\t\t<h4>What we offer</h4>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<div class=\"row slideanim\">\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-off logo-small\"></span>\n");
      out.write("\t\t\t\t<h4>POWER</h4>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet..</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-heart logo-small\"></span>\n");
      out.write("\t\t\t\t<h4>LOVE</h4>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet..</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-lock logo-small\"></span>\n");
      out.write("\t\t\t\t<h4>JOB DONE</h4>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet..</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br><br>\n");
      out.write("\t\t<div class=\"row slideanim\">\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-leaf logo-small\"></span>\n");
      out.write("\t\t\t\t<h4>GREEN</h4>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet..</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-certificate logo-small\"></span>\n");
      out.write("\t\t\t\t<h4>CERTIFIED</h4>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet..</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-wrench logo-small\"></span>\n");
      out.write("\t\t\t\t<h4 style=\"color:#303030;\">HARD WORK</h4>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet..</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- End service Part of our shop -->\n");
      out.write("\t");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\t<footer>\n");
      out.write("\t\t<div class=\"footer\" id=\"footer\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-2  col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("\t\t\t\t\t\t<h3>Lorem Ipsum</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-2  col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("\t\t\t\t\t\t<h3>Lorem Ipsum</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-2  col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("\t\t\t\t\t\t<h3>Lorem Ipsum</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-2  col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("\t\t\t\t\t\t<h3>Lorem Ipsum</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Lorem Ipsum </a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3  col-md-3 col-sm-6 col-xs-12 \">\n");
      out.write("\t\t\t\t\t\t<h3>Lorem Ipsum</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-append newsletter-box text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"full text-center\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"Email \">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn  bg-gray\" type=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsuscribe <i class=\"fa fa-long-arrow-right\"> </i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul class=\"social\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> <i class=\" fa fa-facebook\"> </i>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> <i class=\"fa fa-twitter\"> </i>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> <i class=\"fa fa-google-plus\"> </i>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> <i class=\"fa fa-pinterest\"> </i>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> <i class=\"fa fa-youtube\"> </i>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--/.row-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--/.container-->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--/.footer-->\n");
      out.write("\n");
      out.write("\t\t<div class=\"footer-bottom\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<p class=\"pull-left\">Copyright 2002 - <span id=\"datee\"></span> © NTH. All right\n");
      out.write("\t\t\t\t\treserved.</p>\n");
      out.write("\t\t\t\t<div class=\"pull-right\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-pills payments\">\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-cc-visa\"></i></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-cc-mastercard\"></i></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-cc-amex\"></i></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-cc-paypal\"></i></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--/.footer-bottom-->\n");
      out.write("\t</footer>\n");
      out.write("\t\n");
      out.write("\t<script>\n");
      out.write("$(document).ready(function(){ \n");
      out.write("    var d = new Date();\n");
      out.write("    var n = d.getFullYear();\n");
      out.write("    document.getElementById(\"datee\").innerHTML = n;\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\t");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("// Get the modal\n");
      out.write("var modal = document.getElementById('id01');\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("    if (event.target == modal) {\n");
      out.write("        modal.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t$(\"#signupview\").hide();\n");
      out.write("\t\t\t$(\"#resetview\").hide();\n");
      out.write("\t\t});\n");
      out.write("\t\tfunction showform(){\n");
      out.write("\t\t\t$(\"#loginview\").hide();\n");
      out.write("\t\t\t$(\"#resetview\").hide();\n");
      out.write("\t\t\t$(\"#signupview\").show();\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction backform(){\n");
      out.write("\t\t\t$(\"#loginview\").show();\n");
      out.write("\t\t\t$(\"#signupview\").hide();\n");
      out.write("\t\t\t$(\"#resetview\").hide();\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction resetform(){\n");
      out.write("\t\t\t$(\"#loginview\").hide();\n");
      out.write("\t\t\t$(\"#signupview\").hide();\n");
      out.write("\t\t\t$(\"#resetview\").show();\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
