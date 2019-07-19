package com.neuedu.chapter02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	
	public static void main(String[] args) {
		
		Map<String, String> m = new HashMap<>();
		//put
		m.put("name", "feiyy");
		m.put("sex", "Female");
		m.put("age", "38");
		
		//if key is duplicated, value will be replaced
		m.put("name", "xx");
		
		System.out.println(m);
		
		//get value by key
		System.out.println(m.get("name"));
		
		//remove key
	    // m.remove("name");
	    //System.out.println(m);
	    
	    //遍历map中的元素
	    //map的遍历有两种方式
	    //way one:
	      //1. get all keys 
	      //2. loop for keys, get value for each key
	    Set<String> keys =  m.keySet();
	    for(String key:keys)
	    {
	    	String value = m.get(key);
	    	System.out.println(key+"\t" +value);
	    }
	    
	    //way two:
	      // get key-value combination
	    Set<Entry<String, String>> entries= m.entrySet();
	    for(Entry<String, String> entry : entries)
	    {
	    	System.out.println(entry.getKey()+"\t"+entry.getValue());
	    }
	    
		
	}

}
