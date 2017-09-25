<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/bootstrap/css/bootstrap.css" />

<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery/jquery-1.11.1.js"></script>
<style type="text/css">
	.form-group{
		width: 130px;
	}
	.form-group .form-control{
		width: 80px;
	}
</style>
<script type="text/javascript">
	function goPage(pageIndex) {
		$("#pageIndex").val(pageIndex);
		$("#searchForm").submit();
	}
	
	function delStudent(id) {
		var isDel = confirm("确定删除？");
		if (isDel) {
			location.href="${pageContext.request.contextPath }/user?method=delUser&id=" + id;
		}
	}
</script>
</head>
<body>
	<!-- head begin -->
		<%@include file="common/ad_header.jsp" %>
	<!-- head end -->
	<div class="container" >
		<div class="row">
			<!-- 左边导航栏开始  -->
			<div class="col-md-2" >
				<ul class="nav nav-pills nav-stacked">
					<li role="presentation" ><a href="${pageContext.request.contextPath }/user?method=pageList">用户管理</a></li>
					<li role="presentation" ><a href="${pageContext.request.contextPath }/user?method=toAddUser">添加用户</a></li>
				    <li role="presentation" class="active"><a href="${pageContext.request.contextPath }/user?method=onlineUser">在线用户</a></li>
				</ul>
			</div>
			<!-- 左边导航栏结束  -->
			<!-- 右边栏开始  -->
			<div class="col-md-10">
				<ul class="nav nav-tabs">
					<li role="presentation" ><a href="${pageContext.request.contextPath }/user?method=pageList">用户管理</a></li>
					<li role="presentation" ><a href="${pageContext.request.contextPath }/user?method=toAddUser">添加用户</a></li>
				    <li role="presentation" class="active"><a href="${pageContext.request.contextPath }/user?method=onlineUser">在线用户</a></li>
				</ul>
				<!-- 查询条件 开始 -->
				
				<!-- 查询条件 结束 -->
				<!-- 学生列表开始 -->
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px;" >
					<tr>
						<td>id</td>
						<td>用户名</td>
						<td>密码</td>
					</tr>
					<c:forEach items="${onlineUserList }" var="user">
						<tr>
							<td>${user.id }</td>
							<td>${user.name }</td>
							<td>${user.password }</td>
							
						</tr>
					</c:forEach>
				</table>
				<!-- 学生列表结束 -->
				
				<!-- 分页 结束 --></div>
			<!-- 右边栏结束  -->
		</div>
	</div>
	
	
	
</body>
</html>