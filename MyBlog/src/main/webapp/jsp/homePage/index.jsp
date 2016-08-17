<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<%

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String name=request.getParameter("name");
%>
<!DOCTYPE html>
<html>
   <head>
      <title>wsf</title>
      <meta name="viewport" content="width=device-width, initial-scale=1.0" charset="utf-8">
     
      <base href="<%=basePath%>" />
      <link href="css/bootstrap/bootstrap-responsive.min.css" rel="stylesheet">
      <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="css/homePage/index.css" />
      
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
   </head>
   <body>
      <div class="content">
	<div class="back">
	<div class="main col-md-4">
		<div class="title">wsf</div>
		<nav>
		<div class="navigate">
			<button type="button" class="btn btn-default btn-new unshrink-page page" onclick="closePage()">Home</button>
	  		<button type="button" class="btn btn-default btn-new shrink-page page" onclick="openPage('article/blog.do');">Blog</button>
	        <button type="button" class="btn btn-default btn-new shrink-page page" onclick="openPage('jsp/homePage/websocket.jsp');">Demo</button>
	        <button type="button" class="btn btn-default btn-new shrink-page page" onclick="openPage('jsp/homePage/warns.jsp');"za>MyCV</button>
         <!-- <button type="button" class="btn btn-default btn-new shrink-page" >Contact</button> -->
		</div>
		</nav>
	</div>
</div>
	</div>
	<div class="left col-md-8"></div>
      <script src="js/util/jquery-2.0.3.min.js"></script>
      <script src="js/homePage/index.js"></script>
   </body>
</html>