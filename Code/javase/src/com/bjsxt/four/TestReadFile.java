package com.bjsxt.four;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile {

	//看层次结构快捷键ctr + t
	public static void main(String[] args) {
		FileReader reader = null;
		
		try{
			reader = new FileReader("D:/a.txt");
			
			char c = (char)reader.read();
			char c2 = (char)reader.read();
			
			System.out.println("" + c + c2);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(reader != null){
				try {
					if(reader != null)	reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		File file = new File("d:/a.txt");
		
		if(!file.exists()){
			try {
				throw new FileNotFoundException("没有找到");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
