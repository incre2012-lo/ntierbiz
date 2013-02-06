package com.paldaps.system.core.interceptor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.paldaps.bo.entity.user.User;
import com.paldaps.bo.service.ServiceFactory;
import com.paldaps.system.core.util.Constants;
import com.paldaps.system.core.util.SpringUtil;

public class DefaultValueStackInterceptor extends AbstractInterceptor implements StrutsStatics{

	
	private static final long serialVersionUID = 1L;

	public String intercept(ActionInvocation invocation) throws Exception {
		final ActionContext context = invocation.getInvocationContext ();
		HttpServletRequest request = (HttpServletRequest) context.get(HTTP_REQUEST);
		HttpSession session =  request.getSession (true);

		// Is there a "user" object stored in the user's HttpSession?
		Object userid = session.getAttribute (Constants.USER_HANDLE);
		if (userid != null) {
			ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");
			User currentuser=serviceFactory.getUserService().getUserByID((String) userid);
			Map<String,String> map=new HashMap<String,String> ();
			map.put("firstName",currentuser.getFirstName());
			map.put("lastName",currentuser.getLastName() );
			if(StringUtils.isNotEmpty(currentuser.getPermissions())){
			String permissions[]=currentuser.getPermissions().replaceAll(" ","").split(",");
			context.getValueStack().set("CurrentPermission", permissions);
			}
			context.getValueStack().set("CurrentUser", map);
			
		}
		return invocation.invoke();
	}

	
}
