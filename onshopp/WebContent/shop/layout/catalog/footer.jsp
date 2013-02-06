
<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>
								<%@ taglib prefix="s" uri="/struts-tags" %>

<div class="clear"></div>		
<div class="xlfooter">	
	<div class="xlfooter_content">
	    	<div class="xlfooter_tab1">
	    	        	<h2>Get in touch</h2>
	    	        	 <span class="email">Email: info@Onshopp.com</span>
	    	        	 <div class="xlfooter_info">
	    	        	 	<span class="orange">Address:</span>
	    	        		 <p class="info">	    	        	 B-18, B1 Community Center, Janak Puri, New Delhi 110058                </p>
	    	        	 </div>
	    	        	                        
	    	        	 <div class="xlfooter_info">                
	    	        		 <span class="orange">Phone:</span>
	    	        	                 <p class="info">					+91 9871997564   /    +91 11 25330413                </p>
	    	        	  </div>             
	    	        	  <div class="xlfooter_copyrights">
	    	        	              <img src="http://www.onshopp.com/media/images/brandings/1/header/xlfooter_logo.png" alt="" title="" /><br />            &copy; 2012 All Rights Reserved            
	    	        	  </div>                                
	    	</div> <!--End of xlfooter_tab1-->
	    	<div class="xlfooter_tab2">        	<h2>Why OnShopp?</h2>            <div class="favorites_box">                <span class="fav_nr">1</span>                <p class="favorites">					We are one of the best online shopping stores in india with hot deals on home, kitchen ,lifestyle and gift items.                  </p>                       </div>                         <div class="favorites_box">                <span class="fav_nr">2</span>                <p class="favorites">					We have exclusive offers from multiple brands.you will products of popular brands and buy online instantly and enjoy free home delivery (Delhi NCR).                </p>                       </div>                                <div class="favorites_box">                <span class="fav_nr">3</span>                <p class="favorites">					For all online shopping you can make payments via multiple options viz credit cards, debit cards, internet banking as well as cash on delivery.                  </p>                       </div>                 </div> <!--End of xlfooter_tab2-->                             	
	    	<div class="xlfooter_tab3">        	
	    		<h2>Links</h2> 
	    	
		    	  <div class="xlfooter_links">                    
		    	  	<ul>                    
		    	  		<li><a href="${pageContext.request.contextPath}/" >Home</a></li>
		    	  		<li><a href="<c:url value="/user/logininput?ajax=true&amp;width=960&amp;height=700" />" rel="prettyPopin[user]">My Account</a></li>				        
						<li><a href="${pageContext.request.contextPath}/xl/xhr_response.html?ajax=true&amp;width=400&amp;height=160" rel="prettyPhoto[ajax]" >Terms &amp; conditions</a></li>
						<xl:subcategories categoryID="root" alias="pCategory">
						<li><a href="<c:url value="/${pCategory.categoryID}_buy"/>" class="drop"><s:property value="pCategory.title" /></a></li>
						</xl:subcategories>	
					</ul>
				</div>	
			</div>
			<div class="clear"></div>
	</div>
	<div class="clear"></div>
</div>				
	<div class="copyright">
		<div class="copyright-container"><jsp:include page="/shop/common/copyright.jsp" />&nbsp;<s:property value="#request.STORE.storename" /></div>
		<div class="copyright-terms">
			<div class="terms"><s:text name="catalog.disclosure" /></div>
		</div>
	</div>

	<!-- SYSTEM NAME -->
	<div class="footer">
		<div class="footer-container"><s:text name="label.generic.providedby" /> <a href="http://www.xlsystemindia.com" class="footer-href" target="_blank"><s:text name="label.system.name" /></a></div>
	</div>
