
function changeHtml(url){
	$("#iframe").html("");
 	$.ajax({
        type:"get",
        url:url,
        dataType:"html",

        success:function(result){
           $("#iframe").html(result);
        }
    });
}

function changeBlog(url){
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

function changeBlogs(url,id){
	$(".left").html("");
 	$.ajax({
        type:"get",
        url:url+"?id="+id,
        dataType:"html",
        
        success:function(result){
           $(".left").html(result);
        }
    });
}