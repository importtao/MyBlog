var page=1;
var curPage=1;

(function(){
	getPage();
})()

function getPage(){
	q("pagination",page,curPage);
}