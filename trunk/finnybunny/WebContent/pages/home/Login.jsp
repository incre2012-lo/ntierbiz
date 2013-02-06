<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:actionerror />
<s:form namespace="/" action="index.action" method="post" cssClass="xform">
   <p class="msg">Please enter your username/email and password to log on.</p>
   	<fieldset>  	 	
   		<legend>Login Panel</legend>   		
	   	 <s:hidden name="J_LOGIN_ATTEMPT" value="%{'1'}" />
	   	 <label>Email ID or Username :<span class="high bigger">*</span></label>
	    <s:textfield name="J_USERNAME" label="Username" cssClass="input-text2"/> <br>
	    <label>Password :<span class="high bigger">*</span></label>
	    <s:password name="J_PASSWORD" label="Password" /><br>
	    <label>&nbsp;</label>
	    <s:submit value="Login" >
	        <s:param name="colspan" value="%{2}" />
	        <s:param name="align" value="%{'center'}" />
	    </s:submit>
   	</fieldset>  
   	 <p class="smaller">If you have forgotten your password,or if you are experiencing problems, contact the administrator.</p>
</s:form>
