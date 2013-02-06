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
<div class="banner box">
		<h2 class="redbg" >Please close the window by click on following close button&nbsp; </h2>
		<div class="box-content">
		<s:if test="hasActionErrors()">
  				<div class="errors">
     			 <s:actionerror/>
  			 	</div>
  			 	<div class="clear"></div>
		</s:if>
		<s:if test="hasActionMessages()">
  				 <div class="welcome">
    			  <s:actionmessage/>
   				</div>
   				<div class="clear"></div>
		</s:if>
				<div class="box tp_mg10">
					<table border="0" cellpadding="0" cellspacing="0" width="100%" class="s">
						<tr>
							<td class="table_detail e s center"> <a href="#" rel=close><input type="button" name="close" value="Close"></a>
						</tr>
					</table>
				</div>
				<div class="clear"></div>
		</div>	
		<div class="clear"></div>
</div>
<div class="clear"></div>