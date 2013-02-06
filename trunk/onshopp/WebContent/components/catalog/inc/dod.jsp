<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>
						<xl:dod/>
						<div class="dod">
							<div class="box">									
									<div class="tp_mg10 ac" style="position:relative;">															
																<a href='<c:url value="${urlPath}"/>' ><img src="/media/images/product/<s:property value="productImage" />" width="290px" height="290px"> </a>															
														<div class="product-info">															
															<h3>${title}</h3>	
															<div class="product-desc ac">																										
																<s:property value="formatHTMLProductPrice" escape="false"/>															
														 			 <div class="button-left addToCart">
																			<input type="hidden" id="productQuantity" name="productQuantity" value="1">
																			<input type="hidden" id="productID" name="productID" value="<s:property value="productID" />">
																			
																			<a href="<c:url value="/cart/ajax/${productID}/1_add?ajax=true&amp;width=960&amp;height=700" />" rel="prettyPopin[${productID}]">
																				<div class="href-button">
																					<span class="button1-box1"></span>
																					<span class="button1-box2a"><s:text name="catalog.addtocart" /></span>
																					<span class="button1-box3"></span>
																				</div>
																			</a>
																			
																		</div>
																		<div class="clear"></div>	
																		<div class="button-left">
																			<a href='<c:url value="${urlPath}"/>' >
																				<div class="href-button">
																					<span class="button1-box1"></span>
																					<span class="button1-box2a"><s:text name="label.generic.details" /></span>
																					<span class="button1-box3"></span>
																				</div>
																			</a>
																		</div>
																	<div class="clear"></div>																																																
															</div>
															
														</div>
														<div class="clear"></div>											
									</div>
								<div class="clear"></div>	
								<h2 class="blubg ac">Deals Of Day</h2>
							</div>
							<div class="clear"></div>	
						</div>