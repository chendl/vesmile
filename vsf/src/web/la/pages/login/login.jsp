<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en-US">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>个人登录</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link href="la/css/maingl.css" rel="stylesheet" type="text/css">
    <link href="la/css/mainpub.css" rel="stylesheet" type="text/css">
    <link href="la/css/mainidx.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="la/js/jquery.js"></script>
	<script type="text/javascript" src="la/js/login.js"></script>
	<script type="text/javascript" src="la/js/core.idx.js"></script>
</head>
<body>
<!--[if lte IE 6]>
<script type="text/javascript" src="http://a1.itc.cn/sceapp/focus_static/passport/js/touming.min.js"></script>
<script type="text/javascript">
DD_belatedPNG.fix('.phone s,.quickLink .hd a s, background');
</script>
<![endif]-->

<!-- header -->

<!-- header end-->
<div class="header">
    <div class="area clearfix">
        <div class="logo"><h1>焦点</h1>
		<span class="separate">|</span>
        <h2><a href="http://i.focus.cn/login">个人登录</a></h2></div>
    </div>  
</div>

<div class="contain">
<div class="advert_bg">
<div class="advert_contain">
<ul class="advert_item" style="left: 0px; ">
    <li><div class="img" ></div></li>
</ul>


</div>
</div>

  <div class="area clearfix">
        <div class="main">
           <div class="login_block">
                <div class="tab_top">
                    <ul>
                        <li class="cur"><a href="javascript:void(0);">登录</a></li>
                    </ul>
                </div>
                <div class="tab_bot">
                    <ul>
                        <li class="tab_item" style="display:block">
                            <div class="form_block new_form_block">
                                <form action="login.html" method="POST" id="form12"  autocomplete="off">
                                    <div class="b1">
									   <div class="login_msg hidden"></div><div class="login_msg1">&nbsp;</div>
                                        <div class="uname">   										
                                            <input type="text" name="userNo" id="username11" value=""/><label>请输入用户名</label>	
										</div>
                                        <div class="upass">  
                                            <input type="password" name="uwsp" id="password11"/><label>请输入密码</label>
										</div>
                                        <div class="submit">
                                            <input type="submit" class="btn" id="mysubmit" value="登录" >
                                        </div>
                                    </div><!--b1-->
                                </form><!--new_form-->
                            </div><!--form_block new_form_block-->
                        </li>
                    </ul>
                </div>  <!-- tab_bot-->
            </div> <!-- login_block-->
        </div>  <!-- main-->
	</div>  <!-- area clearfix-->
</div> <!--contain-->
<!-- footer -->
<div id="fouse_foot">
     <p><a href="http://house.focus.cn/msglist/918/">论坛</a> - <a href="http://house.focus.cn/aboutus/mianzeshengming.html">免责声明</a> - <a href="mailto:realbjhouse@xxx.com">电子邮件：realbjhouse@xxx.com</a> - </p>
    <p><a href="#">加盟合作</a> - 北京站招商热线：010-6xxxxxxx</p><p>Copyright &copy; 2014  Inc. All rights reserved. xx公司 <a href="#" target="_blank">版权所有</a></p>
    <p>增值电信业务经营许可证B2-2003xxxx 京ICP证03xxxx号&nbsp;<a href="http://images.house.focus.cn/img/focus_news_certi.JPG" target="_blank">互联网新闻信息服务许可证</a></p>

</div>
<!-- footer end-->
</body>
</html>
