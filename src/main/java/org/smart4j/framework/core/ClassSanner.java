package org.smart4j.framework.core;

import java.util.List;

import org.smart4j.framework.orm.annotation.Entity;

public interface ClassSanner {
	/**
	 * ����ע���ȡ��
	 * @param basepackage 
	 * @param annotation 
	 * @return
	 */
	List<Class> getClassListByAnnotation(String basepackage, Class<Entity> annotation);

}
