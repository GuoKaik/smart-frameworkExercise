package org.smart4j.framework.orm;

import org.smart4j.framework.core.ClassHelper;
import org.smart4j.framework.orm.annotation.Entity;

/**
 * ��ʼ��Entity��
 * @author guokaikai
 *
 */
public class EntityHelper {
	static {
		ClassHelper.getClassListByAnnotation(Entity.class);
	}
}
