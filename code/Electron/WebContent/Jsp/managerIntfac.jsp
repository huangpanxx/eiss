<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><%@page
	language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<html>
<head>
<title>managerIntfac</title>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<link href="../theme/simpleapps.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%--
String Id = (String)session.getAttribute("Id"); --%>
<div id="showlist">
<table class="showtable">
<caption><select name="listype" onchange="showEmp(this.value);">
           <option value="consumerlist">�û���Ϣ</option>
           <option value="bussinisslist">�̼���Ϣ</option>  
           <option value="expensellist">���Ѽ�¼</option>
           <option value="pricelist">�н���¼</option>
           </select>&nbsp;&nbsp;&nbsp;<input type="button" value="��ѯ�б�" />
</caption>

</table>

</body>
</html>