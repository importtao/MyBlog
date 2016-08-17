<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登陆</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
	<link href="css/Wopop_files/style_log.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" type="text/css" href="css/Wopop_files/style.css">
	<link rel="stylesheet" type="text/css" href="css/Wopop_files/userpanel.css">
	<link rel="stylesheet" type="text/css" href="css/Wopop_files/jquery.ui.all.css">
	
</head>

<body class="login" mycollectionplug="bind">
	<div class="login_m">
		<div class="login_logo"><img src="" width="196" height="46"></div>
		<div class="login_boder">
	  <div class="login_padding" id="login_model">
		  
		  <h2>用户名</h2>
		  <label>
			  <input type="text" id="username" class="txt_input txt_input2" 
			  onfocus="if (value =='请输入用户名'){value =''}" 
			  onblur="if (value ==''){value='请输入用户名'}" value="请输入用户名"/>
			  </label>
		  <h2>密码</h2>
		  <label>
			  <input type="password" id="userpwd" class="txt_input" 
			  onfocus="if (value =='******'){value =''}" 
			  onblur="if (value ==''){value='******'}" value="******"/>
		  </label>
		  <label style="color: red;" id="warn"></label>
	  </div>
	  
	  <div class="rem_sub" style="margin-right:30px;">
	    <label>
	      <input type="button" class="sub_button" id="button" value="登陆" style="opacity: 0.7;" onclick="login();">
	    </label>
	  </div>
	</div>
	<script>
	 var basePath='<%=basePath%>';
	</script>
	<script type="text/javascript" src="js/util/jquery-2.0.3.min.js"></script>
	<script type="text/javascript" src="js/backgroundPage/loginMyBlog.js"></script>
</html>
