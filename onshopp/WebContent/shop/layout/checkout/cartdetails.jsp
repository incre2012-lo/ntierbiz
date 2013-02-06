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

	 <div class="siteLayout site" style="background-color: #fff;">
		
		
				
			<div class="minWidth">
					<div class="main">
						<div class="mid-content">
							<div class="section box">
								<h2 class="blubg">My Shopping BAG<span></span></h2>
								<div class="box-content">
									<s:form action="/cart/ajax/update" method="post" class="genericForm">
									<table border="0" cellpadding="0" cellspacing="0" style="width: 100%; table-layout: fixed;">
										<thead>
										<tr class="tbl_hdr">
											<td class="tbl_hdr" style="width:60px">&nbsp;</td>
											<td class="tbl_hdr" style="width:200px">Items in your order <input type="hidden" name="shoppingCart.quantity" value="<s:property value="shoppingCart.quantity" />" ></td>
											<td class="tbl_hdr" style="width:120px">Price per Unit</td>
											<td class="tbl_hdr" style="width:90px">&nbsp;</td>	
											<td class="tbl_hdr" style="width:60px">Quantity</td>
											<td class="tbl_hdr" style="width:90px">&nbsp;</td>
											<td class="tbl_hdr" style="width:60px">Total</td>
											<td class="tbl_hdr" style="width:90px">Remove</td>
										</tr>
										</thead>
										<tbody>
										<s:iterator value="shoppingCart.products"  status="stat">
										<tr>
											<td class="center" style="width:60px"><input type="hidden" name="cartProducts[${stat.index}].image" value="<s:property value="value.image" />" ><img src="/media/images/product/<s:property value="value.image" />" width="50px"></td>
											<td class="center" style="width:200px"><input type="hidden" name="cartProducts[${stat.index}].productName" value="<s:property value="value.productName" />" ><s:property value="value.productName" /></td>
											<td class="center" style="width:120px"><input type="hidden" name="cartProducts[${stat.index}].priceText" value="<s:property value="value.priceText" />" ><s:property value="value.priceText" escape="false"/></td>
											<td class="center" style="width:90px">&nbsp;</td>	
											<td class="center" style="width:60px"><input type="text" name="cartProducts[${stat.index}].quantity" value="<s:property value="value.quantity" />" size="3"></td>
											<td class="center" style="width:90px">&nbsp;</td>
											<td class="center" style="width:60px"><input type="hidden" name="cartProducts[${stat.index}].mainCartLine" value="<s:property value="value.mainCartLine" />" ><s:property value="value.mainCartLine" /></td>
											<td class="center" style="width:90px"><input type="hidden" name="cartProducts[${stat.index}].productID" value="<s:property value="value.productID" />" ><a href="<c:url value="/cart/ajax/${value.productID}/${value.quantity}_remove?ajax=true&amp;width=960&amp;height=700" />" rel="internal" >remove</a></td>
										</tr>
										</s:iterator>
										</tbody>
										<tfoot>
										<tr>											
											<td class="center" colspan="3"><a href="<c:url value="/checkout/show.action" />" rel="internal" ><input type="button" name="cart" value="Checkout Now"/></a></td>																					
											<td class="center" colspan="1">Total Items :</td>
											<td class="center" colspan="1"><s:property value="shoppingCart.quantity" /></td>
											<td class="center" colspan="1">Total Amount :</td>
											<td class="center" colspan="1"><s:property value="shoppingCart.total" /></td>
											<td class="center" colspan="1"><input type="submit" name="cart" value="Update Cart"/></td>	
										</tr>
										</tfoot>									
									</table>
									</s:form>
								</div>
							</div>
							
						</div>
						
						<div class="clear"></div>	
						
					</div><!-- end main -->
				<div class="clear"></div>
			</div>		
		</div>
	<div class="copyright">
		<div class="copyright-container">					
					Copyright (c)&nbsp;2012&nbsp;
		</div>
		<div class="copyright-terms">
			<div class="terms">ALL RIGHTS RESERVED. THE MEDIA MATERIALS ON THIS WEBSITE ARE NOT TO BE SOLD, TRADED OR GIVEN AWAY, ANY COPYING, MANUPULATION, PUBLISHING OR OTHER TRANSFER OF MATERIALS, EXCEPT AS SPECIFICALLY IS STRICTLY PROHIBITED.</div>
		</div>
	</div>

	<!-- SYSTEM NAME -->
	<div class="footer">
		<div class="footer-container">Provided by <a href="http://www.xlsystemindia.com" class="footer-href" target="_blank">xlsystem</a></div>
	</div>
