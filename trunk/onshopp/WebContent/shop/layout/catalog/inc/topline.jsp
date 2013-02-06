<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>
								<%@ taglib prefix="s" uri="/struts-tags" %>
				<div class="blk_12 tl_wel">
						<s:if test="#session.user==null">						
							<p>
								<span>Welcome Guest !.</span>
								<span>Please 	<a href="<c:url value="/user/reginput?ajax=true&amp;width=960&amp;height=700" />" rel="prettyPopin[user]"> create an account</a> or <a href="<c:url value="/user/logininput?ajax=true&amp;width=960&amp;height=700" />" rel="prettyPopin[user]"> Sign in</a>.  </span>
							</p>
						</s:if>	
						<s:else>
							<p>
								<span>Welcome <b><s:property value="#session.user.firstName" />&nbsp;<s:property value="#session.user.lastName" /></b>!</span>
							</p>
						</s:else>
												
						
					</div> 
					<div class="blk_12" >	
						<ul class="tl_menu">								
							 <li>
							 	<a href="${pageContext.request.contextPath}/content/customer-serv_show?ajax=true&amp;width=400&amp;height=160" rel="prettyPhoto[customer-serv]" >Customer Service</a>
							 </li>
							 <li>
							   <a href="${pageContext.request.contextPath}/order/status?ajax=true&amp;width=960&amp;height=400" rel="prettyPopin[order-status]">Order Status</a>
							 </li>
							 <s:if test="#session.user!=null">	
							 <li>
							   <a href="">My Account</a>
							 </li>
							  <li>
							 	 <a href="<c:url value="/user/logout?ajax=true&amp;width=960&amp;height=700" />" rel="prettyPopin[user]">Log Out</a>
							 </li>
							</s:if>																 
						</ul>						
					</div> 