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
					
					<div class="section box">
						<h2 class="redbg" >Thank you for order,Please find the below details for order tracking <span></span></h2>
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
						
						  <table><tr><td>
									  Delivery Address:<br>
									  		<s:property value="deliveryFirstName" />&nbsp;<s:property value="deliveryLastName" />,<br>
									  		<s:property value="deliveryStreetAddress" />&nbsp;,<s:property value="deliverySuburb" />&nbsp;,<s:property value="deliveryCity" />,<br>
									  		<s:property value="deliveryState" />&nbsp;-<s:property value="deliveryPostcode" />&nbsp;,<s:property value="deliveryCountry" />,<br>
									  		<s:property value="deliveryTelephone" />,<br>
									  		<s:property value="deliveryEmailAddress" /><br>
										
									
						  </td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td>								  	
								  	 	Billing Address:<br>
								  	 		<s:property value="billingFirstName" />&nbsp;<s:property value="billingLastName" />,<br>
									  		<s:property value="billingStreetAddress" />&nbsp;,<s:property value="billingSuburb" />&nbsp;,<s:property value="billingCity" />,<br>
									  		<s:property value="billingState" />&nbsp;-<s:property value="billingPostcode" />&nbsp;,<s:property value="billingCountry" />,<br>
									  		<s:property value="billingTelephone" />,<br>
									  		<s:property value="billingEmailAddress" /><br>									
								
						  </td></tr>
						  </table>
					
						</div>
					</div>
					<div class="clear"></div>
					<div class="section box">
								<h2 class="blubg">Your Order No . <s:property value="trackID" /> <span></span></h2>
								<div class="box-content">
									<table border="0" cellpadding="0" cellspacing="0" style="width: 100%; table-layout: fixed;">
										<thead>
										
										<tr class="tbl_hdr">
											<td class="tbl_hdr" style="width:60px">&nbsp;</td>
											<td class="tbl_hdr" style="width:200px" >Items in your order <input type="hidden" name="order.quantity" value="<s:property value="shoppingCart.quantity" />" ></td>
											<td class="tbl_hdr" style="width:110px" >Price per Unit</td>
											<td class="tbl_hdr" style="width:60px">&nbsp;</td>	
											<td class="tbl_hdr" style="width:50px" >Quantity</td>
											<td class="tbl_hdr" style="width:100px">&nbsp;</td>		
											<td class="tbl_hdr" style="width:90px" >Total</td>											
										</tr>
										</thead>
										<tbody>
										<s:iterator value="orderProducts" var="orderProduct">
										<tr>
											<td style="width:60px"><img src="/media/images/product/<s:property value="#orderProduct.productImage" />" width="50px"></td>
											<td style="width:200px"><s:property value="#orderProduct.productName" /></td>
											<td style="width:110px"><s:property value="#orderProduct.priceFormated" escape="false"/></td>
											<td style="width:60px">&nbsp;</td>	
											<td style="width:50px"><s:property value="#orderProduct.productQuantity" /></td>
											<td style="width:100px">&nbsp;</td>	
											<td style="width:90px"><s:property value="#orderProduct.priceText" /></td>											
										</tr>
										</s:iterator>
										</tbody>
										<tfoot>
										<tr>											
											<td class="center" colspan="3">&nbsp;</td>
											<td class="center" colspan="1">Total Items :</td>																					
											<td class="center" colspan="1"><s:property value="orderProducts.size" /></td>
											<td class="center" colspan="1">Total Items Amount :</td>
											<td class="center" colspan="1"><s:property value="currency" /><s:property value="total" /></td>											
										</tr>
										<tr>
											<td class="center" colspan="5">&nbsp;</td>	
											<td class="center" colspan="1">Shipping Charge :</td>	
											<td class="center" colspan="1">INR 0</td>
										</tr>
										<tr>
											<td class="center" colspan="5">&nbsp;</td>	
											<td class="center" colspan="1">Permotion discount<br>(coupon code:N/A)</td>
											<td class="center" colspan="1">INR 0</td>
										</tr>
										<tr>
											<td class="center" colspan="5">&nbsp;</td>	
											<td class="center" colspan="1">Tax (included in items Price)</td>
											<td class="center" colspan="1">INR 0</td>
										</tr>
										<tr>
											<td class="center" colspan="5">&nbsp;</td>	
											<td class="center" colspan="1">Total Amount :</td>
											<td class="center" colspan="1"><s:property value="total" /></td>
										</tr>
										
										</tfoot>										
									</table>
									
								</div>
							</div>
