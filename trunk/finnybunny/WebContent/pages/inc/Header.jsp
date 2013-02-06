<%@taglib uri="/struts-tags" prefix="s"%>
<s:url id="logoutURL" action="logout"></s:url>
<!-- Tray -->
	<div id="tray" class="box">
<s:if test="CurrentUser!= null"> 
		<p class="f-left box">

			<!-- Switcher -->
			<span class="f-left" id="switcher">
				<a href="#" rel="1col" class="styleswitch ico-col1" title="Display one column"><img src="design/switcher-1col.gif" alt="1 Column" /></a>
				<a href="#" rel="2col" class="styleswitch ico-col2" title="Display two columns"><img src="design/switcher-2col.gif" alt="2 Columns" /></a>
			</span>
			Your Project Roles: <strong><s:iterator value="CurrentPermission" var="key" ><s:property value="getText('short_desc.'+#key)" />,&nbsp;</s:iterator></strong>
		</p>
		<p class="f-right">User: <strong><s:property value="CurrentUser.firstName" /> &nbsp; <s:property value="CurrentUser.lastName" /></strong>&nbsp;&nbsp;&nbsp;<s:a href="%{logoutURL}">LOG OUT</s:a></p>
</s:if>
	</div> 
<!--  /tray -->