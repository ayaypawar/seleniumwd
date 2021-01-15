package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.configuration.PropertiesConfiguration;

public class Dummy1 
{

	public static void main(String[] args) throws Exception 
	{
		// 1. Change OS built-in properties info
		System.out.println(System.getProperty("user.dir"));//working directory
		System.setProperty("os.name","Mac");
		System.out.println(System.getProperty("os.name"));
		 
		//2.set Environment variable info created by system or user
		 //We can use this below code to add or change environment variables via java
		ProcessBuilder pb=new ProcessBuilder("CMD", "/C", "SET");
		Map<String,String> envMap=pb.environment();//get value of all environment variables
		envMap.put("MYVAR","MyValue");
		//3.Set our properties values in properties file
		PropertiesConfiguration config=new PropertiesConfiguration(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		config.setProperty("url", "http://www.amazon.co.in");
		config.setProperty("maxwait","30");
		config.setProperty("newProperty", "value");
		config.save();
}
}
