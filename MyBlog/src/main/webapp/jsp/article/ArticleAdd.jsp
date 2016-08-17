<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
	<link href="plugins/ueditor/themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
</head>
<body>     
	<div class="showContent">
		<div class="templatemo-content">
        	<ol class="breadcrumb">
         	<li><a onclick="changeHtml('jsp/backgroundPage/ArticleManage.jsp')">返回</a></li>
      		</ol>
         <div class="form-horizontal">
	      <div class="control-group">
	        <label class="control-label" for="inputEmail">标题</label>
          	<input type="text" class="form-control" id="title" placeholder="输入你的标题" style="height: 30px;">
          	<label style="color:red;" id="warnTitle"></label>
	      </div>
	      <%-- <div class="control-group">
	        <label class="control-label" for="inputEmail">类别</label>
	        <div class="controls">
	      	<select type="text" id="typeID">
	          <% if(articleType !=null){ 
	        	  for(ArticleType articleTypes:articleType){  %>
	        		  <option value="<%=articleTypes.getTypeID() %>"><%=articleTypes.getTypeName() %></option>
	          <% }}%>
	          </select>
	        </div>
	      </div> --%>
	      <script type="text/plain" id="myEditor" style="width:1000px;height:240px;"></script>
		  
	      <div class="control-group">
	        <div class="controls">
	          <button id="submit" class="btn btn-success" onclick="getContent();">提交</button>  
	        </div>
	      </div>
    	</div>
    	  </div>
      </div>
      <script type="text/javascript" charset="utf-8" src="plugins/ueditor/umeditor.config.js"></script>
      <script type="text/javascript" charset="utf-8" src="plugins/ueditor/umeditor.min.js"></script>
      <script type="text/javascript" src="plugins/ueditor/lang/zh-cn/zh-cn.js"></script>
	  <script src="js/backgroundPage/ArticleAdd.js" type="text/javascript"></script>
</body>
</html>