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
		width: 140px;
	}
	.form-group .form-control{
		width: 90px;
	}
</style>
<script type="text/javascript">
	function goPage(pageIndex) {
		$("#pageIndex").val(pageIndex);
		$("#searchForm").submit();
	}
	
	$(function(){
		$("#gender option[value=${condition.gender }]").prop("selected", true);
		$("#banji_id option[value=${condition.banji_id }]").prop("selected", true);
	});
	
	function delStudent(id) {
		var isDel = confirm("确定删除？");
		if (isDel) {
			location.href="${pageContext.request.contextPath }/student/delStudent.action?id=" + id;
		}
	}
	
	function deleteAll() {
		var isDel = confirm("确定删除？");
		if (isDel) {
		$("#delForm").attr("src", "${pageContext.request.contextPath }/student/deletAll.action");
		$("#delForm").submit();
		}
	}
	
	function selectAll() {
		$("input[name=selectIds]").prop("checked", $("#selectAlls").is(":checked"))
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
					<li role="presentation" class="active"><a href="#">学生管理</a></li>
				    <li role="presentation"><a href="#">添加学生</a></li>
				</ul>
			</div>
			<!-- 左边导航栏结束  -->
			<!-- 右边栏开始  -->
			<div class="col-md-10">
				<ul class="nav nav-tabs">
					<li role="presentation" class="active"><a href="#">学生管理</a></li>
					<li role="presentation"><a href="${pageContext.request.contextPath }/student/toAddStudent.action">添加学生</a></li>
				</ul>
				<!-- 查询条件 开始 -->
				<form id="searchForm" action="${pageContext.request.contextPath}/student/seacherByCondition.action" method="post" class="form-inline" style="float: left; margin-top: 10px;margin-bottom: 10px;" >
					<!-- 用于查找+分页 记录反的页数 -->
					<input type="hidden" name="pageIndex" id="pageIndex" />
					<div class="form-group"  >
						<label for="exampleInputName2">姓名：</label>
					    <input type="text" name="name" value="${condition.name }" class="form-control" id="exampleInputName2" placeholder="姓名">
				 	</div>
					<div class="form-group">
					<label for="exampleInputName2">年龄：</label>
					    <input type="text" name="age" value="${condition.age }" class="form-control" id="exampleInputName2" placeholder="年龄">
				 	</div>
					<div class="form-group">
						<label for="exampleInputName2">性别：</label>
						<select id="gender" name="gender" class="form-control" >
							<option value="" >请选择</option>
							<option value="男">男</option>
							<option value="女">女</option>
						</select>
				 	</div>
					<div class="form-group">
						<label for="exampleInputName2">住址：</label>
					    <input type="text" name="address" value="${condition.address }" class="form-control" id="exampleInputName2" placeholder="地址">
				 	</div>
					<div class="form-group" style="width: 180px;">
						<label for="exampleInputName2">出生日期：</label>
					    <input type="text" name="birthday" value="${condition.birthday }" style="width: 100px" class="form-control" id="exampleInputName2" placeholder="出生日期">
				 	</div>
				 	<div class="form-group">
						<label for="exampleInputName2">班级：</label>
						<select class="form-control" id="banji_id" name="banji_id" >
							<option value="" >请选择</option>
							<c:forEach items="${blist}" var="banji">
								<option value="${banji.bid }" >${banji.bname }</option>								
							</c:forEach>
						</select>
				 	</div>
					<button type="submit" class="btn btn-default">查询</button>
					<button type="reset" class="btn btn-default">重置</button>
				</form>
				<!-- 查询条件 结束 -->
					<button onclick="javascript:deleteAll()"  class="btn btn-default">批量删除</button>
				<!-- 学生列表开始 -->
				<form id="delForm" action="${pageContext.request.contextPath }/student/deletAll.action" method="post">
					<table class="table table-striped table-bordered table-hover" style="margin-top: 10px;" >
						<tr>
							<td>
								<input type="checkbox" id="selectAlls" onclick="selectAll()" />
							</td>
							<td>学号</td>
							<td>姓名</td>
							<td>年龄</td>
							<td>性别</td>
							<td>地址</td>
							<td>出生日期</td>
							<td>班级</td>
							<td>删除</td>
							<td>修改</td>
						</tr>
						<c:forEach items="${pageBean.list }" var="student">
							<tr>
								<td>
								<input type="checkbox" id="selectAlls" name="selectIds" value="${student.sid }" />
								</td>
								<td>${student.sno }</td>
								<td>${student.sname }</td>
								<td>${student.sage }</td>
								<td>${student.sgender }</td>
								<td>${student.saddress }</td>
								<td>${student.sbirthday }</td>
								<td>${student.banji.bname }</td>
								<td><a href="javascript:delStudent(${student.sid });">删除</a></td>
								<td><a href="${pageContext.request.contextPath }/student/toUpdate.action?id=${student.sid}">修改</a></td>
							</tr>
						</c:forEach>
					</table>
				</form>
				<!-- 学生列表结束 -->
				<!-- 分页 开始 -->
				<nav aria-label="Page navigation">
					<ul class="pagination">
						<!-- 左箭头开始 -->
						<c:if test="${pageBean.pageIndex == 1 }">
							<li class="disabled">
							<a href="javascript:void(0)" aria-label="Previous">
								<span aria-hidden="true"  >&laquo;</span>
							</a>
							</li>
						</c:if>
						<c:if test="${pageBean.pageIndex != 1 }">
							<li>
							<a href="javascript:goPage('${pageBean.pageIndex - 1}');" aria-label="Previous">
								<span aria-hidden="true">&laquo;</span>
							</a>
							</li>
						</c:if>
						<!--左箭头 结束  -->
						<!-- 中间数字开始 -->
						
						<c:forEach begin="1" end="${pageBean.totalPage }" var="page">
							<c:if test="${pageBean.pageIndex == page }">
								<li class="active"><a href="javascript:goPage('${page }');">${page }</a></li>
							</c:if>
							<c:if test="${pageBean.pageIndex != page }">
								<li><a href="javascript:goPage('${page }');">${page }</a></li>
							</c:if>
						</c:forEach>
						
						<!-- 中间数字 结束 -->
						<!-- 右边箭头 开始 -->
						<c:if test="${pageBean.pageIndex == pageBean.totalPage }">
							<li class="disabled">
							<a href="javascript:void(0)" aria-label="Next">
								<span aria-hidden="true">&raquo;</span>
							</a>
							</li>
						</c:if>
						<c:if test="${pageBean.pageIndex != pageBean.totalPage }">
							<li>
							<a href="javascript:goPage('${pageBean.pageIndex + 1}');" aria-label="Next">
								<span aria-hidden="true">&raquo;</span>
							</a>
							</li>
						</c:if>
						
						<!-- 右边箭头 结束 -->
					</ul>
				</nav>
				<!-- 分页 结束 -->
			</div>
			<!-- 右边栏结束  -->
		</div>
	</div>
</body>
</html>