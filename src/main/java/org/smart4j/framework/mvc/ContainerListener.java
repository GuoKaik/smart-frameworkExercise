package org.smart4j.framework.mvc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.smart4j.framework.HelperLoader;

@WebListener 
public class ContainerListener implements ServletContextListener {
	/**
	 * 容器初始化时加载
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		HelperLoader.init();
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
