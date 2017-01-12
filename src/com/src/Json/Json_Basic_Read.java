package com.src.Json;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONObject;
//import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json_Basic_Read {
public static void main(String[] args){
	JSONParser parser=new JSONParser();
	try{
		Object obj=parser.parse(new FileReader("src/Json/test1.json"));
		JSONObject jsonObject = (JSONObject) obj;
		String name=(String) jsonObject.get("name");
		System.out.println("Name:"+name);
		
		String author=(String) jsonObject.get("Author");
		System.out.println("Author:"+author);
		
		System.out.println("\nCompanyList:");
		org.json.simple.JSONArray companyList=(org.json.simple.JSONArray) jsonObject.get("CompanyList");
		
		Iterator<String> iterator= companyList.iterator();
		while(iterator.hasNext()){
		
			System.out.println(iterator.next());
		}

       /* for(Object o: companyList){
            System.out.println(o);
        }*/
	}
	catch(Exception e){e.printStackTrace();}
	
	
}
}
