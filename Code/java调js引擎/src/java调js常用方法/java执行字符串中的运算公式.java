package java调js常用方法;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class java执行字符串中的运算公式 {

	 static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");  
	  
	    /** 
	     * @param args 
	     */  
	    public static void main(String[] args) {  
	        String strs = "1+1*2+(10-(2*(5-3)*(2-1))-4)+10/(5-0)";  
	        try {  
	            System.out.println(jse.eval(strs));  
	        } catch (Exception t) {  
	        }  
	    } 
}
