package org.smart4j.framework.mvc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.smart4j.framework.HelperLoader;

@WebListener 
public class ContainerListener implements ServletContextListener {
	/**
	 * ������ʼ��ʱ����
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
