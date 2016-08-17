<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<%

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
  <div class="page-header">
  		<h2>Web Socket
     		<small>多人聊天室</small>
  		</h2>
 </div>
     <div id="warn"></div>
     <div class="panel panel-default">
   <div class="panel-body" id="chat" style="height:150px;overflow-y:auto;">
         
   </div>
  </div>
     <div class="col-lg-6" id="room">
        <div class="input-group">
           <input type="text" class="form-control" id="message" placeholder="请输入消息内容">
           <span class="input-group-btn">
              <button class="btn btn-default" type="button" onclick="send();">
                 	发送消息
              </button>
           </span>
        </div>
     </div>
     <script type="text/javascript" src="js/homePage/websocket.js"></script>
 