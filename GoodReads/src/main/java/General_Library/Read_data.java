package General_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_data {

	public static String UserCredentilas(String Key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/LoginCredetials.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(Key);
		return value;

	}
}
