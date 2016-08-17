

(function(window,undefied){
	
	var paginations=function(name,page,curPage){
		return new paginations.fn.init(name,page,curPage);
	};
	
	paginations.fn=paginations.prototype={
		constructor: paginations,
		init:function(name,page,curPage){
			this.page=page;
			this.curPage=curPage;
			return paginations.showPage(name,page,curPage);
		},
		
		page:null,    //页数
		curPage:null,  //当前页数
		html:null
	}
	
	paginations.fn.init.prototype=paginations.fn;
	
	window.paginations=window.q=paginations;
	
	paginations.showPage=function(name,page,curPage){
			var html="";
			if(curPage==1){
				html+="<li class='disabled'><a>&laquo;</a></li>";
			}
			else{
				html+="<li><a onclick='toPage('"+(curPage+1)+"','"+url+"')'>&laquo;</a></li>";
			}
			for(var i=0;i<page;i++){
				if(i==curPage){
					html+="<li class='active'><a>"+(i+1)+"</a></li>";
				}
				evlse{
					html+="<li><a>"+(i+1)+"</a></li>";
				}
			}
			if(curPage==page){
				html+="<li class='disabled'><a>&raquo;</a></li>"
			}
			else{
				html+="<li><a onclick='toPage('"+(curPage-1)+"','"+url+"')'>&raquo;</a></li>";
			}
			$("#"+name).html(html);
		}

	paginations.toPage=function(page,url){
	 	$.ajax({
	        type:"get",
	        url:url+"?page="+page,
	        dataType:"html",

	        success:function(result){
	           $(".left").html(result);
	        }
	    });
	}

})(window)

function pagination(name,page,curPage,url){
	var html="";
	if(curPage==1){
		html+="<li class='disabled'><a>&laquo;</a></li>";
	}
	else{
		html+="<li><a onclick='toPage('"+(curPage+1)+"','"+url+"')'>&laquo;</a></li>";
	}
	for(var i=0;i<page;i++){
		if(i==curPage){
			html+="<li class='active'><a>"+(i+1)+"</a></li>";
		}
		else{
			html+="<li><a>"+(i+1)+"</a></li>";
		}
	}
	if(curPage==page){
		html+="<li class='disabled'><a>&raquo;</a></li>"
	}
	else{
		html+="<li><a onclick='toPage('"+(curPage-1)+"','"+url+"')'>&raquo;</a></li>"
	}
	$("#"+name).html(html);
}

function toPage(page,url){
		$(".left").html("");
	 	$.ajax({
	        type:"get",
	        url:url+"?page="+page,
	        dataType:"html",

	        success:function(result){
	           $(".left").html(result);
	        }
	    });
}