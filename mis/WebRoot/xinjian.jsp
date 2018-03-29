
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
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
<form:form action="insertProject">
	<table border="1" rules="all" align="center" cellpadding="8"
		cellspacing="8" bordercolor="#000000">
		<tr>
			<!-- <th style="background-color:#666">序号</th> -->
			<th style="background-color:#666">工作类型</th>
			<th style="background-color:#666">项目名称</th>
			<th style="background-color:#666">开始时间</th>
			<th style="background-color:#666">完成时间</th>
			<th style="background-color:#666">项目进度</th>
			<th style="background-color:#666">项目情况</th>
			<th style="background-color:#666">负责人</th>
		</tr>
		<tr>
			<td><input type="text" name="type"/></td>
			<td><input type="text" name="name"/></td>
			<td><input type="text" name="stime"/></td>
			<td><input type="text" name="etime"/></td>
			<td><input type="text" name="progess"/></td>
			<td><input type="text" name="detail"/></td>
			<td><input type="text" name="leader"/></td>
			
		</tr>
		<tr>
			<td colspan="9" align="center"><a href="showAll">保存</a>
			</td>
		</tr>
	</table>
	</form:form>
</body>
</html>
