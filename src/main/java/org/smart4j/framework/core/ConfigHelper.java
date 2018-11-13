package org.smart4j.framework.core;

import java.util.Properties;

import org.smart4j.framework.FrameworkConstant;
import org.smart4j.framework.util.PropsUtil;

public class ConfigHelper {
	private static Properties properties = PropsUtil.loadProp(FrameworkConstant.CONFIG_PROPS);
	public static String getString(String ConfigKey) {
		return PropsUtil.getString(properties, ConfigKey);
	}
	
}
