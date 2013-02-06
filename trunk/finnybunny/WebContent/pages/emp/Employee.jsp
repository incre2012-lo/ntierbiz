<%@ taglib prefix="s" uri="/struts-tags"%>
<s:if test="%{'Org_Accountant' in CurrentPermission or 'Org_Viewer' in CurrentPermission or 'Org_Open' in CurrentPermission}">	
<s:url id="empListURL" action="empListURL"></s:url><s:a href="%{empListURL}">Back to List </s:a>	
<s:if test="hasFieldErrors()">
<s:fielderror cssClass="msg error"/>
</s:if>
<h3 class="tit">Account Summary</h3>
<p class="msg info">View the status of employee subscription</p>
<table width="100%">
	<tr>
		<td width="100%">C.R.P.F</td>
	</tr>
	<tr>
		<td width="100%">Accounts Branch</td>
	</tr>
</table>
<table width="100%">
	<tr>
		<td colspan="2" width="50%">Annual GPF of Year</td>
		<td width="25%">Page No</td>
		<td width="25%">&nbsp;</td>
	</tr>
	<tr>
		<td width="25%">(${employee.per_no})</td>
		<td width="25%">${employee.emp_name}</td>
		<td width="25%">GPF A/C No</td>
		<td width="25%">${employee.gpf_ac_no}</td>
	</tr>
	<tr>
		<td width="25%">Rank ${employee.rnk_cd}</td>
		<td width="25%">Unit ${employee.unit_cd}</td>
		<td width="25%">Opening Balance</td>
		<td width="25%">Rs.</td>
	</tr>
</table>
<table>
	<tr>
		<td>
			<s:actionerror />
		</td>
	</tr>
</table>
<s:if test="%{'Org_Accountant' in CurrentPermission}">	
<h3 class="tit">Account Activity</h3>
<p class="msg info">Here you can manage routinely account activity</p>
<p class="msg warning">Fields with a red asterisk (*) are mandatory.</p>

			<s:form action="addAmount" method="get" cssClass="xform">
				<s:hidden name="employee.per_no" value="%{employee.per_no}"/>
				<fieldset>
				<legend>Add Account</legend>
				<label>Amount in (INR):*</label>
				<s:textfield name="amount"/>
				<s:radio name="operation" list="operations" value="operation" />
				<s:submit value="submit"  cssClass="btn"/>
				</fieldset>
			</s:form>
</s:if>
<s:if test="%{'Org_Open' in CurrentPermission}">				
<h3 class="tit">Add Opening Account</h3>
<p class="msg info">Here, you can add opening balance</p>
<p class="msg warning">Fields with a red asterisk (*) are mandatory.</p>

			<s:form action="addOpening" method="post" cssClass="xform">
				<s:hidden name="employee.per_no" value="%{employee.per_no}"/>
				<fieldset>
					<legend>Add Account</legend>
					<label>Opening Amount in (INR):*</label>
					<s:textfield name="opening"/>						
							
				<s:submit value="submit" cssClass="btn" />
				</fieldset>
			</s:form>
</s:if>			
<h3 class="tit">Account Summary Report</h3>
<p class="msg info">Account Summary page provides you with a quick synopsis of all of your year accounts. You can view your balance information, as well as the beginning and ending balances from your last statement. Your Available Balance shows the funds currently available for use, while your Balance consists of all transactions that have posted to your account as of the close of the previous business day.
You can easily switch between accounts by selecting a different years in the drop-down box and then select the submit button.
</p>

			<s:form action="showYearStmt" method="post" cssClass="xform">
			<s:hidden name="employee.per_no" value="%{employee.per_no}"/>
			<fieldset>
			<legend>Show report</legend>
			<label>show report of financial statement year:*</label>
			<s:select label="show report of finicial statement year" 
						headerKey="-1" headerValue="Select Year"
						list="years" 
						name="year" 
						value="year" cssClass="text"/>				
			
				<s:submit value="submit" cssClass="btn"  />
			</fieldset>
			</s:form>


<s:if test="%{employeeYearViews!=null && employeeYearViews.size() > 0}">
	<div id="xtable">
		<table class="width100">
			<tr>
				<th>Month / Year</th>
				<th>Subscription</th>
				<th>Recovery</th>
				<th>Advance</th>
				<th>Withdrawl</th>
				<th>NE</th>
				<th>Progressive Total</th>
			</tr>


			<s:iterator value="employeeYearViews" status="empStatus">
				<tr	class="<s:if test="#empStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td>
						<s:url id="monthlylistURL" action="showMonthlyStmt">
							<s:param name="employee.per_no"><s:property value="%{employee.per_no}" /></s:param>
							<s:param name="month"><s:property value="mth_year" /></s:param>
							<s:param name="year"><s:property value="year" /></s:param>
							<s:param name="opening"><s:property value="opening" /></s:param>
						</s:url>
						<s:a href="%{monthlylistURL}"><s:property value="@com.paldaps.bo.dao.hibernate.QueryUtil@displayMonthYear(mth_year)" /></s:a>
					</td>
					<td><s:property value="subs" /></td>
					<td><s:property value="rec" /></td>
					<td><s:property value="adv" /></td>
					<td><s:property value="withdrawal" /></td>
					<td><s:property value="ne" /></td>
					<td><s:property value="prog_total" /></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</s:if>
</s:if>
<s:else>
Sorry, You don't have permission for this link.  
</s:else>