<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>User sign up</title>
</head>
<body>

 

<h2>Customer Form</h2>

<s:form >
	<s:hidden key="actionMethod" value="%{actionMethod}"/>
	<s:textfield name="basicProfilePO.firstName" key="First Name" size="20" />
	<s:textfield name="basicProfilePO.lastName" key="Last Name" size="20" />
	<s:textfield name="basicCredentialsPO.login" key="Login" size="20" />
	<s:textfield name="basicCredentialsPO.password" key="Password" size="20" />
	<s:textfield name="basicCredentialsPO.reminderEmail" key="Email" size="20" />
	<s:textfield name="basicProfilePO.companyName" key="Company Name" size="20" />
	<s:textfield name="basicAddressPO.country" key="Country" size="20" />
	<s:submit action="%{actionMethod}" key="label.ok" />
</s:form>
</body>
</html>