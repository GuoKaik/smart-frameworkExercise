package org.smart4j.framework;

import java.util.HashMap;
import java.util.Map;

import javax.security.auth.login.Configuration;

import org.apache.commons.lang.ObjectUtils;
import org.smart4j.framework.core.ClassSanner;
import org.smart4j.framework.core.ConfigHelper;
import org.smart4j.framework.core.impl.DefaultClassScanner;
import org.smart4j.framework.util.ObjectUtil;
import org.smart4j.framework.util.StringUtil;

/**
 * 实例工厂
 * @author guokaikai
 *
 */
public class InstanceFactory {
	/**
     * ClassScanner
     */
    private static final String CLASS_SCANNER = "smart.framework.custom.class_scanner";
    
	public static final Map<String,Class> cache = new HashMap<>();
	
	public static ClassSanner getClassScaner() {
		return getIntance(CLASS_SCANNER,DefaultClassScanner.class);
	}
	/**
	 * 获取实例，如果缓存中有，则在缓存中获取，否则则创建
	 * @param cacheKey
	 * @param defaultImplClass
	 */
	private static <T> T getIntance(String cacheKey,Class<?> defaultImplClass) {
		// TODO Auto-generated method stub
		//如果缓存中有，则在缓存中获取
		if(cache.containsKey(cacheKey)) {
			return (T)cache.get(cacheKey);
		}
		//根据配置文件中的配置实例化类，若配置文件中没有配置，则实例化默认类
		String ImplClassName = ConfigHelper.getString(cacheKey);
		if(StringUtil.isEmpty(ImplClassName)) {
			ImplClassName = defaultImplClass.getName();
		}
		T intance = ObjectUtil.newIntance(ImplClassName);
		return intance;
	};
}
