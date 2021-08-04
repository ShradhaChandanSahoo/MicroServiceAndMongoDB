package com.shradha.mongo.util;

import java.util.UUID;

public interface GenerateId {
	
	public static String createId() {
		return "OD"+UUID.randomUUID().toString()
				.replaceAll("-", "")
				.substring(0, 10);
	}

}
