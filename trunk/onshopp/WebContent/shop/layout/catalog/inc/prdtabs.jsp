<%@ page language="java" contentType="text/html;" %>
<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>	
<div class="tabsbg btm_mg10">

<ul id="tabs">
    <li><a href="#" title="tab1">Product Details</a></li>
    <li><a href="#" title="tab2">Brand</a></li>
    <li><a href="#" title="tab3">Review</a></li>
</ul>

<div id="acontent"> 
    <div id="tab1">
   		<c:forEach var="item" items="${product.variationAttrs}">
			 <h2> ${item} variation of this product.</h2>			 
			 	<s:if test="product.typecode == 2 || product.typecode == 4"> <xl:attributeproducts productID="${product.productID}" attribute="${item}" alias="varProduct" >
			  		<a href='<c:url value="${varProduct.urlPath}"/>' > <s:property value="varProduct.prefix" /> </a> &nbsp;
			 	 </xl:attributeproducts></s:if><s:else> <xl:attributeproducts productID="${product.productID}" attribute="${item}" alias="varProduct" siblingVariation="true">
			  		<a href='<c:url value="${varProduct.urlPath}"/>' > <s:property value="varProduct.prefix" /> </a> &nbsp;
			 	 </xl:attributeproducts></s:else>			        
		</c:forEach> 
    	
    	
    	  
        <h2>Product Description</h2>
        <p><s:property value="product.desc"  escape="false"/> </p>      
    </div>
    <div id="tab2">
       <s:property value="#request.ProductBrand.body" escape="false" /> 
    </div>
    <div id="tab3">
        <h2>No review yet</h2>
        
    </div>
</div>

</div>