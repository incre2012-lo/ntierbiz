<%@ taglib prefix="s" uri="/struts-tags" %>

<div class="banner ">
			<div class="box align_left">
				<h2 class="blubg">Narrow Your Result<span></span></h2>
				<div class="col_3 categories">
					<div class="section-header"><font class="section-header-1stword"><s:text name="catalog.categories.sub" /></font> <s:text name="catalog.categories.category.title" /></div>
					 <ul class="simple">
					 <s:iterator value="categories" status="count">
						<s:if test="lineage==categoryLineage">
							<li><a href="<%=request.getContextPath()%>/category/${categoryDescription.url}">		
							<s:property value="name" /></a></li>	
						</s:if>
					</s:iterator>
					</ul>
				</div>	
				<div class="clear"></div>		
			</div>	
		<div class="clear"></div>
		<div class="box"><span class="brdc">You had selected : <a href="#"></a></span></div>
		<div class="clear"></div>
</div>

