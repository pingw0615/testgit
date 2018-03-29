<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<table border="1" rules="all" align="center" cellpadding="8"
		cellspacing="8" bordercolor="#000000">
		<tr>
			<th style="background-color:#666">序号</th>
			<th style="background-color:#666">工作类型</th>
			<th style="background-color:#666">项目名称</th>
			<th style="background-color:#666">开始时间</th>
			<th style="background-color:#666">完成时间</th>
			<th style="background-color:#666">项目进度</th>
			<th style="background-color:#666">项目情况</th>
			<th style="background-color:#666">负责人</th>
			<th style="background-color:#666">操作</th>
		</tr>
		<c:forEach items="${projects }" var="v">
			<tr>
				<td>${v.id }</td>
				<td>${v.wType}</td>
				<td>${v.wName}</td>
				<td>${v.sTime}</td>
				<td>${v.eTime}</td>
				<td>${v.progess}</td>
				<td>${v.pdetail}</td>
				<td>${v.leader}</td>
				<td><input type="button" value="修改"/></td>
			
			</tr>
		</c:forEach>
		<tr>
			<td colspan="9" align="center">
					<a href="xinjian.jsp">添加新项目</a>
			</td>
		</tr>
	</table>
</body>
</html>
