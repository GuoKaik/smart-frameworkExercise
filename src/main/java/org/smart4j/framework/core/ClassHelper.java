package org.smart4j.framework.core;

import org.smart4j.framework.InstanceFactory;
import org.smart4j.framework.orm.annotation.Entity;

public class ClassHelper {
	private static final ClassSanner classSanner = InstanceFactory.getClassScaner();
	
	private static final String basePackage = ConfigHelper.getString("smart.framework.app.base_package");
	
	public static void getClassListByAnnotation(Class<Entity> annotation) {
		
		classSanner.getClassListByAnnotation(basePackage,annotation);
	}
	
}
