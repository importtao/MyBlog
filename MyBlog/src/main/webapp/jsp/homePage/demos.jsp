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
   <body style="width:100%;">
	<div class="page-header">
   		<h1>Web Socket
      		<small>多人聊天室</small>
   		</h1>
	 </div>
     <div class="col-lg-6" id="room">
         <div class="input-group">
            <input type="text" class="form-control" id="name" placeholder="请输入你的昵称">
            <span class="input-group-btn">
               <button class="btn btn-default" type="button" onclick="chatRoom()">
                  	进入聊天室
               </button>
            </span>
         </div>
      </div>
      <script type="text/javascript" src="js/homePage/demos.js"></script>
   </body>
</html>