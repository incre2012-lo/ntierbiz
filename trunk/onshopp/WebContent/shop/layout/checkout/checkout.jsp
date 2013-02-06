<%
response.setCharacterEncoding("UTF-8");
response.setHeader("Cache-Control","no-cache");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", -1);
%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 		
 		<tiles:importAttribute name="openWrapperStr" scope="request"/>
 		<tiles:insertTemplate template="${openWrapperStr}" >  
  			<tiles:putAttribute name="bgcolor" value="fff" type="string" />
   		</tiles:insertTemplate>
   		<tiles:insertAttribute name="openBody"/>
   		<tiles:insertAttribute name="body"/>
    	<tiles:insertAttribute name="closeBody"/>
   		<tiles:insertAttribute name="closeWrapper"/>
	
	<div class="copyright">
		<div class="copyright-container">					
					Copyright (c)&nbsp;2012&nbsp;
		</div>
		<div class="copyright-terms">
			<div class="terms">ALL RIGHTS RESERVED. THE MEDIA MATERIALS ON THIS WEBSITE ARE NOT TO BE SOLD, TRADED OR GIVEN AWAY, ANY COPYING, MANUPULATION, PUBLISHING OR OTHER TRANSFER OF MATERIALS, EXCEPT AS SPECIFICALLY IS STRICTLY PROHIBITED.</div>
		</div>
	</div>

	<!-- SYSTEM NAME -->
	<div class="footer">
		<div class="footer-container">Provided by <a href="http://www.xlsystemindia.com" class="footer-href" target="_blank">xlsystem</a></div>
	</div>
