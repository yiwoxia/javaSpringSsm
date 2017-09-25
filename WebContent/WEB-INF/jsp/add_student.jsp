<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/bootstrap/css/bootstrap.css" />
<link type="text/javascript" src="${pageContext.request.contextPath }/lib/bootstrap/js/bootstrap.js"/>
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery/jquery-1.11.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery/jquery.form.js"></script>
<script type="text/javascript">
	function uploadPic(){
		//定义参数
		var options = {
				url : "${pageContext.request.contextPath}/upload/uploadPic.action",
				dataType : "json",
				type : "post",
				success : function(data){
					$("#imgId").attr("src" , "/pic/" + data.fileName);
				}
		};
		$("#form-add").ajaxSubmit(options);
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
					<li role="presentation" ><a href="${pageContext.request.contextPath }/student/pageList.action">学生管理</a></li>
				    <li role="presentation" class="active"><a href="${pageContext.request.contextPath }/student/toAddStudent.action">添加学生</a></li>
				</ul>
			</div>
			<!-- 左边导航栏结束  -->
			<!-- 右边栏开始  -->
			<div class="col-md-10">
				<ul class="nav nav-tabs">
					<li role="presentation" ><a href="${pageContext.request.contextPath }/student/pageList.action">学生管理</a></li>
					<li role="presentation" class="active"><a href="${pageContext.request.contextPath }/student/toaddStudent.action">添加学生</a></li>
				</ul>
				<!-- 添加学生 开始 -->
				<form style="margin-top: 10px;" action="${pageContext.request.contextPath }/student/addStudent.action" method="post" enctype="multipart/form-data" id="form-add">
				<div class="form-group">
					   <label for="exampleInputEmail1">学号</label>
					   <input type="text" name="id" class="form-control" id="exampleInputEmail1" placeholder="学号">
				  </div>
				  <div class="form-group">
					   <label for="exampleInputEmail1">姓名</label>
					   <input type="text" name="name" class="form-control" id="exampleInputEmail1" placeholder="姓名">
				  </div>
				  <div class="form-group">
					  <label for="exampleInputPassword1">年龄</label>
					  <input type="text" name="age" class="form-control" id="exampleInputPassword1" placeholder="年龄">
				  </div>
				  <div class="form-group">
					  <label for="exampleInputPassword1">性别</label>
					  <input type="text" name="gender" class="form-control" id="exampleInputPassword1" placeholder="性别">
				  </div>
				  <div class="form-group">
					  <label for="exampleInputPassword1">地址</label>
					  <input type="text" name="address" class="form-control" id="exampleInputPassword1" placeholder="地址">
				  </div>
				  <div class="form-group">
					  <label for="exampleInputPassword1">出生日期</label>
					  <input type="text" name="birthday" class="form-control" id="exampleInputPassword1" placeholder="出生日期">
				  </div>
				  <div class="form-group">
						<label for="exampleInputName2">班级：</label>
						<select class="form-control" id="banji_id" name="banji_id" >
							 <option value="" >请选择</option>
							<c:forEach items="${bList}" var="banji">
								<option value="${banji.id }" >${banji.name }</option>								
							</c:forEach> 
								</select> 
						</select>
				 	</div>
				  

				       <div class="form-group">
				       		<label>上传头像</label>
				           <img alt="" id="imgId" src="" width=100 height=100>
				           <input type="hidden" name="pictureFile" id="mainImage"/>
				           <input type="file" name="pictureFile" onchange="uploadPic();"/>
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