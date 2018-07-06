package com.chenfu.xml;

import java.io.*;   
import java.util.*;   

import org.dom4j.*;   
import org.dom4j.io.*; 

public class ReadXML {

	public static Map getXML(){
		
		Map<String, String> map = new HashMap<>();          
		
		try {
			 File f = new File("data_10k.xml");   
			 SAXReader reader = new SAXReader();   
			 Document doc = reader.read(f);   
			 Element root = doc.getRootElement();   
			 Element foo;  
			 String key = null;
			 String value = null;
		     for (Iterator iter = root.elementIterator("ITEM"); iter.hasNext();) {   
		        foo = (Element) iter.next();   
		        key = foo.elementText("KEY");
		        value = foo.elementText("VALUE");
		        map.put(key, value);
		     }  
		} catch (DocumentException e) {
			e.printStackTrace();
		}   
		return map;
	}
}
