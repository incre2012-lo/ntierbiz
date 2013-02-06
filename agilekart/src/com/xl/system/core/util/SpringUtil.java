package com.xl.system.core.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class SpringUtil {

	private ApplicationContext ctx=null;

	private static SpringUtil instance = null;

	public static Object getBean(String name) throws RuntimeException {

		if (instance == null) {
			instance = new SpringUtil();
		}

		try {
			Object o = instance.getApplicationContext().getBean(name);
			return o;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	private ApplicationContext getApplicationContext() {
		if (ctx == null) {
		    ctx=new ClassPathXmlApplicationContext("spring-master.xml");
			
		}		
		return ctx;
	}

}
