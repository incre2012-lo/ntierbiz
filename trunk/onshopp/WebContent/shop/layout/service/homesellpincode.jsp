<%
response.setCharacterEncoding("UTF-8");
response.setHeader("Cache-Control","no-cache");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", -1);
%>
<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="box banner">
		<h2 class="redbg" >Please enter your pincode number to check for availblity of home selling service</h2>
		<div class="box-content">
			<s:if test="hasActionErrors()">
	  				 <div class="errors">
	     		 <s:actionerror/>
	  			 </div>
			</s:if>
			<s:if test="hasActionMessages()">
	  			 <div class="welcome">
	    			  <s:actionmessage/>
	   			</div>
			</s:if>
			<s:form action="/bizsrv/homesell" method="post" class="genericForm">
					<s:textfield name="pincode" label="Please enter pincode" />
					<s:submit key="Go" />
			</s:form>
			<div class="clear"></div>
		</div>
		<div class="clear"></div>
</div>
<div class="clear"></div>