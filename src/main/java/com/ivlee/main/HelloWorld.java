package com.ivlee.main;

import org.json.JSONObject;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jsonObj = new JSONObject().put("text", "Hello World");
		System.out.println(jsonObj.toString());
	}

}
