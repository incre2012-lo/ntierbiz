package com.paldaps.system.core.interceptor;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.paldaps.system.core.security.SecurityManager;
import com.paldaps.system.core.util.Constants;
import com.paldaps.system.core.util.SpringUtil;

/**
 * A Struts 2 interceptor that implements a login system.
 */
public class LoginInterceptor extends AbstractInterceptor implements StrutsStatics {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SecurityManager securityManager;
	private static final Log log = LogFactory.getLog (LoginInterceptor.class);

	public void init () {
		log.info ("Intializing LoginInterceptor");
		setSecurityManager((SecurityManager) SpringUtil.getBean(Constants.SECURITYMANAGER ));
	}

	public void destroy () {}

	public String intercept (ActionInvocation invocation) throws Exception {
		// Get the action context from the invocation so we can access the
		// HttpServletRequest and HttpSession objects.
		final ActionContext context = invocation.getInvocationContext ();
		HttpServletRequest request = (HttpServletRequest) context.get(HTTP_REQUEST);
		HttpSession session =  request.getSession (true);

		// Is there a "user" object stored in the user's HttpSession?
		Object user = session.getAttribute (Constants.USER_HANDLE);
		if (user == null) {
			// The user has not logged in yet.

			// Is the user attempting to log in right now?
			String loginAttempt = request.getParameter (Constants.LOGIN_ATTEMPT);
			if (! StringUtils.isBlank (loginAttempt) ) { // The user is attempting to log in.

				// Process the user's login attempt.
				if (processLoginAttempt (request, session) ) {
					// The login succeeded send them the login-success page.					
					return invocation.invoke ();
				} else {
					// The login failed. Set an error if we can on the action.
					Object action = invocation.getAction ();
					if (action instanceof com.opensymphony.xwork2.ValidationAware) {
						((com.opensymphony.xwork2.ValidationAware) action).addActionError ("Username or password incorrect.");
					}
				}
			}

			// Either the login attempt failed or the user hasn't tried to login yet, 
			// and we need to send the login form.
			return "login";
		} else {
			return invocation.invoke ();
		}
	}

	/**
	 * Attempt to process the user's login attempt delegating the work to the 
	 * SecurityManager.
	 */
	public boolean processLoginAttempt (HttpServletRequest request, HttpSession session) {
		// Get the username and password submitted by the user from the HttpRequest.
		String username = request.getParameter (Constants.USERNAME);
		String password = request.getParameter (Constants.PASSWORD);

		// Use the security manager to validate the user's username and password.
		Object user = securityManager.login (username, password);

		if (user != null) {
			// The user has successfully logged in. Store their user object in 
			// their HttpSession. Then return true.
			session.setAttribute (Constants.USER_HANDLE, user);
			return true;
		} else {
			// The user did not successfully log in. Return false.
			return false;
		}
	}

	public void setSecurityManager (SecurityManager in) {
		log.debug ("Setting security manager using: " + in.toString () );
		this.securityManager = in;
	}
}
