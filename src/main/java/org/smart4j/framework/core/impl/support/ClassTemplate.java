package org.smart4j.framework.core.impl.support;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;

import org.smart4j.framework.util.ClassUtil;

public class ClassTemplate {
	protected String packageName;
	public ClassTemplate(String packageName) {
		this.packageName=packageName;
	}
	public List<Class> getClassList(){
		List<Class> classList;
		try {
			Enumeration urls = ClassUtil.getClassLoad().getResources(packageName.replace(".", "/"));
			while (urls.hasMoreElements()) {
				URL url = (URL) urls.nextElement();
				String urlProt = url.getProtocol();
				if(urlProt.indexOf("file") == 1) {
					addClass();
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	private void addClass() {
		// TODO Auto-generated method stub
		
	} 
}
