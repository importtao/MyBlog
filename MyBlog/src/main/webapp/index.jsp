<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html lang="zh-CN" data-ng-app="app">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<base href="<%= basePath %>" />
<title>用户管理</title>
<link rel="stylesheet" type="text/css" href="plugins/bootstrap/3.3.5/css/bootstrap.min.css" />
</head>

<body>
<div class="container">
	<div class="col-md-12">
		<h3>用户管理</h3>
		<hr />
	</div>
	<div class="col-md-12">
		<div class="table-responsive">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th></th>
						<th>ID</th>
						<th>用户名</th>
						<th>角色ID</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="data" items="${datas}">
					<tr>
						<td>
							<input type="checkbox" />
						</td>
						<td>${data.id}</td>
						<td>${data.name}</td>
						<td>${data.roleId}</td>
						<td></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>

<script type="text/javascript" src="plugins/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="plugins/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/view/operator.js"></script>
</body>
</html>