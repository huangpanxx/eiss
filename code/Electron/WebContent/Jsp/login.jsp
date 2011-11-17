<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><%@page
	language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GBK"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<link href="../theme/simpleapps.css" rel="stylesheet" type="text/css" />
<script   type= "text/javascript "   charset= "GBK "   src= "../javascript/simpleapps.js"> </script>
<title>登录</title>
</head>
<body>
<div class="logbar">
		<form id="logform" action="/Electron/LoginForm" method="post">
		<table>
			<tr>
				<th>身份：</th>
				<td><select id="utype" name="utype">
						<option value="consumer" checked="checked">消费者</option>
						<option value="bussiniss">商家</option>
						<option value="manager">管理员</option>
				</select>
				</td>
				<th>用户名：</th>
				<td><input type='text' name='username' class="required" /></td>
				<th>密码:</th>
				<td><input type='password' name='password' class="required" />
				</td>
				<td ><input value="登录" type="submit" onclick="loginsubmit();"/></td>
				<td ><input value="注册" type="button" onclick="window.location.href='./register.jsp' "/></td>
				<div class="warmesg" style="clear:none;"></div>
			</tr>
		</table>
	</form>
</div>
</body>
</html>