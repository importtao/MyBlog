

(function(window,undefied){
	
	if("WebSocket" in window){
		if(sessionStorage.message){
			document.getElementById('chat').innerHTML += sessionStorage.message;
		}
		else{
			sessionStorage.message="";
		}
		
		if(window.socket==null){
			window.socket=new WebSocket("ws://"+document.domain+":8080/MyBlog/websocket");
		}
		socket.onopen=function(){
			//alert("连接成功");
		}
		socket.onmessage=function(event){
			var html="<p>"+ToHtmlString(event.data)+"</p>";
			sessionStorage.message+=html;
			document.getElementById('chat').innerHTML += html;
		}
	}
	else{
		$("warn").text("你的浏览器不支持Web Socket");
	}
})(window)

function send(){
	var message=document.getElementById("message").value;
	socket.send(message);
	document.getElementById("message").value="";
}

//Html结构转字符串形式显示 支持<br>换行
function ToHtmlString(htmlStr) {
    return toTXT(htmlStr).replace(/\&lt\;br[\&ensp\;|\&emsp\;]*[\/]?\&gt\;|\r\n|\n/g, "<br/>");
}
//Html结构转字符串形式显示
function toTXT(str) {
    var RexStr = /\<|\>|\"|\'|\&|　| /g
    str = str.replace(RexStr,
    function (MatchStr) {
        switch (MatchStr) {
            case "<":
                return "&lt;";
                break;
            case ">":
                return "&gt;";
                break;
            case "\"":
                return "&quot;";
                break;
            case "'":
                return "&#39;";
                break;
            case "&":
                return "&amp;";
                break;
            case " ":
                return "&ensp;";
                break;
            case "　":
                return "&emsp;";
                break;
            default:
                break;
        }
    }
    )
    return str;
}


