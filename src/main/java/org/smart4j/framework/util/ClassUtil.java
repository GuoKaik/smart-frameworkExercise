package org.smart4j.framework.util;

public class ClassUtil {
	/**
	 * 获取类加载器
	 * @return
	 */
	public static ClassLoader getClassLoad() {
		return Thread.currentThread().getContextClassLoader();
		
	}
	/**
	 * 加载类
	 * @param className
	 * @return
	 */
	public static Class<?> loadClass(String className) {
		return loadClass(className,true);
	}
	/**
	 * 加载类并调用类中的static代码块
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
