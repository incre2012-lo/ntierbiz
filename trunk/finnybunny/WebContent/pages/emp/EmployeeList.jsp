<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" type="text/css" href="css/flexigrid.css" />
<script type="text/javascript" src="js/flexigrid.js"></script>
<s:if test="%{'Org_Accountant' in CurrentPermission or 'Org_Viewer' in CurrentPermission}">	


<p class="msg info">The list shows all employees in this organization. 
	Search for records matching your supplied criteria (by first clicking the search icon).
	Sort in either ascending or descending order by a selected column.
	Navigate between pages using the navigation icons or jump straight to a particular page.
	Hide and show columns to make optimum use of available space.<br>
	One row can be selected at a time to more details of employee.
</p>
<table class="flexme3" style="display: none"></table>
<script type="text/javascript">
		$(".flexme3").flexigrid({
			url : 'json/employee.action',
			dataType : 'json',
			colModel : [ {
				display : 'Employee Name',
				name : 'emp_name',
				width : 180,
				sortable : true,
				align : 'left'
			}, {
				display : 'Person Number',
				name : 'per_no',
				width : 120,
				sortable : true,
				align : 'left'
			}, {
				display : 'GPF Account No',
				name : 'gpf_ac_no',
				width : 130,
				align : 'left'
			}, {
				display : 'Unit',
				name : 'unit_cd',
				width : 80,
				align : 'right'
			}, {
				display : 'Rank',
				name : 'rnk_cd',
				width : 80,
				align : 'right'
			}, {
				display : 'Pan Number',
				name : 'pan_number',
				width : 80,
				align : 'right',
				hide : true
			} ],
			searchitems : [ {
				display : 'Person Number',
				name : 'per_no'
			}, {
				display : 'Name',
				name : 'emp_name',
				isdefault : true
			} ],
			sortname : "emp_name",
			sortorder : "asc",
			usepager : true,
			title : 'GPF Employee List',
			useRp : true,
			rp : 10,
			showTableToggleBtn : true,
			singleSelect: true,
			idProperty:'per_no',
			onRowSelect:function(e,r){ window.location.href="empDetails.action?employee.per_no="+r[0].attributes['id'].value.replace("row","");},
			height : 280
		});	
	</script>
	
	
</s:if>
<s:else>
Sorry, You don't have permission for this link.  
</s:else>