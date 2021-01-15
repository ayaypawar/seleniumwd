package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Dummy2 
{

	public static void main(String[] args) throws Exception 
	{
		// Get OS properties(System properties) info//12-12-2020
		System.out.println(System.getProperty("user.dir"));    //working directory
		System.out.println(System.getProperty("os.name"));     //operating system name
		//2.Get Environment variable info at system or user
		System.out.println(System.getenv("JAVA_HOME"));//Get value of an environment variable
		ProcessBuilder pb=new ProcessBuilder();
		Map<String,String> envMap=pb.environment();//get value of all environment variables
		for(Map.Entry<String, String> e:envMap.entrySet())
		{
			System.out.println(e.getKey()+"<==>"+e.getValue());
		}
		//3.Get properties info in our properties file
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		FileInputStream fi=new FileInputStream(f);//get read permission and shift to RAM
		Properties p=new Properties();
		p.load(fi);
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("maxwait"));
		System.out.println(p.getProperty("uri"));
	}

}
