<%@ page language="java" contentType="text/html;" %>
<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>	

	<!--category.jsp  -->
				<div class="tp_mg10">
						<ul id="breadcrumbs-two">
							<li><a href="<c:url value="/" />">home</a></li>
							<s:if test="parentCategoryID != null && parentCategoryID!='' && parentCategoryID!='root'">
							<li><a href="<c:url value="/${parentCategoryID}_buy" />" ><s:property value="@com.xl.cm.core.util.PageUtil@getCategoryDisplayName(parentCategoryID)" /></a></li>
							</s:if>
							<li><a href="" class="current"><s:property value="@com.xl.cm.core.util.PageUtil@getCategoryDisplayName(categoryID)" /></a></li>
						</ul>
				</div>
				<div class="clear"></div>	
				<!-- TL TO GET STORE DESCRIPTION -->
				<div class="section">
					<s:property value="pageText" escape="false"/>
				</div>				
				<div class="clear"></div>				
				<xl:categoryproducts categoryID="${categoryID}" alias="featureProducts"><div class="clear"></div></xl:categoryproducts>
				<jsp:include page="/components/catalog/inc/listbox.jsp"/>
				<div class="clear"></div>				
				<jsp:include page="/components/catalog/inc/jcarousel.jsp" />
				<div class="clear"></div>	
				<jsp:include page="inc/bottomline.jsp" />
			<div class="clear"></div>







