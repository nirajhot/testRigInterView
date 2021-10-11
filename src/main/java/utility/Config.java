package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

	Properties pro;
	FileInputStream fis;
	public Config(){
		File src=new File("./Configruation/config.properties");
		try {
			fis	=new FileInputStream(src);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		pro=new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getURL(){
		String applicationURL=pro.getProperty("URL");
		return applicationURL;
	}
	
	public String getLPT(){
		String ltp=pro.getProperty("landinPageTitle");
		return ltp;
	}
	
	public String getQTP(){
		String qtp=pro.getProperty("questionPageTitle");
		return qtp;
	}
	
	public String getTPT(){
		String tpt=pro.getProperty("tagPageTitle");
		return tpt;
	}
}