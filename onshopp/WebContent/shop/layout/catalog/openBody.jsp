	<%@page contentType="text/html"%>
	<%@page pageEncoding="UTF-8"%>

<%@ page import = "java.util.*" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>



			<div class="main">
			
						<!-- TL TO GET MERCHANT STORE BANNER IF ANY WILL FIT width="950" height="200"-->
					<s:if test="#request.STORE.storebanner!= null && #request.STORE.storebanner!= ''">
						<div class="home-banner">
								<img src="<s:property value="#request.STORE.storeBannerPath" />" border="0" width="950px"/>
						</div>
					</s:if>

				<div class="mid-content">



