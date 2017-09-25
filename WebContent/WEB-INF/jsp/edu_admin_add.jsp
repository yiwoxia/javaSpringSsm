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
<script type="text/javascript">
	
function addCourses() {
	var isDel = confirm("确定添加？");
	if (isDel) {
	$("#delForm").attr("src", "${pageContext.request.contextPath }/eduAdmin/addCourses.action");
	$("#delForm").submit();
	}
}

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
					<li role="presentation" ><a href="${pageContext.request.contextPath }/eduAdmin/pageList.action">班级管理</a></li>
					<li role="presentation" class="active"><a href="${pageContext.request.contextPath }/eduAdmin/toBanjiAddCourse.action">添加班级</a></li>
				</ul>
			</div>
			<!-- 左边导航栏结束  -->
			<!-- 右边栏开始  -->
			<div class="col-md-10">
				<ul class="nav nav-tabs">
					<li role="presentation" ><a href="${pageContext.request.contextPath }/eduAdmin/pageList.action">班级管理</a></li>
					<li role="presentation" class="active"><a href="${pageContext.request.contextPath }/eduAdmin/toBanjiAddCourse.action">添加班级</a></li>
				</ul>
				<!-- 添加班级 开始 -->
				<%-- <form style="margin-top: 10px;" action="${pageContext.request.contextPath }/banji/addBanJi" method="post" >
					<div class="form-group">
					   <label for="exampleInputEmail1">班级</label>
					   <input type="text" name="bname" class="form-control" id="exampleInputEmail1" placeholder="姓名">
				  </div>
				  <button type="submit" class="btn btn-primary">Submit</button>
				</form> --%>
				
				<%-- <div class="form-group">
						<label for="exampleInputName2">班级：</label>
						<select class="form-control" id="banji_id" name="banji_id" >
							<option value="" >请选择</option>
							<c:forEach items="${blist}" var="banji">
								<option value="${banji.bid }" >${banji.bname }</option>								
							</c:forEach>
						</select>
				 	</div> --%>
				 	<table class="table table-striped table-bordered table-hover">
				 		<tr>
				 			<td>班级</td>
				 			<td>课程</td>
				 		</tr>
				 		<c:forEach items="${bList }" var="bl">
				 			<tr>
					 			<td>${bl.bname }</td>
				 					<form action="${pageContext.request.contextPath }/eduAdmin/addCourses.action" method="post">
							 			<td>
							 			<input type="hidden" name="bid" value="${bl.bid }" />
							 				<c:forEach items="${cList }" var="cl">
							 						<input type="checkbox" name="cids" value="${cl.cid }" />${cl.cname }
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