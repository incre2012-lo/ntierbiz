<%
response.setCharacterEncoding("UTF-8");
response.setHeader("Cache-Control","no-cache");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", -1);
%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>


<html>
<head>		
		<jsp:include page="/shop/common/metaHead.jsp" />
		<jsp:include page="/shop/common/cssLinks.jsp" />
</head>
<body>
		<tiles:importAttribute name="openWrapperStr" scope="request"/>
		<tiles:insertTemplate template="${openWrapperStr}" >  
      		<tiles:putAttribute name="bgcolor" value="170340" type="string"/>
   		</tiles:insertTemplate>
	    <tiles:insertAttribute name="header"/>
	    <tiles:insertAttribute name="closeWrapper"/>
	    <tiles:insertTemplate template="${openWrapperStr}" >  
  			<tiles:putAttribute name="bgcolor" value="fff" type="string" />
   		</tiles:insertTemplate>
   		<tiles:insertAttribute name="openBody"/>
   		<tiles:insertAttribute name="body"/>
    	<tiles:insertAttribute name="closeBody"/>
   		<tiles:insertAttribute name="closeWrapper"/>
    	<tiles:insertAttribute name="footer"/>
	  
		<jsp:include page="/shop/common/jsLinks.jsp" />
</body>
</html>