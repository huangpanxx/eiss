<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><%@page
	language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GBK"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<link href="../theme/simpleapps.css" rel="stylesheet" type="text/css" />
<script   type= "text/javascript "   charset= "GBK "   src= "../javascript/simpleapps.js"> </script>
<title>��¼</title>
</head>
<body>
<div class="logbar">
		<form id="logform" action="/Electron/LoginForm" method="post">
		<table>
			<tr>
				<th>��ݣ�</th>
				<td><select id="utype" name="utype">
						<option value="consumer" checked="checked">������</option>
						<option value="bussiniss">�̼�</option>
						<option value="manager">����Ա</option>
				</select>
				</td>
				<th>�û�����</th>
				<td><input type='text' name='username' class="required" /></td>
				<th>����:</th>
				<td><input type='password' name='password' class="required" />
				</td>
				<td ><input value="��¼" type="submit" onclick="loginsubmit();"/></td>
				<td ><input value="ע��" type="button" onclick="window.location.href='./register.jsp' "/></td>
				<div class="warmesg" style="clear:none;"></div>
			</tr>
		</table>
	</form>
</div>
</body>
</html>