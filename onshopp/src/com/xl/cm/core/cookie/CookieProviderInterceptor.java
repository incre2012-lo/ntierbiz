package com.xl.cm.core.cookie;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class CookieProviderInterceptor extends AbstractInterceptor implements
		PreResultListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String intercept(ActionInvocation invocation) throws Exception {
		before(invocation);
		return invocation.invoke();
	}

	private void before(ActionInvocation invocation) {
		invocation.addPreResultListener(this);
	}

	private void addCookiesToResponse(Object action,
			HttpServletResponse response) {
		if (action instanceof CookieProvider) {
			List<CookieBean> cookies = ((CookieProvider) action).getCookies();
			if (cookies != null) {
				for (CookieBean cookiebean : cookies) {
					Cookie cookie = new Cookie(cookiebean.getCookieName(),
							cookiebean.getCookieValue());
					// Set any other attributes you would like to add
					// A utility such as Commons BeanUtils can be used to copy
					// between to objects
					 cookie.setMaxAge(cookiebean.getMaxAge());
					 cookie.setPath(cookiebean.getPath());
					response.addCookie(cookie);
				}
			}
		}
	}

	public void beforeResult(ActionInvocation invocation, String resultCode) {
		ActionContext ac = invocation.getInvocationContext();
		HttpServletResponse response = (HttpServletResponse) ac.get(StrutsStatics.HTTP_RESPONSE);
		addCookiesToResponse(invocation.getAction(), response);
	}

}