package com.src.Json;

import java.io.FileWriter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json_Basic_Write{

	public static void main(String[] args) throws JSONException{
		JSONObject obj=new JSONObject();
		obj.put("name","Sharath");
		obj.put("Occupation","SE");
		obj.put("Contact",new Integer(123456798));
		obj.put("Email","Sharath.prakash1992@gmail.com");
		/*
		JSONArray list=new JSONArray();
		
		list.add("msg1");
		list.add("msg2");
		list.add("msg3");
		
		
		obj.put("message",list);*/
		try{
			FileWriter file=new FileWriter("src/Json/test.json");
			file.write(obj.toString());
			file.flush();
			file.close();
			
			
			
		}
		catch(Exception e){e.printStackTrace();}
		System.out.println(obj);
		System.out.println("Copied");
		
	}
	

}
