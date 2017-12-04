package map.properies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperies2 {

	public static void main(String[] args) {
		//파일로부터 읽어와서 properties에 기록
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("driver.dat"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("driver"));
			prop.load(new FileReader("driver.txt"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("driver"));
			prop.loadFromXML(new FileInputStream("driver.xml"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("driver"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
