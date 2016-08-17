<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<%

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<div class="warn">
<img src="images/homePage/noData.png" width="60%" height="60%" style="text-align:center;display:block;margin:0 auto;margin-top:20%;"></img>
</div>
<script type="text/javascript" src="js/homePage/warns.js"></script>