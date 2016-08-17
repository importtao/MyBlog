<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<div class="">
</div>
<div class="showContent">
	<div class="templatemo-content">
       <ol class="breadcrumb">
         <li><a onclick="changeHtml('jsp/article/ArticleAdd.jsp')">新增</a></li>
       </ol>
       <h1>文章管理</h1>
       
       <div class="row">
         <div class="col-md-12">
           <div class="table-responsive">
           <form action="queryArticle">
             <table class="table table-striped table-hover table-bordered">
               <thead>
                 <tr>
                   <th>#</th>
                   <th>文章标题</th>
                   <th>发布者</th>
                   <th>发表时间</th>
                   <th>类别</th>
                   <th>操作</th>
                 </tr>
               </thead>
               <tbody>
               <%--   <tr>
                 <% if(articles!=null){
                 for(ArticleDisplay article:articles){ %>
                   <td>1</td>
                   <td><%=article.getTitle() %></td>
                   <td><%=article.getOperatorName() %></td>
                   <td><%=article.getTime() %></td>
                   <td><%=article.getTypeName() %></td>
                   <td>
                   	<a class="btn btn-default" href='<%=basePath%>'+"jsp/ArticleAdd.jsp">编辑</a>
                   	<a class="btn btn-default" onclick="deleteById(<%=article.getArticleID()%>)">删除</a>
                   	<a class="btn btn-default">查看</a>
                   </td>                    
                 </tr>
                 <%}} %> --%>
                 <c:forEach var="data" items="${datas}">
					<tr>
						<td>
							<input type="checkbox" />
						</td>
						<td>${data.title}</td>
						<td>${data.time}</td>
						<td></td>
					</tr>
					</c:forEach>
               </tbody>
             </table>
             </form>
           </div>
           <ul class="pagination pull-right">
             <li class="disabled"><a href="#">&laquo;</a></li>
             <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
             <li><a href="#">2 <span class="sr-only">(current)</span></a></li>
             <li><a href="#">3 <span class="sr-only">(current)</span></a></li>
             <li><a href="#">4 <span class="sr-only">(current)</span></a></li>
             <li><a href="#">5 <span class="sr-only">(current)</span></a></li>
             <li><a href="#">&raquo;</a></li>
           </ul>  
         </div>
       </div>
     </div>
   </div>
</div>
<script type="text/javascript" src="js/util/jquery-2.0.3.min.js"></script>
<script src="js/backgroundPage/ArticleManage.js"></script>
<script src="js/util/changePage.js"></script>

