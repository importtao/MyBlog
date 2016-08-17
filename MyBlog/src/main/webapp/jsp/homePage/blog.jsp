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
   <body style="width:100%;">
	  <c:forEach var="data" items="${datas}">
	  	<div class="page-header">
   		<h2><a onclick="changeBlogs('article/blogDetail.do','${data.id}')">${data.title}</a></h2>
            <p>${data.abContent}<p>
      	</div>
	  </c:forEach>
	  <ul class="pagination" id="pagination" style="float:right;">
  		
	  </ul>
	  <script type="text/javascript" src="js/util/page.js"></script>
      <script type="text/javascript" src="js/homePage/blog.js"></script>
      <script type="text/javascript" src="js/util/changePage.js"></script>
      
   </body>
</html>