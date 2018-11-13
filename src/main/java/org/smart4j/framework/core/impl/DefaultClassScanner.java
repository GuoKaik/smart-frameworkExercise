package org.smart4j.framework.core.impl;

import java.util.List;

import org.smart4j.framework.core.ClassSanner;
import org.smart4j.framework.orm.annotation.Entity;

public class DefaultClassScanner implements ClassSanner{

	@Override
	public List<Class> getClassListByAnnotation(String basePackage, Class<Entity> annotation) {
		// TODO Auto-generated method stub
		return null;
	}

}
