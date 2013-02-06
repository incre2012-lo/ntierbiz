<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>	


					<div class="section boxwb">
							<h2 class="blubg"><s:property value="boxtitle" /><span></span></h2>
							<div class="products">
								<ul>
									<s:iterator value="featureProducts" status="count">
										<s:if test="#count.index%4==0" ><!-- 4 items max -->
							    			<li class="first">
							 			</s:if>
							 			<s:elseif test="%{#count.index%4==3}">
										   <li class="last">
										</s:elseif>
							 			<s:else>
							    			<li>
							 			</s:else>
									 			
													<a href='<c:url value="${urlPath}"/>' ><img src="/media/images/product/<s:property value="productImage" />" width="231px" height="231px" border="0"> </a>
																						 											
																											
															<h6 class="ac"><s:property value="title" /></h2>
															<div class="product-desc">																																									
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
																		<div class="button-right">
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
															
													
												</li>
											<s:if test="#count.index%4==3" ><!-- 4 items max -->
							    				<div class="clear"></div>	
							 				</s:if>		
										</s:iterator>
								</ul>				
							</div>
				</div>
