
function chatRoom(){
	var name=document.getElementById("name").value;
	if(name==""){
		alert("请输入你的昵称");
	}
	else{
		goChatRoom(name);
	}
}

function goChatRoom(name){
	$.ajax({
		type:"get",
        url:"jsp/homePage/websocket.jsp?name="+name,
        dataType:"html",

        success:function(result){
        	$("#room").html(result)
        }
	})
}

