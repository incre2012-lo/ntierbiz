<%@ page language="java" contentType="text/html;" %>
<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>	
<div class="boxwb">
		<div class="greybg" >
				<h3 class="ico">Check Cash/cheque on Delivery</h3>
				<p>
					You can pay Cash/cheque on Delivery.
				    click on "check" link to find availablity of this service on your shipping pincodes.
				    <a href="${pageContext.request.contextPath}/bizsrv/codinput?ajax=true&amp;width=400&amp;height=160" rel="prettyPopin[cod]" >check</a>  
				</p> 
		</div>
		 <div class="clear"></div>
		<div class="greybg" >
					<h3 class="ico">Check appointment with executive</h3>
				<p>
					make an appointment with executive for home selling.
				    Click on "check" link to find availablity of this service on your shipping pincodes.
				    <a href="${pageContext.request.contextPath}/bizsrv/homesellinput?ajax=true&amp;width=700&amp;height=160" rel="prettyPopin[homesell]" >check</a>  
				</p> 
		</div>
		 <div class="clear"></div>
		<div class="greybg nomrg" >
				<h3 class="ico"> your price</h3>
				<p>
					Bid your price with phone number. 
				    Click on "Go" link to enter your price with mobile.Our executive will contact you soon with best deals on the same.
				    <a href="${pageContext.request.contextPath}/bizsrv/bidpriceinput?ajax=true&amp;width=700&amp;height=160&amp;productID=<s:property value="product.productID" />" rel="prettyPopin[homesell]" >GO</a>  
				</p> 
		</div>
		 <div class="clear"></div>
</div> 
 <div class="clear"></div>
 <div class="boxwb">
 	<div class="greybg nomrg">
 	<h3 class="ico ico2">24 x 7 Customer Support</h3>
 		<p class="ac nomrg"> support@onshopp.com</p> 
 		<p class="ac nomrg">or</p>
 		<p class="ac nomrg">+91 9871997564 </p>
 	</div>
 	 <div class="clear"></div>
 </div> 
  <div class="clear"></div>