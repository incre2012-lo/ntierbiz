<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<ul id="menu">
    
   					<xl:subcategories categoryID="root" alias="pCategory">
						 <li><a href="<c:url value="/${pCategory.categoryID}_buy"/>" class="drop"><s:property value="pCategory.title" /></a>
							 	<div class="dropdown_2columns align_left">
						                <div class="col_2">	                
						                    <ul class="simple">
						                    		<xl:subcategories categoryID="${pCategory.categoryID}" alias="cCategory">						                     
													<li><a href="<c:url value="/${pCategory.categoryID}/${cCategory.categoryID}_buy" />" ><s:property value="cCategory.title" /></a></li>	
													</xl:subcategories>
						                    </ul>  
						                </div>
								</div>
						</li>	
					</xl:subcategories>		
				

							
							    <li class="menu_right"><a href="#" class="drop">
							    	 Brand
							    </a><!-- Begin 3 columns Item -->
							    
							        <div class="dropdown_2columns align_right"><!-- Begin 3 columns container -->
							            
							            <div class="col_2 align_left">
							          			Ideal Home
							            </div>
							        
							        </div><!-- End 3 columns container -->
							        
							    </li><!-- End 3 columns Item -->
		
</ul>
						