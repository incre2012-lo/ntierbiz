<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s"%>

<s:if test="%{'Org_Upload' in CurrentPermission}">	

<h3 class="tit">upload a new file</h3>
<p class="msg warning">Fields with a red asterisk (*) are mandatory.</p>

<s:actionerror />

<s:form action="uploadFile" method="post" enctype="multipart/form-data" cssClass="xform">
	<fieldset>
		<label>Upload Employee File:*</label>
		<s:file name="uploadFile" label="Upload Employee File" />
	</fieldset>
	<fieldset>
		<s:submit value="Upload" cssClass="btn" />
	</fieldset>
</s:form>
<hr class="noscreen" />
<p class="msg info">The list shows all files in this organization. <br>
	Click "New" to add a new user.
	Use the checkboxes and the "Reactivate Account" button to reactivate temporarily disabled accounts immediately or the "Delete" button to delete users.
</p>	
<s:if test="allFiles.size() > 0">
	<div id="xtable">
	<table class="width100">
		<tr>
			<th>File Name</th>
			<th>size</th>
			<th>Modified Date</th>
			<th>Actions</th>
		</tr>
		<s:iterator value="allFiles" status="fileStatus">
			<tr
				class="<s:if test="#fileStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				<td><s:url id="fileDownload" action="downloadFile" ><s:param name="fileName" value="%{fileName}"></s:param></s:url>	<s:a href="%{fileDownload}"><s:property value="fileName" /></s:a></td>
				<td><s:property value="size" /></td>
				<td><s:property value="lastModified" /></td>
				<td>
					<s:url id="deletefile" action="deleteFile">
						<s:param name="fileName" value="%{fileName}"></s:param>
					</s:url> 
					<s:url id="processImportFile" action="processImportFile">
						<s:param name="fileName" value="%{fileName}"></s:param>
					</s:url> 
					<s:a href="%{processImportFile}">Import</s:a> &nbsp;&nbsp;&nbsp;
					<s:a href="%{deletefile}">Delete</s:a>
				</td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:if>

	
</s:if>
<s:else>
<p class="msg error">Sorry, You don't have permission for this link.</p>
  
</s:else>	