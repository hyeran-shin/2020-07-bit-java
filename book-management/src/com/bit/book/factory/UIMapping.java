package com.bit.book.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

import com.bit.book.ui.IBookUI;

public class UIMapping {

	private HashMap<String, IBookUI> mapping;
	
	public UIMapping() throws Exception{
		mapping = new HashMap<>();
		
		Properties prop = new Properties();
		InputStream is = new FileInputStream("book_config.properties");
		prop.load(is);
		
		String key="" , className ="";
		
		Enumeration<Object> e = prop.keys();
		while(e.hasMoreElements()) {
			key = (String)e.nextElement();
			className = (String)prop.get(key);
			
//			mapping.put(key,className);
			mapping.put(key,(IBookUI) Class.forName(className).newInstance());
		}
		
		
		
	}


	public IBookUI getUI(String key) {
		return mapping.get(key);
	}

}
