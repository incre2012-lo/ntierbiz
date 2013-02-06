
<%@ taglib prefix="s" uri="/struts-tags" %>

						<ul>
							 <li>
							   	<a href="${pageContext.request.contextPath}/content/lowest-price_show?ajax=true&amp;width=400&amp;height=160" rel="prettyPhoto[lowest-price]" >Lowest Price</a>
							 </li>										
							 <li>
							  	<a href="${pageContext.request.contextPath}/content/free-shipping_show?ajax=true&amp;width=400&amp;height=160" rel="prettyPhoto[free-shipping]" >Free Shipping</a>										  
							 </li>
							 <li>
							    <a href="${pageContext.request.contextPath}/content/cod_show?ajax=true&amp;width=400&amp;height=160" rel="prettyPhoto[cod]" >Cash On Delivery</a>
							 </li>
							 <li>
							   <a href="${pageContext.request.contextPath}/content/weekly-deal_show?ajax=true&amp;width=400&amp;height=500" rel="prettyPhoto[weekly-deal]" > Weekly Deals</a>
							 </li>
						</ul>
						<div class="clear"></div>					
						<div id="sitesearch">							
							 <form name="frmSearch" action="" method="get" >							 
							  	 <button id="sb" type="submit">Go</button><input name="search" id="search" type="text" maxLength="90"  title="Search by Keyword, SKU # or Item #" /> 
							 </form>
						</div>