<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>User sign up</title>
</head>
<body>
<h2>User List</h2>

<table id="user" border="1">
<tr>
	<th>index</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Login</th>
	<th>Password</th>
	<th>Email</th>
	<th>Company Name</th>
	<th>Country</th>
</tr>
<s:iterator value="profiles" var="basicProfile">
	<tr>
		<td>&nbsp;</td>
		<td><s:property value="#basicProfile.firstName" /></td>
		<td><s:property value="#basicProfile.lastName" /></td>
		<td><s:property value="#basicProfile.basicCredentials.login" /></td>
		<td><s:property value="#basicProfile.basicCredentials.password" /></td>
		<td><s:property value="#basicProfile.basicCredentials.reminderEmail" /></td>
		<td><s:property value="#basicProfile.companyName" /></td>	
		<td>
		<s:iterator value="#basicProfile.basicAddresses" var="address">
				<s:property value="#address.country" />
		</s:iterator>
		</td>	
	</tr>	
</s:iterator>
</table>
<a href="user-add">SignUp</a>
</body>
</html>