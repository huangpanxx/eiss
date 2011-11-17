<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><%@page
	language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<html>
<head>
<link href="../theme/simpleapps.css" rel="stylesheet" type="text/css" />
<title>票务</title>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
</head>
<body>
<%--
String Id = (String)session.getAttribute("Id"); --%>
<div id="showlist">
<table class="showtable">
<caption><select name="listtype" onchange="showEmp(this.value);">
           <option value="expensellist">消费记录</option>
           <option value="einvoicellist">发票记录</option>  
           <option value="pricellist">中奖信息</option>
           </select>&nbsp;&nbsp;&nbsp;<input type="button" value="查询列表" />
</caption>

</table>
</body>
</html>