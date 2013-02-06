<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>
<script>

$(document).ready(function() {
    // find all the input elements with title attributes
 $("a[rel^='prettyPopin']").prettyPopin({
	loader_path: '${pageContext.request.contextPath}/xl/css/images/prettyPopin/loader.gif',
	followScroll: false,
	callback: function(){
		location.reload();	  
 	}
 });
});

</script>