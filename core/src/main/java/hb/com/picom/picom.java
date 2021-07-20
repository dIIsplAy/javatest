package hb.com.picom;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class picom {

	public static void testEnv(String[] args)throws Exception {
		// TODO Auto-generated method stub
	InputStream aIn = picom.class.getResourceAsStream("/env/app.env");
	Properties env = new Properties();
	
	env.load(aIn);
	
	String aBasePath = env.getProperty("basepath");
	System.out.println("basepath=" + aBasePath);
		
		
	
	}
	public static void main(String[] args) throws Exception {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test"+"user:root&password=");
	}

}
