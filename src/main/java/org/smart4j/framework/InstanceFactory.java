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
 * ʵ������
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
	 * ��ȡʵ��������������У����ڻ����л�ȡ�������򴴽�
	 * @param cacheKey
	 * @param defaultImplClass
	 */
	private static <T> T getIntance(String cacheKey,Class<?> defaultImplClass) {
		// TODO Auto-generated method stub
		//����������У����ڻ����л�ȡ
		if(cache.containsKey(cacheKey)) {
			return (T)cache.get(cacheKey);
		}
		//���������ļ��е�����ʵ�����࣬�������ļ���û�����ã���ʵ����Ĭ����
		String ImplClassName = ConfigHelper.getString(cacheKey);
		if(StringUtil.isEmpty(ImplClassName)) {
			ImplClassName = defaultImplClass.getName();
		}
		T intance = ObjectUtil.newIntance(ImplClassName);
		return intance;
	};
}
