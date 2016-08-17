
var width=100;
var pageHeight=window.innerHeight;
var pageWidth=window.innerWidth;
var maxWidth=480;
var height=pageHeight/3;
$(document).ready(function(){
	$(".content").css("height", pageHeight + "px");
	$(".main").css("padding-top", height + "px");
});


function openPage(url) {
	$(".left").css("height", pageHeight + "px");
	if(pageWidth<=maxWidth){
		$(".content").css("height", "100px");
		$(".main").css("padding-top", "18px");
		$(".left").css("height", (pageHeight-100) + "px");
	}
	else{
		var timer = setInterval(function() {
			if (width <= 33) {
				window.clearInterval(timer);
			} else {
				width -= 2;
			}
			$(".content").css("width", width + "%");
		}, 20);
	}
	$(".left").slideDown(2000);
	loadHtml(url); 
}

function loadHtml(url){
	$(".left").html("");
 	$.ajax({
        type:"get",
        url:url,
        dataType:"html",

        success:function(result){
           $(".left").html(result);
        }
    });
}

function closePage(){
	var timer = setInterval(function() {
		if (width >= 100) {
			window.clearInterval(timer);
		} else {
			width += 2;
		}
		$(".content").css("width", width + "%");
	}, 20);
	$(".left").slideDown(2000);
	$(".left").css("height",  "0px");
	if(pageWidth<=maxWidth){
		$(".content").css("height", pageHeight + "px");
		$(".main").css("padding-top", height + "px");
	}
}


