package basicconcepts;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(".//credentials.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println(username+"\n"+password);
		fis.close();
		
	}

}
