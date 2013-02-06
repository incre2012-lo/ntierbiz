<%@ page language="java" contentType="text/html;" %>
<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>	
<s:iterator value="#request.ProductAttributes" var="attribute" status="status"> 
	<b><s:property value="#attribute.attrName" /> :</b>&nbsp;<s:property value="#attribute.attrValue" /> <br>
</s:iterator>