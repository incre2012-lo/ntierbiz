<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>


<s:if test="%{'Org_Admin' in CurrentPermission}">
<h3 class="tit">Create/Update New User</h3>

<p class="msg info">
	Click "save" to add/update a new/existing user.</br>
	Use the checkboxes to assign permissions.
</p>
<p class="msg warning">Fields with a red asterisk (*) are mandatory.</p>
<s:if test="hasFieldErrors()">
<s:fielderror cssClass="msg error"/>
</s:if>
<s:if test="(user.uuid == null || user.uuid.equals(''))"> 
	<s:form action="createUser" cssClass="xform">	
		<fieldset>
			<legend>User Information</legend>
			<label>First Name :<span class="high bigger">*</span></label>
			<s:textfield name="user.firstName" label="First Name" cssClass="text"/><br>
			<label>Last Name :<span class="high bigger">*</span></label>
			<s:textfield name="user.lastName" label="Last Name" cssClass="text" /><br>
			<label>Email :<span class="high bigger">*</span></label>
			<s:textfield name="user.email" label="Email" cssClass="text"/><br>
		</fieldset>
		<fieldset>
			<legend>Permissions Assignment</legend>
			<s:iterator value="{'Org_Accountant','Org_Admin','Org_Viewer','Org_Upload','Org_Open'}" var="proj" status="stat" >    
			  <s:if test="%{#proj in defaultPermissions}">
			    <s:checkbox name="userpermissions" fieldValue="%{#proj}" value="true"/>    
			  	<s:property value="getText(#proj)" /> <br/>   
			  </s:if>
			  <s:else>
			  	<s:checkbox name="userpermissions" fieldValue="%{#proj}" value="false"/>    
			  	<s:property value="getText(#proj)" /> <br/>  
			  </s:else>			                    
			</s:iterator> 
		</fieldset>
		<fieldset>
		<s:submit name="Save" value="Save" cssClass="btn"/>
		</fieldset>
	</s:form>
</s:if>	
<s:else>
	<s:form action="updateUser" cssClass="xform">
	<s:hidden name="user.uuid" />
	<s:hidden name="id" value="user.uuid"/>
		<fieldset>
			<legend>User Information</legend>
			<label>First Name :<span class="high bigger">*</span></label>
			<s:textfield name="user.firstName" label="First Name" cssClass="text"/><br>
			<label>Last Name :<span class="high bigger">*</span></label>
			<s:textfield name="user.lastName" label="Last Name" cssClass="text" /><br>
			<label>Email :<span class="high bigger">*</span></label>
			<s:textfield name="user.email" label="Email" cssClass="text"/><br>
		</fieldset>
		<fieldset>
			<legend>Permissions Assignment</legend>
			<s:iterator value="{'Org_Accountant','Org_Admin','Org_Viewer','Org_Upload','Org_Open'}" var="proj" status="stat" >    
			  <s:if test="%{#proj in defaultPermissions}">
			    <s:checkbox name="userpermissions" fieldValue="%{#proj}" value="true"/>    
			  	<s:property value="getText(#proj)" /> <br/>   
			  </s:if>
			  <s:else>
			  	<s:checkbox name="userpermissions" fieldValue="%{#proj}" value="false"/>    
			  	<s:property value="getText(#proj)" /> <br/>  
			  </s:else>			                    
			</s:iterator> 
		</fieldset>
		<fieldset>
		<s:submit name="Save" value="Save" cssClass="btn"/>
		<s:url id="listURL" action="listUser"></s:url>
		<input type="button" value="Cancel" class="btn" onclick="window.location='${listURL}'"/>
		</fieldset>
	</s:form>
</s:else>


		
	
<hr class="noscreen" />

<s:if test="userList.size() > 0">
<p class="msg info">The list shows all users in this organization. <br>
	Click "Delete" to delete a user<br>
	Click "edit" to update user.
</p>
	<div id="xtable">
	<table class="width100">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Permission</th>			
			<th>Edit</th>
			<th>Delete</th>
			<th>Password</th>
		</tr>
		<s:iterator value="userList" status="userStatus">
			<tr
				class="<s:if test="#userStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				<td><s:property value="firstName" /></td>
				<td><s:property value="lastName" /></td>
				<td><s:property value="email" /></td>
				<s:set name="permissionsArr" value="@com.paldaps.bo.dao.hibernate.QueryUtil@getArray4mComma(permissions)"/>
				<td><s:iterator value="permissionsArr" var="key" ><s:property value="getText('short_desc.'+#key)" />,&nbsp;</s:iterator></td>
				<td><s:url id="editURL" action="editUser">
					<s:param name="user.uuid" value="%{uuid}"></s:param>
				</s:url> <s:a href="%{editURL}">Edit</s:a></td>
				<td><s:url id="deleteURL" action="deleteUser">
					<s:param name="user.uuid" value="%{uuid}"></s:param>
				</s:url> <s:a href="%{deleteURL}">Delete</s:a></td>
				<td><s:url id="generatePasswordURL" action="generatePasswordInput">
					<s:param name="user.uuid" value="%{uuid}"></s:param>
				</s:url> <s:a href="%{generatePasswordURL}">Generate</s:a></td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:if>
</s:if>
<s:else>
Sorry, You don't have permission for this link.  
</s:else>
