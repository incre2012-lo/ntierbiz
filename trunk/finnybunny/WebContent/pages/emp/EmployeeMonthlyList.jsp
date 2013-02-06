<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<style type="text/css">
@import url(css/bo_style.css);
</style>

<s:if test="%{'Org_Accountant' in CurrentPermission or 'Org_Viewer' in CurrentPermission}">	

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
<p class="msg info">Monthly Account Summary page provides you with a quick synopsis of all of your transaction. You can view your balance information, as well as the beginning and ending balances from your last statement. Your Available Balance shows the funds currently available for use, while your Balance consists of all transactions that have posted to your account as of the close of the previous business day.
You can easily go back to previous just to click "back" button.</p>

<s:if test="employeeMonthlyViews.size() > 0">
	<div id="xtable">
		<table class="width100" cellpadding="5px" width="100%">
			<tr class="even">
				<th>Month / Year</th>
				<th>Subscription</th>
				<th>Recovery</th>
				<th>Advance</th>
				<th>Withdrawl</th>
				<th>NE</th>
				<th>Progressive Total</th>
			</tr>


			<s:iterator value="employeeMonthlyViews" status="empStatus">
				<tr	class="<s:if test="#empStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td><s:property value="mth_year" /></td>
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
		<s:form action="showYearStmt" method="post" cssClass="xform">
			<s:hidden name="employee.per_no" value="%{employee.per_no}"/>
			<fieldset>	
				<s:hidden name="year" value="%{year}" />
				<s:submit value="<<< Back" cssClass="btn"  />
			</fieldset>
		</s:form>
		
		
	
</s:if>
<s:else>
<p class="msg error">Sorry, You don't have permission for this link.</p>
</s:else>		