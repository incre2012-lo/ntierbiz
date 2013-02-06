<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<s:if test="%{'Org_Admin' in CurrentPermission}">
<h3 class="tit">Generate Password</h3>

<p class="msg info">
	Click "submit" to create password.</br>
	Please make alpha numeric password.
</p>
<p class="msg warning">Fields with a red asterisk (*) are mandatory.</p>
<s:if test="hasFieldErrors()">
<s:fielderror cssClass="msg error"/>
</s:if>
<s:if test="hasActionErrors()">
<s:actionerror cssClass="msg error"/>
</s:if>
<s:form action="generatePassword" cssClass="xform" method="post">
		<s:hidden name="user.uuid" />
		<fieldset>
			<legend>User Information</legend>
			<label><s:property value="user.firstName" />&nbsp;<s:property value="user.lastName" /></label><br>			
			<label>Email <s:property value="user.email" /></label>	Email <s:property value="user.email" /><br>
			<label>Password :<span class="high bigger">*</span></label>
			<s:password name="user.password" label="Password" /> 
			<label>Confirm Password :<span class="high bigger">*</span></label>
			<s:password label="Confirm Password" name="cfmPassword" />  
		</fieldset>		
		<fieldset>
		<s:submit name="Save" value="Submit" cssClass="btn"/>
		<s:url id="listURL" action="listUser"></s:url>
		<input type="button" value="Cancel" class="btn" onclick="window.location='${listURL}'"/>
		</fieldset>
</s:form>

</s:if>
<s:else>
Sorry, You don't have permission for this link.  
</s:else>