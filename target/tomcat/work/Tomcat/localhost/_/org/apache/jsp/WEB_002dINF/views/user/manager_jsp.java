/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-19 02:20:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname.release();
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("  \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>侧边栏</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/ionicons.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/AdminLTE.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/skins/all-skins.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/plugins/datatables/jquery.dataTables.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/plugins/datatables/dataTables.bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/css/bootstrap-treeview.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"overflow: hidden\" class=\"sidebar-mini\">\r\n");
      out.write("<!-- 查询、添加、批量删除、导出、刷新 -->\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("    <!-- 查询、添加、批量删除、导出、刷新 -->\r\n");
      out.write("    <div class=\"row-fluid\">\r\n");
      out.write("        <div class=\"pull-right\">\r\n");
      out.write("            <div class=\"btn-group\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary btn-sm\" id=\"btn-add\">\r\n");
      out.write("                    <i class=\"fa fa-plus\"></i> 添加\r\n");
      out.write("                </button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary btn-sm\" id=\"btn-delAll\">\r\n");
      out.write("                    <i class=\"fa fa-remove\"></i> 删除\r\n");
      out.write("                </button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary btn-sm\" id=\"btn-export\">\r\n");
      out.write("                    <i class=\"fa fa-sign-in\"></i> 导出\r\n");
      out.write("                </button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary btn-sm\" id=\"btn-re\">\r\n");
      out.write("                    <i class=\"fa fa-refresh\"></i> 刷新\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <form id=\"queryForm\" action=\"\" method=\"post\">\r\n");
      out.write("                <div class=\"col-xs-2\">\r\n");
      out.write("                    <input type=\"text\" id=\"keyword\" name=\"keyword\" class=\"form-control input-sm\"\r\n");
      out.write("                           placeholder=\"搜索\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary btn-sm\" id=\"btn-query\">\r\n");
      out.write("                    <i class=\"fa fa-search\"></i> 查询\r\n");
      out.write("                </button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--表格-->\r\n");
      out.write("    <table id=\"dataTable\" class=\"table table-striped table-bordered table-hover table-condensed\" align=\"center\">\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr class=\"info\">\r\n");
      out.write("            <!--<td><input type=\"checkbox\" id=\"checkAll\"></td>-->\r\n");
      out.write("            <th></th>\r\n");
      out.write("            <th>序号</th>\r\n");
      out.write("            <th>用户</th>\r\n");
      out.write("            <th>权限</th>\r\n");
      out.write("            <th>电话</th>\r\n");
      out.write("            <th>创建时间</th>\r\n");
      out.write("            <th>操作</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody></tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"modal fade\" id=\"editModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"modal-header\" >\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                        <span class=\"sr-only\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <h4 class=\"modal-title\" id=\"myModalLabel\">信息修改</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <form class=\"form-horizontal\"  id=\"editForm\" action=\"\" method=\"post\">\r\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"areaId\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"inputName\" class=\"col-sm-3 control-label\">姓名</label>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"areaNameCn\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"inputName\" class=\"col-sm-3 control-label\">手机</label>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"areaNameEn\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- modal-body END -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"submit\" id=\"btn-submit\" class=\"btn btn-primary\">确认</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/plugins/datatables/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/plugins/datatables/jquery.dataTables.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/plugins/fastclick/fastclick.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/dist/js/app.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/dist/js/demo.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/plugins/datatables/dataTables.bootstrap.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/plugins/datatables/jquery.dataTables.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap/js/bootstrap-treeview.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("//添加、修改异步提交地址\r\n");
      out.write("\t\tvar str = \"\";\r\n");
      out.write("    \t");
      if (_jspx_meth_shiro_005fhasAnyRoles_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("         \r\n");
      out.write("        var url = \"\";\r\n");
      out.write("        var tables = $(\"#dataTable\").dataTable({\r\n");
      out.write("            serverSide: true,//分页，取数据等等的都放到服务端去\r\n");
      out.write("            //processing: true,//载入数据的时候是否显示“载入中”\r\n");
      out.write("            pageLength: 10,  //首次加载的数据条数\r\n");
      out.write("            ordering: false, //排序操作在服务端进行，所以可以关了。\r\n");
      out.write("            pagingType: \"full_numbers\",\r\n");
      out.write("            autoWidth: false,\r\n");
      out.write("            stateSave: true,//保持翻页状态，和comTable.fnDraw(false);结合使用\r\n");
      out.write("            searching: false,//禁用datatables搜索\r\n");
      out.write("            ajax: {\r\n");
      out.write("                type: \"post\",\r\n");
      out.write("                url: \"");
      out.print(request.getContextPath());
      out.write("dataGrid\",\r\n");
      out.write("                dataSrc: \"data\",\r\n");
      out.write("                dataType:'json',\r\n");
      out.write("//                data: function (d) {\r\n");
      out.write("//                    var param = {};\r\n");
      out.write("//                    param.draw = d.draw;\r\n");
      out.write("//                    param.start = d.start;\r\n");
      out.write("//                    param.length = d.length;\r\n");
      out.write("//                    var formData = $(\"#queryForm\").serializeArray();//把form里面的数据序列化成数组\r\n");
      out.write("//                    formData.forEach(function (e) {\r\n");
      out.write("//                        param[e.name] = e.value;\r\n");
      out.write("//                    });\r\n");
      out.write("//                    return param;//自定义需要传递的参数。\r\n");
      out.write("//                }\r\n");
      out.write("//            },\r\n");
      out.write("                data:{\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            columns: [//对应上面thead里面的序列\r\n");
      out.write("                {\"data\": \"null\"},\r\n");
      out.write("                {\"data\": \"id\"},\r\n");
      out.write("                {\"data\": 'loginName'},\r\n");
      out.write("                {\"data\": 'name'},\r\n");
      out.write("                {\"data\": 'phone'},\r\n");
      out.write("                {\"data\": 'createTime'},\r\n");
      out.write("                {\"data\":'columnDefs'}\r\n");
      out.write("//                {\r\n");
      out.write("//                    \"data\": 'createTime',\r\n");
      out.write("//                    \"render\": function (data, type, full, callback) {\r\n");
      out.write("//                        return data.substr(0, 19)\r\n");
      out.write("//                    }\r\n");
      out.write("//                },\r\n");
      out.write("//                {\r\n");
      out.write("//                    \"data\": 'updateTime', defaultContent: \"\",\r\n");
      out.write("//                    \"render\": function (data, type, full, callback) {\r\n");
      out.write("//                        if (data != null && data != \"\") {\r\n");
      out.write("//                            return data.substr(0, 19)\r\n");
      out.write("//                        } else {\r\n");
      out.write("//                            return data;\r\n");
      out.write("//                        }\r\n");
      out.write("//                    }\r\n");
      out.write("//                },\r\n");
      out.write("//                {\"data\": null, \"width\": \"60px\"},\r\n");
      out.write("\r\n");
      out.write("            ],\r\n");
      out.write("\r\n");
      out.write("//操作按钮\r\n");
      out.write("            columnDefs: [\r\n");
      out.write("                {\r\n");
      out.write("                    targets: 0,\r\n");
      out.write("                    defaultContent: \"<input type='checkbox' name='checkList'>\"\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    targets: -1,\r\n");
      out.write("                    defaultContent: str\r\n");
      out.write("                }\r\n");
      out.write("            ],\r\n");
      out.write("            language: {\r\n");
      out.write("                lengthMenu: \"\",\r\n");
      out.write("                processing: \"\",\r\n");
      out.write("                paginate: {\r\n");
      out.write("                    previous: \"<\",\r\n");
      out.write("                    next: \">\",\r\n");
      out.write("                    first: \"<<\",\r\n");
      out.write("                    last: \">>\"\r\n");
      out.write("                },\r\n");
      out.write("                zeroRecords: \"\",\r\n");
      out.write("                info: \"\",\r\n");
      out.write("                infoEmpty: \"\",\r\n");
      out.write("                infoFiltered: \"\",\r\n");
      out.write("                sSearch: \"\",\r\n");
      out.write("            },\r\n");
      out.write("//在每次table被draw完后回调函数\r\n");
      out.write("            fnDrawCallback: function () {\r\n");
      out.write("                var api = this.api();\r\n");
      out.write("//获取到本页开始的条数\r\n");
      out.write("                var startIndex = api.context[0]._iDisplayStart;\r\n");
      out.write("                api.column(1).nodes().each(function (cell, i) {\r\n");
      out.write("                    cell.innerHTML = startIndex + i + 1;\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("//查询按钮\r\n");
      out.write("        $(\"#btn-query\").on(\"click\", function () {\r\n");
      out.write("            tables.fnDraw();//查询后不需要保持分页状态，回首页\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("//添加\r\n");
      out.write("        $(\"#btn-add\").on(\"click\", function () {\r\n");
      out.write("            url = \"\";\r\n");
      out.write("            $(\"input[name=typeId]\").val(0);\r\n");
      out.write("            $(\"input[name=typeNameCn]\").val(\"\");\r\n");
      out.write("            $(\"input[name=typeNameEn]\").val(\"\");\r\n");
      out.write("            $(\"#editModal\").modal(\"show\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("//批量删除\r\n");
      out.write("        $(\"#btn-delAll\").on(\"click\", function () {\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("//导出\r\n");
      out.write("        $(\"#btn-export\").on(\"click\", function () {\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("//刷新\r\n");
      out.write("        $(\"#btn-re\").on(\"click\", function () {\r\n");
      out.write("            tables.fnDraw(false);//刷新保持分页状态\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("//checkbox全选\r\n");
      out.write("        $(\"#checkAll\").on(\"click\", function () {\r\n");
      out.write("            if ($(this).prop(\"checked\") === true) {\r\n");
      out.write("                $(\"input[name='checkList']\").prop(\"checked\", $(this).prop(\"checked\"));\r\n");
      out.write("                $(\"#dataTable tbody tr\").addClass('selected');\r\n");
      out.write("                $(this).hasClass('selected')\r\n");
      out.write("            } else {\r\n");
      out.write("                $(\"input[name='checkList']\").prop(\"checked\", false);\r\n");
      out.write("                $(\"#dataTable tbody tr\").removeClass('selected');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("//修改\r\n");
      out.write("        $(\"#dataTable tbody\").on(\"click\", \"#editRow\", function () {\r\n");
      out.write("            var data = tables.api().row($(this).parents(\"tr\")).data();\r\n");
      out.write("            $(\"input[name=typeId]\").val(data.typeIdStr);\r\n");
      out.write("            $(\"input[name=typeNameCn]\").val(data.typeNameCn);\r\n");
      out.write("            $(\"input[name=typeNameEn]\").val(data.typeNameEn);\r\n");
      out.write("\r\n");
      out.write("            url = \"\";\r\n");
      out.write("\r\n");
      out.write("            $(\"#editModal\").modal(\"show\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(\"#btn-submit\").on(\"click\", function () {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                cache: false,\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                url: url,\r\n");
      out.write("                data: $(\"#editForm\").serialize(),\r\n");
      out.write("                async: false,\r\n");
      out.write("                error: function (request) {\r\n");
      out.write("                    showFail(\"Server Connection Error");
      out.print(request.getContextPath());
      out.write(".\");\r\n");
      out.write("                },\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    if (data.status == 1) {\r\n");
      out.write("                        $(\"#editModal\").modal(\"hide\");\r\n");
      out.write("                        showSuccess(\"\");\r\n");
      out.write("                        tables.fnDraw();\r\n");
      out.write("                    } else {\r\n");
      out.write("                        showFail(\"\");\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("//删除\r\n");
      out.write("        $(\"#dataTable tbody\").on(\"click\", \"#delRow\", function () {\r\n");
      out.write("            var data = tables.api().row($(this).parents(\"tr\")).data();\r\n");
      out.write("            if (confirm(\"是否确认删除这条信息?\")) {\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url: '',\r\n");
      out.write("                    type: 'delete',\r\n");
      out.write("                    dataType: \"json\",\r\n");
      out.write("                    cache: \"false\",\r\n");
      out.write("                    success: function (data) {\r\n");
      out.write("                        if (data.status == 1) {\r\n");
      out.write("                            showSuccess();\r\n");
      out.write("                            tables.api().row().remove().draw(false);\r\n");
      out.write("                        } else {\r\n");
      out.write("                            showFail();\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    error: function (err) {\r\n");
      out.write("                        showFail(\"Server Connection Error");
      out.print(request.getContextPath());
      out.write(".\");\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_shiro_005fhasAnyRoles_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasAnyRoles
    org.apache.shiro.web.tags.HasAnyRolesTag _jspx_th_shiro_005fhasAnyRoles_005f0 = (org.apache.shiro.web.tags.HasAnyRolesTag) _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname.get(org.apache.shiro.web.tags.HasAnyRolesTag.class);
    _jspx_th_shiro_005fhasAnyRoles_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasAnyRoles_005f0.setParent(null);
    // /WEB-INF/views/user/manager.jsp(128,5) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasAnyRoles_005f0.setName("admin");
    int _jspx_eval_shiro_005fhasAnyRoles_005f0 = _jspx_th_shiro_005fhasAnyRoles_005f0.doStartTag();
    if (_jspx_eval_shiro_005fhasAnyRoles_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t str+= \"<div class='btn-group'>\" +\r\n");
        out.write("         \"<button id='editRow' class='btn btn-primary btn-sm' type='button'><i class='fa fa-edit'></i></button>\" +\r\n");
        out.write("         \"<button id='delRow' class='btn btn-primary btn-sm' type='button'><i class='fa fa-trash-o'></i></button>\" +\r\n");
        out.write("         \"</div>\"\r\n");
        out.write("    \t ");
        int evalDoAfterBody = _jspx_th_shiro_005fhasAnyRoles_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasAnyRoles_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname.reuse(_jspx_th_shiro_005fhasAnyRoles_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname.reuse(_jspx_th_shiro_005fhasAnyRoles_005f0);
    return false;
  }
}