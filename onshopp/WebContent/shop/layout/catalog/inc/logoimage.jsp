<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="left">
<table><tr><td align="left">		
		<a href="${pageContext.request.contextPath}/"> <img src="/media/images/brandings/1/header/onshopp.jpg" border="0" alt="" ></a>
</td></tr></table>
</div>
<div class="right shopcart">
	<ul>
		<li>
		   	<a href="<c:url value="/cart/ajax/show?ajax=true&amp;width=960&amp;height=700" />" rel="prettyPopin[cart]"><span class="ac" style="width:180px; display: block;">My Shopping Bag <br>(<span id="itemcount"><s:property value="shoppingCart.quantity" /></span>&nbsp;Items)<br>Total <span id="total"><s:property value="shoppingCart.total" /></span></span></a>
		 </li>	
	</ul>
</div>
<div class="clear"></div>	

