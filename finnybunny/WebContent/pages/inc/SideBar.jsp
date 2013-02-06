<%@taglib uri="/struts-tags" prefix="s"%>


<s:url id="listURL" action="listUser"></s:url>
<s:url id="uploadURL" action="uploadFile"></s:url>
<s:url id="lastUploadURL" action="lastUpload"></s:url>
<s:url id="empListURL" action="empListURL"></s:url>
<%@taglib uri="/struts-tags" prefix="s"%>
	<div class="padding box">
				<p id="logo"><a href="#"><img src="images/logo.gif" alt="Our logo" title="Visit Site" /></a></p>
	</div>			
				
				<ul class="box">
					<s:if test="%{'Org_Admin' in CurrentPermission}">			
						<s:if test="%{#SelectedMenu eq 'UserMgmt'}">
							  <li id="submenu-active"> <s:a href="%{listURL}">User Management</s:a></li>
						</s:if>
						<s:else>
	   						 <li> <s:a href="%{listURL}">User Management</s:a></li>
						</s:else>
					</s:if>
					<s:if test="%{'Org_Accountant' in CurrentPermission or 'Org_Viewer' in CurrentPermission}">	
						<s:if test="%{#SelectedMenu eq 'EmpMgmt'}">
								 <li id="submenu-active"> <s:a href="%{empListURL}">Employee Management</s:a></li>
						</s:if>
						<s:else>
							 	<li> <s:a href="%{empListURL}">Employee Management</s:a></li>						
						</s:else>
					</s:if>
					<s:if test="%{'Org_Upload' in CurrentPermission}">	
						<s:if test="%{#SelectedMenu eq 'Upload'}">
								<li id="submenu-active"> <s:a href="%{uploadURL}">Upload Management</s:a></li>
						</s:if>
						<s:else>
							 	<li> <s:a href="%{uploadURL}">Upload Management</s:a></li>				
						</s:else>
					</s:if>
					<s:if test="%{'Org_Upload' in CurrentPermission}">
						<s:if test="%{#SelectedMenu eq 'JobMgmt'}">
								<li id="submenu-active"> <s:a href="%{lastUploadURL}">Last Upload</s:a></li>
						</s:if>
						<s:else>
							 	<li> <s:a href="%{lastUploadURL}">Last Upload</s:a></li>
						</s:else>
					</s:if>					
				</ul>
					
				