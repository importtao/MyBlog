package com.fan.util;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONUtil {
	public static final String KEY_ERROR = "error";
	public static final String KEY_MESSAGE = "message";
	public static final String KEY_RESULT = "result";
	public static final String KEY_DATAS = "datas";
	public static final String KEY_DATA = "data";
	
	public static final String JSON_EMPTY = "{}";
	
	private static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	
	public static String createJson(String key, Object value) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(key, value);
		return gson.toJson(map);
	}
}
