<%
response.setCharacterEncoding("UTF-8");
response.setHeader("Cache-Control","no-cache");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", -1);
%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>	


<div class="section box">
		<h2 class="redbg" >Please choose payment method for  fast checkout</h2>
		<div class="box-content">
			<s:form action="payment" namespace="/checkout"> 
				<h4>
			  		<s:radio label="Payment Options" name="paymentMethod" list="#{'1':'Cash On Delivery'}" value="1" />
				</h4> 			 
			<s:submit value="submit" name="submit" />
			 
			</s:form>

		</div>
</div>

