package com.chenfu.config;

import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	private String DRIVERMANAGER;
	private String URL;
	private String USERNAME;
	private String PASSWORD;
	
	
	private ReadConfig(){
		
	}
	
	public static ReadConfig getIntance() {
		return ConfigTon.config;
	}
	
	static class ConfigTon {
		public static ReadConfig config = new ReadConfig(); 
	}
	
	
	static {
		
		Properties pro = null;
		
		try {
			pro = new Properties();
			pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
			getIntance().setDRIVERMANAGER(pro.getProperty(ConstantConfig.DRIVERMANAGER));
			getIntance().setURL(pro.getProperty(ConstantConfig.URL));
			getIntance().setUSERNAME(pro.getProperty(ConstantConfig.USERNAME));
			getIntance().setPASSWORD(pro.getProperty(ConstantConfig.PASSWORD));
			
		
		} catch (IOException e) {
			throw new RuntimeException("≈‰÷√Œƒº˛“Ï≥£");
		}
		
	}
	
	
	
	
	public String getDRIVERMANAGER() {
		return DRIVERMANAGER;
	}
	
	
	
	
	
	
	public void setDRIVERMANAGER(String dRIVERMANAGER) {
		DRIVERMANAGER = dRIVERMANAGER;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
}
