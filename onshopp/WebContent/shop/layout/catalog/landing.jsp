<%@ page language="java" contentType="text/html;" %>
<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>	

	
				<jsp:include page="/components/catalog/imageSlider2.jsp" /> 
				<jsp:include page="/components/catalog/inc/dod.jsp" /> 
				<div class="clear"></div>	
				<!-- TL TO GET STORE DESCRIPTION -->
				<div class="section">
					<s:property value="pageText" escape="false"/>
				</div>
				<div class="clear"></div>	
				<jsp:include page="/components/catalog/inc/jcarousel.jsp" />
				<div class="clear"></div>				
				<xl:labelproducts label="feature"><div class="clear"></div></xl:labelproducts>
				<jsp:include page="/components/catalog/inc/listbox.jsp"/>
				<div class="clear"></div>
				

			<jsp:include page="inc/bottomline.jsp" />
			<div class="clear"></div>







