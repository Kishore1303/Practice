package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		//Data driven testing
		//Get the java representation object of physical using FileInputStream
		FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
		Properties file=new Properties();
		file.load(fis);
		System.out.println("user name : "+file.getProperty("username"));
		System.out.println("browser : "+file.getProperty("browser"));
		System.out.println("url : "+file.getProperty("url"));
		System.out.println("Password : "+file.getProperty("password"));
	}
}
