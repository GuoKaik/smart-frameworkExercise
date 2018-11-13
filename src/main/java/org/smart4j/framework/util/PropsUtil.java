package org.smart4j.framework.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.smart4j.framework.HelperLoader;
import org.smart4j.framework.core.ClassHelper;

/**
 * �������ļ���ȡ����ֵ
 * @author guokaikai
 *
 */
public class PropsUtil {
	//�������ֻ�ȡ����ֵ
	public static String getString(Properties properties,String propsKey) {
		String value = "";
		if(properties.containsKey(propsKey)) {
			value=properties.getProperty(propsKey);
		}
		return value;
	}
	/**
	 * ���������ļ�
	 * @param propKey:�����ļ�·��
	 * @return
	 */
	public static Properties loadProp(String propKey) {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		InputStream inputStream;
		if(StringUtil.isEmpty(propKey)) {
			throw new IllegalArgumentException();
		}
		String suffix = ".properties";
		if(propKey.indexOf(suffix)<=-1) {
			propKey = propKey+suffix;
		}
		inputStream = ClassUtil.getClassLoad().getResourceAsStream(propKey);
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
}
