<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
   <body>
   <div style="padding-top:20px;">
   <img title="back" src="images/homePage/return.png" style="cursor:pointer" onclick="openPage('article/blog.do')"/>
	<hr id="hrLab">
	  <c:forEach var="data" items="${datas}">
	  	<div>
   		<h1>${data.title}</h1>
        ${data.content}
        </div>
	  </c:forEach>
	  </div>
   </body>
</html>