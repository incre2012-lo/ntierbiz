<%@ page language="java" contentType="text/html;" %>
<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>	

	<!--product.jsp  -->
					
				<div class="tp_mg10">
						<ul id="breadcrumbs-two">
							<li><a href="<c:url value="/" />">home</a></li>
							<li><a href="<c:url value="/${parentCategoryID}_buy" />" ><s:property value="@com.xl.cm.core.util.PageUtil@getCategoryDisplayName(parentCategoryID)" /></a></li>
							<li><a href="<c:url value="/${parentCategoryID}/${categoryID}_buy" />" ><s:property value="@com.xl.cm.core.util.PageUtil@getCategoryDisplayName(categoryID)" /></a></li>
							<li><a href="" class="current"><s:property value="product.title" /></a></li>
						</ul>
				</div>
				<div class="clear"></div>
				<div class="box tp_mg10 blk" style="width:300px;margin-right:10px;">
						<div class="bigimg">
							<a class="zoom" id="zoommer" href="/media/images/product/<s:property value="product.productImage" />" rel="prettyPhoto[<s:property value="product.productID" />]" title="<s:property value="product.title" />">
								
									<img  id="loadimg" src="/media/images/product/<s:property value="product.productImage" />" width="300px" height="352px" border="0">							
								
							</a>
						</div>
						
							<div class="section prdgallery">				
											<ul >
												<li>
													<a href="/media/images/product/<s:property value="product.productImage" />" rel="prettyPhoto[<s:property value="product.productID" />]" title="<s:property value="product.title" />"><img  class="imgthnail"  src="/media/images/product/<s:property value="product.productImage" />" width="50px" height="50px"  border="0"></a>
												</li>	
											<s:iterator value="product.imagesPath" var="image">
												<li>
													<a href="/media/images/product/<s:property value="image" />" rel="prettyPhoto[<s:property value="product.productID" />]" title="<s:property value="product.name" />"><img  class="imgthnail"  src="/media/images/product/<s:property value="image" />" rel="prettyPhoto" class="product-thumbnail" width="50px" height="50px" border="0"></a>
												</li>																			
											</s:iterator>
											</ul>	
													
							</div>	
					
						<div class="clear"></div>
				</div>
				<div class="boxwb tp_mg10 blk" style="width:332px;margin-right:10px;">
					<div class="detail-box">
									<div class="detail-title"><s:property value="product.title" /></div>
									<div class="detail-info">
										<s:if test="product.productHighlight != null && product.productHighlight!=''">
											<s:property value="product.productHighlight" /><br><br>
										</s:if>
										<div class="product-desc ac">																										
											<s:property value="product.formatHTMLProductPrice" escape="false"/>															
									 			 <div class="button-left addToCart">
														<span class="qty-label"><b><s:text name="label.generic.qty" />:</b> </span>
														<span class="qty-box1"></span>
														<span><input type="text" class="qty-box2" name="productQuantity" id="productQuantity" value="1" disabled ></span>
														<span class="qty-box3"></span>
														<span class="qty-button">
															<a href="<c:url value="/cart/ajax/${product.productID}/1_add?ajax=true&amp;width=960&amp;height=700" />" rel="prettyPopin[${product.productID}]">
															<input type="hidden" id="productID" name="productID" value="<s:property value="product.productID" />">
															<div class="href-button">
																<span class="button1-box1"></span>
																<span class="button1-box2a"><s:text name="catalog.addtocart" /></span>
																<span class="button1-box3"></span>
															</div>
															</a>
														</span>
														
													</div>
													<div class="clear"></div>	
												<div class="clear"></div>																																																
										</div>	
										<s:if test="product.shortDesc != null && product.shortDesc!=''">
											<br><s:property value="product.shortDesc" /><br><br>
										</s:if>									
									</div>
						</div>
			  		 <div class="clear"></div>
			  		 <div class="section"><jsp:include page="inc/prdoffer.jsp" /></div>
			  		 <div class="clear"></div>
			  		 <div class="section"><jsp:include page="inc/prdstdattr.jsp" /></div>
			  		 <div class="clear"></div>
  			 </div>
  			 <div class="tp_mg10 blk right" style="width:276px;">
					<jsp:include page="inc/prodsidebar.jsp" />
			</div>
			<div class="clear"></div>							
				<jsp:include page="inc/prdtabs.jsp" />
			<div class="clear"></div>							
				<jsp:include page="/components/catalog/inc/jcarousel.jsp" />
			<div class="clear"></div>	
				<jsp:include page="inc/bottomline.jsp" />
			<div class="clear"></div>


