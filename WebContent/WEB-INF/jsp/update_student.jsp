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
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery/jquery-1.11.1.js"></script>
<script type="text/javascript">

$(function(){
	//获得当前回显的学生班级的cid和名称
	$("#banji_id option[value='${student.banji.id }']").prop("selected",true);
	$("#gender #op[value='${student.gender }']").prop("selected",true);
	
});
</script>
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
				    <li role="presentation" ><a href="${pageContext.request.contextPath }/student/toaddStudent.action">添加学生</a></li>
				    <li role="presentation" class="active"><a href="#">修改学生</a></li>
				</ul>
			</div>
			<!-- 左边导航栏结束  -->
			<!-- 右边栏开始  -->
			<div class="col-md-10">
				<ul class="nav nav-tabs">
					<li role="presentation" ><a href="${pageContext.request.contextPath }/student/pageList.action">学生管理</a></li>
					<li role="presentation" ><a href="${pageContext.request.contextPath }/student/toaddStudent.action">添加学生</a></li>
				    <li role="presentation" class="active"><a href="#">修改学生</a></li>
				</ul>
				<!-- 添加学生 开始 -->
				<form style="margin-top: 10px;" action="${pageContext.request.contextPath }/student/update.action" method="post" >
					<input type="hidden" name="id" value="${student.id }" />
					<div class="form-group">
					   <label for="exampleInputEmail1">学号</label>
					   <input type="text" name="id" value="${student.id }" readonly="readonly" class="form-control" id="exampleInputEmail1" placeholder="姓名">
				  	</div>
					<div class="form-group">
					   <label for="exampleInputEmail1">姓名</label>
					   <input type="text" name="name" value="${student.name }" class="form-control" id="exampleInputEmail1" placeholder="姓名">
				  </div>
				  <div class="form-group">
					  <label for="exampleInputPassword1">年龄</label>
					  <input type="text" name="age" value="${student.age }" class="form-control" id="exampleInputPassword1" placeholder="年龄">
				  </div>
				 <%--  <div class="form-group">
					  <label for="exampleInputPassword1">性别</label>
					  <input type="text" name="sgender" value="${student.sgender }" class="form-control" id="exampleInputPassword1" placeholder="性别">
				  </div> --%>
				  <div class="form-group">
						<label for="exampleInputName2">性别</label>
						<select class="form-control" id="gender" name="gender" >
								<option id="op" value="男" >男</option>								
								<option id="op" value="女" >女</option>								
						</select>
				 	</div>
				  <div class="form-group">
					  <label for="exampleInputPassword1">地址</label>
					  <input type="text" name="address" value="${student.address }" class="form-control" id="exampleInputPassword1" placeholder="地址">
				  </div>
				  <div class="form-group">
					  <label for="exampleInputPassword1">出生日期</label>
					  <input type="text" name="birthday" value="${student.birthday }" class="form-control" id="exampleInputPassword1" placeholder="出生日期">
				  </div>
				  <div class="form-group">
						<label for="exampleInputName2">班级</label>
						<select class="form-control" id="banji_id" name="banji_id" >
							<c:forEach items="${bList}" var="banji">
								<option value="${banji.id}" >${banji.name}</option>								
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