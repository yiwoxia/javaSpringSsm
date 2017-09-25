<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/bootstrap/css/bootstrap.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/bootstrap/js/bootstrap.js"></script>
</head>
<body>

	<!-- head begin -->
		<%@include file="common/header.jsp" %>
	<!-- head end -->
	<div class="container" >
		<div class="row">
			<!-- 左边导航栏开始  -->
			<div class="col-md-2" >
				<ul class="nav nav-pills nav-stacked">
					<li role="presentation" ><a href="${pageContext.request.contextPath }/manage/pageList.action">班级管理</a></li>
					<li role="presentation" class="active"><a href="${pageContext.request.contextPath }/manage/toBanjiAddCoures.action">添加班级</a></li>
				</ul>
			</div>
			<!-- 左边导航栏结束  -->
			<!-- 右边栏开始  -->
			<div class="col-md-10">
				<ul class="nav nav-tabs">
					<li role="presentation" ><a href="${pageContext.request.contextPath }/manage/pageList.action">班级管理</a></li>
					<li role="presentation" class="active"><a href="${pageContext.request.contextPath }/manage/toBanjiAddCoures.action">添加班级</a></li>
				</ul>
				<!-- 添加班级 开始 -->
				
				 	<table class="table table-striped table-bordered table-hover">
				 		<tr>
				 			<td>班级</td>
				 			<td>课程</td>
				 		</tr>
				 		<c:forEach items="${bList }" var="bj">
				 			<tr>
					 			<td>${bj.bname }</td>
				 					<form action="${pageContext.request.contextPath }/manage/addCourses.action" method="post">
							 			<td>
							 			<input type="hidden" name="id" value="${bj.id }" />
							 				<c:forEach items="${cList }" var="cl">
							 						<input type="checkbox" name="cid" value="${cl.cid }" />${cl.cname }
							 				</c:forEach>
							 				 <button type="submit" class="btn btn-primary">Submit</button>
										</td>
				 					</form>
				 			</tr>
				 		</c:forEach>
				 		
				 		
				 	</table>
				 	
				
				<!-- 添加学生 结束 -->
			</div>
			<!-- 右边栏结束  -->
		</div>
	</div>
	
	
</body>
</html>