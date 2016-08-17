
//消息弹出框

function getConfirmDialog(words,id){
	var newDiv = document.createElement("div");
	 newDiv.id = "info";
	var dialog="<div id='confirmModal' class='modal fade in' tabindex='-1' style=\"display: block;\">"+
		"<div class='modal-dialog'>"+
			"<div class='modal-content'>"+
			"<div class='modal-header'>"+
				"<button class='close' type='button' onclick=\"removeDialog();\">"+
				"<span>×</span>"+
				"<span class='sr-only'>Close</span>"+
				"</button>"+
				"<h4 id='myModalLabel' class='modal-title'>"+words+"</h4>"+
			"</div>"+
			"<div class='modal-footer'>"+
				"<a class='btn btn-primary' onclick=\"ok("+id+");\">Yes</a>"+
				"<button class='btn btn-default' type='button' onclick=\"removeDialog();\">No</button>"+
			"</div>"+
		"</div>"+
	"</div>";
	newDiv.innerHTML=dialog;
	window.parent.document.getElementById('body').appendChild(newDiv);
	getMask();
}

function warnDialog(words){
	var newDiv = document.createElement("div");
	 newDiv.id = "info";
	var dialog=
	"<div id='confirmModal' class='modal fade in' tabindex='-1' style=\"display: block;\">"+
		"<div class='modal-dialog'>"+
			"<div class='modal-content'>"+
			"<div class='modal-header'>"+
				"<h4 id='myModalLabel' class='modal-title'>"+words+"</h4>"+
			"</div>"+
			"<div class='modal-footer'>"+
				"<a class='btn btn-primary' onclick=\"removeDialog();\">确定</a>"+
			"</div>"+
		"</div>"+
	"</div>";
	newDiv.innerHTML=dialog;
	window.parent.document.getElementById('body').appendChild(newDiv);
	getMask();
}

function getMask(){
	var m = "mask";
    //mask遮罩层
    var newMask = document.createElement("div");                       //创建div对象
    newMask.id = m;
    newMask.style.position = "absolute";
    _scrollWidth = Math.max(document.body.scrollWidth,document.documentElement.scrollWidth);
    _scrollHeight = Math.max(document.body.scrollHeight,document.documentElement.scrollHeight);
    newMask.style.width = _scrollWidth + "px";
    newMask.style.height = _scrollHeight + "px";
    newMask.style.top = "0px";
    newMask.style.left = "0px";
    newMask.style.background = "#33393C";
    newMask.style.filter = "alpha(opacity=40)";      //设置元素的不透明度
    newMask.style.opacity = "0.40";
    window.parent.document.getElementById('body').appendChild(newMask);
}

function removeDialog(){
	var info = window.parent.document.getElementById('info');
	var mask = window.parent.document.getElementById('mask');
	window.parent.document.getElementById('body').removeChild(info);
	window.parent.document.getElementById('body').removeChild(mask);
}