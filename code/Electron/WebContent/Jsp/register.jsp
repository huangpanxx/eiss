


<%@ page import="beans.Consumer"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><%@page
	language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<html>
<head>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<META HTTP-EQUIV="Expires" CONTENT="0">
</head>

<br>
<head>
<title>消费者注册</title>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<link href="../theme/simpleapps.css" rel="stylesheet" type="text/css">
<script   type= "text/javascript "   charset= "GBK "   src= "../javascript/simpleapps.js"> </script>
</head>
<body>
<div class="warmesg"></div>
<form id="regisform" action="/Electron/registerForm" method="post" class="regisform">
		<table class="inputView">
			<tr>
				<th>电话:</th>
				<td><input type='text' name='phoneNmr' class="required" /></td>
			</tr>
			<tr>
				<th>密码:</th>
				<td><input type='password' name='password' class="required" />
				</td>
			</tr>
			<tr>
				<th>确认密码:</th>
				<td><input type='password' name='password' class="required" />
				</td>
			</tr>
			<tr>
				<td align="center"><input value="注册" type="submit" onclick="loginsubmit();"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>