package org.smart4j.framework.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.smart4j.framework.HelperLoader;
import org.smart4j.framework.core.ClassHelper;

/**
 * 从配置文件中取配置值
 * @author guokaikai
 *
 */
public class PropsUtil {
	//根据名字获取配置值
	public static String getString(Properties properties,String propsKey) {
		String value = "";
		if(properties.containsKey(propsKey)) {
			value=properties.getProperty(propsKey);
		}
		return value;
	}
	/**
	 * 加载配置文件
	 * @param propKey:配置文件路径
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
