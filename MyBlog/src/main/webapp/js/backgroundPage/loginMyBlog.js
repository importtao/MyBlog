
$(function(){
	
})

function login(){
	var name=$("#username").val();
	var password=$("#userpwd").val();
	$.ajax({
			cache: true,
			type: "GET",
			url:"login.action?operator.name="+name+"&operator.password="+password,
			async: false,
		   	error: function(request) {
		        $("#warn").text("用户名或密码不正确!");
		    },
		    success: function(data) {
		    	window.location.href =basePath+"jsp/BlogManage.jsp";
		    }
	});
}