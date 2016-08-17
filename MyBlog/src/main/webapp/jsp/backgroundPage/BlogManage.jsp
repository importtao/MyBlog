<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>博客管理</title>
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<script src="js/css3-mediaqueries.js"></script>
	<link rel="stylesheet" type="text/css" href="css/backgroundPage/main.css" />
	<link rel="stylesheet" href="css/backgroundPage/templatemo_main.css">
  </head>
  
  <body id="body">
  	<div class="container">
  		<div class="logo">
  			<h1>WSF</h1>
  		</div>
  	</div>
  	<div class="content">
  		<div class="left-sider">
  			<ul class="sider-menu">
  				<li><a onclick="changeHtml('article/ArticleManage.do');"><%--<img src="image/HomePages/article.png"></img>&nbsp;--%>文章管理</a></li>
  				<li><a herf="#">基础设置</a></li>
  			</ul>
  		</div>
  		<div class="content-sider">
  			<div id="iframe" style="top: 0;bottom: 0;width: 100%;height: 98%;">
				<!-- <iframe name="contentIframe" id="contentIframe" style="margin: 0 auto;height: 98%" width="100%" frameborder="0" scrolling="auto" src=""></iframe> -->
		    </div>
  		</div>
  	</div>
    <footer class="footer">
        <div class="temp-footer">
          <p>Copyright &copy; By fan</p>
        </div>
      </footer>
    <script type="text/javascript" src="js/util/jquery-2.0.3.min.js"></script>
	<script type="text/javascript" src="js/backgroundPage/BlogManage.js"></script>
	<script type="text/javascript" src="js/util/changePage.js"></script>
	<script src="js/util/ConfirmDialog.js"></script>
  </body>
</html>
