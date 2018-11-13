package org.smart4j.framework;

import org.smart4j.framework.orm.EntityHelper;
import org.smart4j.framework.util.ClassUtil;

public class HelperLoader {
	public static void init() {
		Class [] classList = {
			EntityHelper.class	
		};
		for(Class cls:classList) {
			ClassUtil.loadClass(cls.getName());
		}
	}
}
