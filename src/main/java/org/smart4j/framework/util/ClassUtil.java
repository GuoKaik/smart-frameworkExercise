package org.smart4j.framework.util;

public class ClassUtil {
	/**
	 * ��ȡ�������
	 * @return
	 */
	public static ClassLoader getClassLoad() {
		return Thread.currentThread().getContextClassLoader();
		
	}
	/**
	 * ������
	 * @param className
	 * @return
	 */
	public static Class<?> loadClass(String className) {
		return loadClass(className,true);
	}
	/**
	 * �����ಢ�������е�static�����
	 * @param className
	 * @param initialize
	 * @return Class
	 */
	public static Class<?> loadClass (String className,boolean initialize) {
		Class<?> cls = null;
		try {
			cls = Class.forName(className, true, getClassLoad());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return cls;
	}
}
