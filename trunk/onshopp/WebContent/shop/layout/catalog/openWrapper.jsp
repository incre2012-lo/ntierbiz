<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:importAttribute/>
	<c:choose>
		<c:when test="${bgcolor!=null}">
		  <div class="siteLayout site" style="background-color: #<c:out value="${bgcolor}"/>;">
		</c:when>
		<c:otherwise>
		  <div class="siteLayout site"> 	
		</c:otherwise>
	</c:choose>			
			<div class="minWidth">		