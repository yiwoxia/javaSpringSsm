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
					<li role="presentation" ><a href="${pageContext.request.contextPath }/student/pageList.action">学生管理</a></li>
				    <li role="presentation" class="active"><a href="${pageContext.request.contextPath }/student/toAddStudent.action">添加学生</a></li>
				</ul>
			</div>
			<!-- 左边导航栏结束  -->
			<!-- 右边栏开始  -->
			<div class="col-md-10">
				<ul class="nav nav-tabs">
					<li role="presentation" ><a href="${pageContext.request.contextPath }/student/pageList.action">学生管理</a></li>
					<li role="presentation" class="active"><a href="${pageContext.request.contextPath }/student/toAddStudent.action">添加学生</a></li>
				</ul>
				<!-- 添加学生 开始 -->
				<form style="margin-top: 10px;" action="${pageContext.request.contextPath }/student/addStudent.action" method="post" >
				<div class="form-group">
					   <label for="exampleInputEmail1">学号</label>
					   <input type="text" name="sno" class="form-control" id="exampleInputEmail1" placeholder="姓名">
				  </div>
				  <div class="form-group">
					   <label for="exampleInputEmail1">姓名</label>
					   <input type="text" name="sname" class="form-control" id="exampleInputEmail1" placeholder="姓名">
				  </div>
				  <div class="form-group">
					  <label for="exampleInputPassword1">年龄</label>
					  <input type="text" name="sage" class="form-control" id="exampleInputPassword1" placeholder="年龄">
				  </div>
				  <div class="form-group">
					  <label for="exampleInputPassword1">性别</label>
					  <input type="text" name="sgender" class="form-control" id="exampleInputPassword1" placeholder="性别">
				  </div>
				  <div class="form-group">
					  <label for="exampleInputPassword1">地址</label>
					  <input type="text" name="saddress" class="form-control" id="exampleInputPassword1" placeholder="地址">
				  </div>
				  <div class="form-group">
					  <label for="exampleInputPassword1">出生日期</label>
					  <input type="text" name="sbirthday" class="form-control" id="exampleInputPassword1" placeholder="出生日期">
				  </div>
				  <div class="form-group">
						<label for="exampleInputName2">班级：</label>
						<select class="form-control" id="banji_id" name="sbanji_id" >
							<option value="" >请选择</option>
							<c:forEach items="${blist}" var="banji">
								<option value="${banji.bid }" >${banji.bname }</option>								
							</c:forEach>
						</select>
				 	</div>
				  
				  
				  <button type="submit" class="btn btn-primary">Submit</button>
				</form>
				<!-- 添加学生 结束 -->
			</div>
			<!-- 右边栏结束  -->
		</div>
	</div>
	
	
	
</body>
</html>