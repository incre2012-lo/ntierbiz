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
		<h2 class="redbg" >Please enter your price and contact</h2>
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
		</div>
</div>
	
		<div class="clear"></div>			
			<div class="section box">
								<h2 class="blubg">Your Order No . <s:property value="order.trackID" /> <span></span></h2>
								<div class="box-content">
									<table border="0" cellpadding="0" cellspacing="0" style="width: 100%; table-layout: fixed;">
										<thead>
										
										<tr class="tbl_hdr">
											<td class="tbl_hdr" style="width:60px">&nbsp;</td>
											<td class="tbl_hdr" style="width:200px" >Items in your order </td>
											<td class="tbl_hdr" style="width:110px" >Price per Unit</td>
											<td class="tbl_hdr" style="width:60px">&nbsp;</td>	
											<td class="tbl_hdr" style="width:50px" >Quantity</td>
											<td class="tbl_hdr" style="width:100px">&nbsp;</td>		
											<td class="tbl_hdr" style="width:90px" >Total</td>											
										</tr>
										</thead>
										<tbody>
										<s:iterator value="order.orderProducts" var="orderProduct">
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
											<td class="center" colspan="1"><s:property value="order.currency" /><s:property value="order.total" /></td>											
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
											<td class="center" colspan="1"><s:property value="order.total" /></td>
										</tr>
										
										</tfoot>										
									</table>
									
								</div>
								<div class="clear"></div>
							</div>
							
							<div class="box tp_mg10">
									<table border="0" cellpadding="0" cellspacing="0" width="100%" class="s">
										<tr>
											<td class="table_detail e s center"> <a href="#" rel=close><input type="button" name="close" value="Close"></a>
										</tr>
									</table>
							</div>
			<div class="clear"></div>
		
