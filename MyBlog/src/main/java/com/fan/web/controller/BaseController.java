package com.fan.web.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BaseController {
	protected static final int PAGE_LIMIT = 10;
	protected static final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
}
