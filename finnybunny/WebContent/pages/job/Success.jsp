<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" type="text/css" href="css/flexigrid.pack.css" />
<script type="text/javascript" src="js/flexigrid.pack.js"></script>
<s:if test="%{'Org_Upload' in CurrentPermission}">	
<table class="flexme3" style="display: none"></table>
<script type="text/javascript">
		$(".flexme3").flexigrid({
			url : 'json/demo.action',
			dataType : 'json',
			colModel : [ {
				display : 'Year-Month',
				name : 'yr_mth',
				width : 40,
				sortable : true,
				align : 'center'
			}, {
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
				sortable : true,
				align : 'left'
			}, {
				display : 'GPF Subscription',
				name : 'gpf_subs',
				width : 80,
				sortable : true,
				align : 'right'
			}, {
				display : 'Advance',
				name : 'advance',
				width : 80,
				sortable : true,
				align : 'right'
			}, {
				display : 'Recovery',
				name : 'gpf_arr_rec',
				width : 80,
				sortable : true,
				align : 'right'
			}, {
				display : 'Pan Number',
				name : 'pan_number',
				width : 80,
				sortable : true,
				align : 'right',
				hide : true
			} ],
			buttons : [ {
				name : 'Publish it Live',
				bclass : 'add',
				onpress : doPublish
			}, {
				name : 'Cancel Process',
				bclass : 'delete',
				onpress : test
			}, {
				separator : true
			} ],
			searchitems : [ {
				display : 'Person Number',
				name : 'per_no'
			}, {
				display : 'Name',
				name : 'emp_name',
				isdefault : true
			} ],
			sortname : "iso",
			sortorder : "asc",
			usepager : true,
			title : 'Upload Employee',
			useRp : true,
			rp : 10,
			showTableToggleBtn : true
		});

		function test(com, grid) {
			if (com == 'Delete') {
				confirm('Delete ' + $('.trSelected', grid).length + ' items?')
			} else if (com == 'Add') {
				alert('Add New Item');
			}
		}
		
		function doPublish(com,grid){
			if(com=='Publish it Live'){
				 window.location.href = 'publish.action';
				    return false;
			}
		}
	</script>
	
	
</s:if>
<s:else>
<p class="msg error">Sorry, You don't have permission for this link.</p>
</s:else>		