<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 2 | with iframe</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/dist/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/dist/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/dist/css/skins/all-skins.min.css">

    <style type="text/css">
        html {
            overflow: hidden;
        }
    </style>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="plugins/ie9/html5shiv.min.js"></script>
    <script src="plugins/ie9/respond.min.js"></script>
    <![endif]-->
</head>
<body class="hold-transition skin-blue sidebar-mini fixed">
<div class="wrapper">

    <header class="main-header">
        <!-- Logo -->
        <a href="#" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>A</b>LT</span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>Admin</b>LTE</span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>

            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="<%=request.getContextPath()%>/dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                            <span class="hidden-xs">
                            	<!-- 显示登录用户名 -->
                            	<shiro:principal property="name" />
                            </span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header">
                                <img src="<%=request.getContextPath()%>/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                                <p>
                                    个人介绍
                                    <small>创建时间
                                    		<shiro:principal property="name" />
                                    </small>
                                </p>
                            </li>
                            <!-- Menu Body -->
                            <li class="user-body">
                                <div class="row">
                                    <div class="col-xs-4 text-center">
                                        <a href="#">关注</a>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <a href="#">粉丝</a>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <a href="#">好友</a>
                                    </div>
                                </div>
                                <!-- /.row -->
                            </li>
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="#" class="btn btn-default btn-flat">修改</a>
                                </div>
                                <div class="pull-right">
                                      <a href="#" class="btn btn-default btn-flat" data-toggle="modal" data-target="#myModal">注销</a>
                                </div>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">
        <!-- 左侧边栏 -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="<%=request.getContextPath()%>/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p><shiro:principal property="name"/></p>
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>
            <!-- 搜索框 -->
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control" placeholder="搜索...">
                    <span class="input-group-btn">
                <button type="button" name="search" id="search-btn" class="btn btn-flat" onclick="search_menu()"><i class="fa fa-search"></i>
                </button>
              </span>
                </div>
            </form>
            <!-- /.search form -->
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">

            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper" id="content-wrapper" style="min-height: 421px;">
        <!--bootstrap tab风格 多标签页-->
        <div class="content-tabs">
            <button class="roll-nav roll-left tabLeft" onclick="scrollTabLeft()">
                <i class="fa fa-backward"></i>
            </button>
            <nav class="page-tabs menuTabs tab-ui-menu" id="tab-menu">
                <div class="page-tabs-content" style="margin-left: 0px;">

                </div>
            </nav>
            <button class="roll-nav roll-right tabRight" onclick="scrollTabRight()">
                <i class="fa fa-forward" style="margin-left: 3px;"></i>
            </button>
            <div class="btn-group roll-nav roll-right">
                <button class="dropdown tabClose" data-toggle="dropdown">
                    页签操作<i class="fa fa-caret-down" style="padding-left: 3px;"></i>
                </button>
                <ul class="dropdown-menu dropdown-menu-right" style="min-width: 128px;">
                    <li><a class="tabReload" href="javascript:refreshTab();">刷新当前</a></li>
                    <li><a class="tabCloseCurrent" href="javascript:closeCurrentTab();">关闭当前</a></li>
                    <li><a class="tabCloseAll" href="javascript:closeOtherTabs(true);">全部关闭</a></li>
                    <li><a class="tabCloseOther" href="javascript:closeOtherTabs();">除此之外全部关闭</a></li>
                </ul>
            </div>
            <button class="roll-nav roll-right fullscreen" onclick="App.handleFullScreen()"><i
                    class="fa fa-arrows-alt"></i></button>
        </div>
        <div class="content-iframe " style="background-color: #ffffff; ">
            <div class="tab-content " id="tab-content">

            </div>
        </div>
    </div>
    <!-- /.content-wrapper -->

    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 2.3.8
        </div>
        <strong>Copyright &copy; 2014-2016 <a href="http://almsaeedstudio.com">Almsaeed Studio</a>.</strong> All rights
        reserved.
    </footer>
	<!--隐藏的退出弹窗点击退出显示-->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">确定要退出吗？</h4>
					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">我在想想
						</button>
						<button type="button" class="btn btn-primary" id="loginOut">
							确定
						</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal -->
		</div>
	</div>
<!-- ./wrapper -->

<!-- jQuery 2.2.3 -->
<script src="<%=request.getContextPath()%>/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
<!-- Slimscroll -->
<script src="<%=request.getContextPath()%>/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="<%=request.getContextPath()%>/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="<%=request.getContextPath()%>/dist/js/app.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="<%=request.getContextPath()%>/dist/js/demo.js"></script>

<!--tabs-->
<script src="<%=request.getContextPath()%>/dist/js/app_iframe.js"></script>

<!--<script src="../dist/js/jquery.blockui.min.js"></script>
<script src="../dist/js/appx.js"></script>
<script src="../dist/js/bootstrap-tab.js"></script>
<script src="../dist/js/sidebarMenu.js"></script>-->

<script type="text/javascript">
    /**
     * 本地搜索菜单
     */
    function search_menu() {
        //要搜索的值
            var text = $('input[name=q]').val();

            var $ul = $('.sidebar-menu');
            $ul.find("a.nav-link").each(function () {
                var $a = $(this).css("border","");

            //判断是否含有要搜索的字符串
            if ($a.children("span.menu-text").text().indexOf(text) >= 0) {

                //如果a标签的父级是隐藏的就展开
                $ul = $a.parents("ul");

                if ($ul.is(":hidden")) {
                    $a.parents("ul").prev().click();
                }

                //点击该菜单
                $a.click().css("border","1px solid");

//                return false;
            }
        });
    }

    $(function () {
//        console.log(window.location);

        App.setbasePath("../");
        App.setGlobalImgPath("dist/img/");

        addTabs({
            id: '10008',
            title: '首页',
            close: false,
            url: 'welcome_iframe',
            urlType: "relative"
        });

        App.fixIframeCotent();

        /*addTabs({
         id: '10009',
         title: '404',
         close: true,
         url: 'UI/buttons_iframe2.html'
         });*/

        /*
         <li class="treeview">
         <a href="#">
         <i class="fa fa-edit"></i> <span>Forms</span>
         <span class="pull-right-container">
         <i class="fa fa-angle-left pull-right"></i>
         </span>
         </a>
         <ul class="treeview-menu">
         <li><a href="forms/general.html"><i class="fa fa-circle-o"></i> General Elements</a></li>
         <li><a href="forms/advanced.html"><i class="fa fa-circle-o"></i> Advanced Elements</a></li>
         <li><a href="forms/editors.html"><i class="fa fa-circle-o"></i> Editors</a></li>
         </ul>
         </li>
         */

         $.ajax({
             type : "POST",  //提交方式
             url : "resource/tree",
             success : function(myjson) {//返回数据根据结果进行相应的处理
            	 var menus = []
                 for(i=0;i<myjson.length;i++){
                     if(myjson[i].pid==null){
                         var menu = {
                             id:myjson[i].id,
                             text: myjson[i].text,
                             icon: myjson[i].iconCls,
                             children: []
                         }
                         menus.push(menu)
                     }
                 }
                 for(i=0;i<myjson.length;i++){
                     if(myjson[i].pid!=null){
                         var menu = {
                             id: myjson[i].id,
                             text: myjson[i].text,
                             icon: myjson[i].iconCls,
                             url: myjson[i].attributes,
                             targetType: myjson[i].targetType
                         }
                         for(j=0;j<menus.length;j++){
                             if(menus[j].id==myjson[i].pid){
                                 menus[j].children.push(menu)
                             }
                         }
                     }
                 }
                 $('.sidebar-menu').sidebarMenu({data: menus, param: {strUser: 'admin'}});
             }
         });

         
         
        /* var myjson = [
            {
                "id": 223,
                "text": "官方网站",
                "state": "open",
                "checked": false,
                "attributes": "https://www.dreamlu.net",
                "iconcls": "fi-home",
                "pid": 222,
                "openmode": "iframe"
            },
            {
                "id": 229,
                "text": "系统图标",
                "state": "open",
                "checked": false,
                "attributes": "/icons.html",
                "iconcls": "fi-photo",
                "pid": 221,
                "openmode": "ajax"
            },
            {
                "id": 1,
                "text": "权限管理",
                "state": "open",
                "checked": false,
                "attributes": "",
                "iconcls": "fi-folder",
                "pid": null,
                "openmode": null
            },
            {
                "id": 228,
                "text": "druid监控",
                "state": "open",
                "checked": false,
                "attributes": "/druid",
                "iconcls": "fi-monitor",
                "pid": 221,
                "openmode": "iframe"
            },
            {
                "id": 227,
                "text": "登录日志",
                "state": "open",
                "checked": false,
                "attributes": "/syslog/manager",
                "iconcls": "fi-info",
                "pid": 221,
                "openmode": "ajax"
            },
            {
                "id": 224,
                "text": "jfinal视频",
                "state": "open",
                "checked": false,
                "attributes": "http://blog.dreamlu.net/blog/79",
                "iconcls": "fi-video",
                "pid": 222,
                "openmode": "iframe"
            },
            {
                "id": 11,
                "text": "资源管理",
                "state": "open",
                "checked": false,
                "attributes": "/resource/manager",
                "iconcls": "fi-database",
                "pid": 1,
                "openmode": "ajax"
            },
            {
                "id": 222,
                "text": "视频教程",
                "state": "closed",
                "checked": false,
                "attributes": "",
                "iconcls": "fi-folder",
                "pid": null,
                "openmode": null
            },
            {
                "id": 221,
                "text": "日志监控",
                "state": "closed",
                "checked": false,
                "attributes": "",
                "iconcls": "fi-folder",
                "pid": null,
                "openmode": null
            },
            {
                "id": 12,
                "text": "角色管理",
                "state": "open",
                "checked": false,
                "attributes": "/role/manager",
                "iconcls": "fi-torso-business",
                "pid": 1,
                "openmode": "ajax"
            },
            {
                "id": 13,
                "text": "用户管理",
                "state": "open",
                "checked": false,
                "attributes": "/user/manager",
                "iconcls": "fi-torsos-all",
                "pid": 1,
                "openmode": "ajax"
            },
            {
                "id": 14,
                "text": "部门管理",
                "state": "open",
                "checked": false,
                "attributes": "/organization/manager",
                "iconcls": "fi-results-demographics",
                "pid": 1,
                "openmode": "ajax"
            }
        ] 
        */
       
 
 
//        var menus = [
//            {
//                id: "9000",
//                text: "header",
//                icon: "",	
//                isHeader: true
//            },
//            {
//                id: "9001",
//                text: "UI Elements",
//                icon: "fa fa-laptop",
//                children: [
//                    {
//                        id: "90011",
//                        text: "buttons",
//                        icon: "fa fa-circle-o",
//                        url: "UI/buttons_iframe.html",
//                        targetType: "iframe-tab"
//                    },
//                    {
//                        id: "90012",
//                        text: "icons",
//                        url: "UI/icons_iframe.html",
//                        targetType: "iframe-tab",
//                        icon: "fa fa-circle-o"
//                    },
//                    {
//                        id: "90013",
//                        text: "general",
//                        url: "UI/general_iframe.html",
//                        targetType: "iframe-tab",
//                        icon: "fa fa-circle-o"
//                    },
//                    {
//                        id: "90014",
//                        text: "modals",
//                        url: "UI/modals_iframe.html",
//                        targetType: "iframe-tab",
//                        icon: "fa fa-circle-o"
//                    },
//                    {
//                        id: "90015",
//                        text: "sliders",
//                        url: "UI/sliders_iframe.html",
//                        targetType: "iframe-tab",
//                        icon: "fa fa-circle-o"
//                    },
//                    {
//                        id: "90016",
//                        text: "timeline",
//                        url: "UI/timeline_iframe.html",
//                        targetType: "iframe-tab",
//                        icon: "fa fa-circle-o"
//                    }
//                ]
//            },
//            {
//                id: "9002",
//                text: "Forms",
//                icon: "fa fa-edit",
//                children: [
//                    {
//                        id: "90021",
//                        text: "advanced",
//                        url: "forms/advanced_iframe.html",
//                        targetType: "iframe-tab",
//                        icon: "fa fa-circle-o"
//                    },
//                    {
//                        id: "90022",
//                        text: "general",
//                        url: "forms/general_iframe.html",
//                        targetType: "iframe-tab",
//                        icon: "fa fa-circle-o"
//                    },
//                    {
//                        id: "90023",
//                        text: "editors",
//                        url: "forms/editors_iframe.html",
//                        targetType: "iframe-tab",
//                        icon: "fa fa-circle-o"
//                    }
//                ]
//            }
//        ];
       
         $("#loginOut").click(function(){
             $.ajax({
                 type :"post",
                 url : "<%=request.getContextPath()%>logout",
                 success : function(data){
                	 if (data) {
                		  window.location.href = '<%=request.getContextPath()%>login';
					}
                 }
             });
         });

    });
</script>

</body>
</html>