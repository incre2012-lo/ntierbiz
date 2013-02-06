<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<tiles:importAttribute name="SelectedMenu"/> 
 <s:set name="SelectedMenu" value="%{#attr.SelectedMenu}"/>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FunnyBunny</title>
<link rel="STYLESHEET" type="text/css" href="css/style.css"/>
<link rel="STYLESHEET" type="text/css" href="css/bo_style.css"/>
<script type="text/javascript"src="js/jquery-1.7.1.min.js"></script>
</head>
<body>
<div id="header">
	<tiles:insertAttribute name="header"/>
</div>
<hr class="noscreen" />
<div id="cols">
		<div id="aside" class="box">
			<tiles:insertAttribute name="sidebar"/>
		</div>
		<div id="content" class="box">
				<tiles:insertAttribute name="main"/>
		</div>
</div>
<hr class="noscreen" />
</body>
</html>