package org.apache.jsp.WEB_002dINF.pages.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/pages/admin/../layout/admin/resource.jsp");
    _jspx_dependants.add("/WEB-INF/pages/admin/../layout/admin/header.jsp");
    _jspx_dependants.add("/WEB-INF/pages/admin/../layout/admin/navbar.jsp");
    _jspx_dependants.add("/WEB-INF/pages/admin/../layout/admin/footer.jsp");
  }

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("<title>Admin Page</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Core CSS - Include with every page -->\r\n");
      out.write("<link href=\"/assets/admin/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/assets/admin/css/bootstrap-select.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/assets/admin/font-awesome/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Page-Level Plugin CSS - Tables -->\r\n");
      out.write("<link href=\"/assets/admin/css/plugins/dataTables/dataTables.bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- SB Admin CSS - Include with every page -->\r\n");
      out.write("<link href=\"/assets/admin/css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/assets/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"/assets/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"/assets/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"/assets/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" href=\"/assets/ico/apple-touch-icon-57-precomposed.png\">");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("        ");
      out.write("<div class=\"navbar-header\">\r\n");
      out.write("    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.html\">OnlineShopping Enterprise</a>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.navbar-header -->\r\n");
      out.write("\r\n");
      out.write("<ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("<li class=\"dropdown\">\r\n");
      out.write("    <a href=\"/\">\r\n");
      out.write("        Store Front\r\n");
      out.write("    </a>\r\n");
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("<li class=\"dropdown\">\r\n");
      out.write("    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("        <i class=\"fa fa-envelope fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    <ul class=\"dropdown-menu dropdown-messages\">\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <strong>John Smith</strong>\r\n");
      out.write("                                    <span class=\"pull-right text-muted\">\r\n");
      out.write("                                        <em>Yesterday</em>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <strong>John Smith</strong>\r\n");
      out.write("                                    <span class=\"pull-right text-muted\">\r\n");
      out.write("                                        <em>Yesterday</em>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <strong>John Smith</strong>\r\n");
      out.write("                                    <span class=\"pull-right text-muted\">\r\n");
      out.write("                                        <em>Yesterday</em>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                <strong>Read All Messages</strong>\r\n");
      out.write("                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- /.dropdown-messages -->\r\n");
      out.write("</li>\r\n");
      out.write("<!-- /.dropdown -->\r\n");
      out.write("<li class=\"dropdown\">\r\n");
      out.write("    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("        <i class=\"fa fa-tasks fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    <ul class=\"dropdown-menu dropdown-tasks\">\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <strong>Task 1</strong>\r\n");
      out.write("                        <span class=\"pull-right text-muted\">40% Complete</span>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                        <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\"\r\n");
      out.write("                             aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\">\r\n");
      out.write("                            <span class=\"sr-only\">40% Complete (success)</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <strong>Task 2</strong>\r\n");
      out.write("                        <span class=\"pull-right text-muted\">20% Complete</span>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                        <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"20\"\r\n");
      out.write("                             aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%\">\r\n");
      out.write("                            <span class=\"sr-only\">20% Complete</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <strong>Task 3</strong>\r\n");
      out.write("                        <span class=\"pull-right text-muted\">60% Complete</span>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                        <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\"\r\n");
      out.write("                             aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\r\n");
      out.write("                            <span class=\"sr-only\">60% Complete (warning)</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <strong>Task 4</strong>\r\n");
      out.write("                        <span class=\"pull-right text-muted\">80% Complete</span>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                        <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"80\"\r\n");
      out.write("                             aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\">\r\n");
      out.write("                            <span class=\"sr-only\">80% Complete (danger)</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                <strong>See All Tasks</strong>\r\n");
      out.write("                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- /.dropdown-tasks -->\r\n");
      out.write("</li>\r\n");
      out.write("<!-- /.dropdown -->\r\n");
      out.write("<li class=\"dropdown\">\r\n");
      out.write("    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("        <i class=\"fa fa-bell fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    <ul class=\"dropdown-menu dropdown-alerts\">\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <i class=\"fa fa-comment fa-fw\"></i> New Comment\r\n");
      out.write("                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <i class=\"fa fa-twitter fa-fw\"></i> 3 New Followers\r\n");
      out.write("                    <span class=\"pull-right text-muted small\">12 minutes ago</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <i class=\"fa fa-envelope fa-fw\"></i> Message Sent\r\n");
      out.write("                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <i class=\"fa fa-tasks fa-fw\"></i> New Task\r\n");
      out.write("                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <i class=\"fa fa-upload fa-fw\"></i> Server Rebooted\r\n");
      out.write("                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                <strong>See All Alerts</strong>\r\n");
      out.write("                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- /.dropdown-alerts -->\r\n");
      out.write("</li>\r\n");
      out.write("<!-- /.dropdown -->\r\n");
      out.write("<li class=\"dropdown\">\r\n");
      out.write("    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("        <i class=\"fa fa-user fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("        <li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i> User Profile</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i> Settings</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"divider\"></li>\r\n");
      out.write("        <li><a href=\"/logout\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- /.dropdown-user -->\r\n");
      out.write("</li>\r\n");
      out.write("<!-- /.dropdown -->\r\n");
      out.write("</ul>");
      out.write("\r\n");
      out.write("        ");
      out.write("<div class=\"navbar-default navbar-static-side\" role=\"navigation\">\r\n");
      out.write("    <div class=\"sidebar-collapse\">\r\n");
      out.write("        <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("            <li class=\"sidebar-search\">\r\n");
      out.write("                <div class=\"input-group custom-search-form\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("                                <span class=\"input-group-btn\">\r\n");
      out.write("                                <button class=\"btn btn-default\" type=\"button\">\r\n");
      out.write("                                    <i class=\"fa fa-search\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /input-group -->\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"active\">\r\n");
      out.write("                <a href=\"/admin\"><i class=\"fa fa-dashboard fa-fw\"></i> Dashboard</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-bar-chart-o fa-fw\"></i> Catalog<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                <ul class=\"nav nav-second-level collapse\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/admin/category\">Category</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/admin/product\">Product</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-table fa-fw\"></i> Sales<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                <ul class=\"nav nav-second-level collapse\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/admin/order\">Order</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/admin/product\">Product</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-edit fa-fw\"></i> System<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                <ul class=\"nav nav-second-level\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">Users<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-third-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"/admin/users\">Users</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"/admin/users_group\">User Groups</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/admin/backup\">Backup/Restore</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- /#side-menu -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.sidebar-collapse -->\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div id=\"page-wrapper\">\r\n");
      out.write("        <br/>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-12\">\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">\r\n");
      out.write("                        <h4 class=\"panel-title\">\r\n");
      out.write("                            <p>Category</p>\r\n");
      out.write("                            <!--adding pull-right below, does not work-->\r\n");
      out.write("                            <span class=\"btn-group  btn-group-xs pull-right\">\r\n");
      out.write("                                <a href=\"/admin/category/insert\" class=\"btn btn-default btn-sm\">Insert</a>\r\n");
      out.write("                                <a href=\"#\" class=\"btn btn-default btn-sm\">Delete</a>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.panel-heading -->\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("                        <div class=\"table-responsive\">\r\n");
      out.write("                            <table class=\"table table-striped table-bordered table-hover\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th>Category Name</th>\r\n");
      out.write("                                    <th>Action</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.panel-body -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.panel -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.col-lg-12 -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Core Scripts - Include with every page -->\r\n");
      out.write("<script src=\"/assets/admin/js/jquery.js\"></script>\r\n");
      out.write("<script src=\"/assets/admin/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"/assets/admin/js/bootstrap-select.min.js\"></script>\r\n");
      out.write("<script src=\"/assets/admin/js/plugins/metisMenu/jquery.metisMenu.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Page-Level Plugin Scripts - Tables -->\r\n");
      out.write("<script src=\"/assets/admin/js/plugins/dataTables/jquery.dataTables.js\"></script>\r\n");
      out.write("<script src=\"/assets/admin/js/plugins/dataTables/dataTables.bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- SB Admin Scripts - Include with every page -->\r\n");
      out.write("<script src=\"/assets/admin/js/sb-admin.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    window.onload=function(){\r\n");
      out.write("        $('.selectpicker').selectpicker();\r\n");
      out.write("    };\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("<!-- Page-Level Demo Scripts - Tables - Use for reference -->\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        $('#dataTables-example').dataTable();\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCategory.content}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("categoryItem");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr title=\"/admin/order/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryItem.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"\">\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryItem.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td><a href=\"/admin/category/edit/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryItem.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a></td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
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
