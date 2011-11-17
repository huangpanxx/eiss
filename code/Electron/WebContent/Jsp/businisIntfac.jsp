<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><%@page
	language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
	
<%@page import="beans.Bussiniss;"%>
<html>
<head>
<link href="../theme/simpleapps.css" rel="stylesheet" type="text/css" />
<title>businisIntfac</title>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
</head>
<body>
<%--
String Id = (String)session.getAttribute("Id"); --%>
<div id="showlist">
<table class="showtable">
<caption><select name="listype" onchange="showEmp(this.value);">
           <option value="expensellist">消费记录</option>
           </select>&nbsp;&nbsp;&nbsp;<input type="button" value="查询列表" />
</caption>

<th>
</table>
</div>
</body>
</html>