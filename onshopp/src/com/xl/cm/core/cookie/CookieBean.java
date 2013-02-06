package com.xl.cm.core.cookie;

public class CookieBean {
	
	private String cookieName;	// Name of cookie
	private String cookieValue;         // value of cookie
	private String comment;     // describes cookie's use
	private String domain;      // domain that sees cookie
	private int maxAge = -1;    // cookies auto-expire
	private String path;        // URLs that see the cookie
	private boolean secure;     // use SSLprivate int version = 0;
	public String getCookieName() {
		return cookieName;
	}
	public void setCookieName(String cookieName) {
		this.cookieName = cookieName;
	}
	public String getCookieValue() {
		return cookieValue;
	}
	public void setCookieValue(String cookieValue) {
		this.cookieValue = cookieValue;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isSecure() {
		return secure;
	}
	public void setSecure(boolean secure) {
		this.secure = secure;
	}
	
	
	
}
