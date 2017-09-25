<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/jquery-1.11.1.js"></script>
<script type="text/javascript">
 function requestJson() {
	$.ajax({
		url : "${pageContext.request.contextPath}/json/requestJson.action",
		type : "POST",
		contentType : "application/json",
		/*字符串格式*/
		data : JSON.stringify({name:"zhangsan",age:20}),
		dataTpye : "json",
		success : function(data,textStatus,ajax){
			console.log(data);
			console.log(textStatus);
			console.log(ajax);
		}
	});
 }
 function responseEntity() {
		$.ajax({
			url : "${pageContext.request.contextPath}/json/responseEntity.action",
			type : "POST",
			/*请求key-value形式contentType不需要写*/
			/* contentType : "application/json", */
			/*字符串格式*/
			data : "name='zhangsan'&age='20'",
			dataTpye : "json",
			success : function(data,textStatus,ajax){
				
				console.log(data);
				console.log(textStatus);
				console.log(ajax);
			}
		});
	 }
 function responseList() {
		$.ajax({
			url : "${pageContext.request.contextPath}/json/responseList.action",
			type : "POST",
			contentType : "application/json",
			/*字符串格式*/
			data : JSON.stringify({name:"zhangsan",age:20}),
			dataTpye : "json",
			success : function(data,textStatus,ajax){
				alert(ajax.responseText);
				console.log(data);
				console.log(textStatus);
				console.log(ajax);
			}
		});
	 }
 function responseMap() {
		$.ajax({
			url : "${pageContext.request.contextPath}/json/responseMap.action",
			type : "POST",
			contentType : "application/json",
			/*字符串格式*/
			data : JSON.stringify({name:"zhangsan",age:20}),
			dataTpye : "json",
			success : function(data,textStatus,ajax){
				alert(ajax.responseText);
				console.log(data);
				console.log(textStatus);
				console.log(ajax);
			}
		});
	 }
</script>
</head>
<body>
		<input type="button" onclick="requestJson()" value="请求json，返回json"/><br/>
	    <input type="button" onclick="responseEntity()" value="返回json对象"/><br/>
	    <input type="button" onclick="responseList()" value="返回json List"/><br/>
	    <input type="button" onclick="responseMap()" value="返回json Map"/><br/>
		
</body>
</html>