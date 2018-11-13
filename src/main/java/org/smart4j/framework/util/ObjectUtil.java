package org.smart4j.framework.util;

public class ObjectUtil {
	/**
	 * 根据类名获取对象实例
	 * @param ClassName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T newIntance(String ClassName) {
		// TODO Auto-generated method stub
		T intance = null;
		try {
			Class<?> commandClass = ClassUtil.loadClass(ClassName);
			 intance =  (T)commandClass.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return intance;
	}	
}
