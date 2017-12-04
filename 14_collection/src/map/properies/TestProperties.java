package map.properies;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		
		//���� ������ ���� �о ���ø����̼ǿ� ������ �� ����Ѵ�.
		
		Properties prop = new Properties();

		prop.setProperty("driver", "orale.jdbc.driver.OracleDriver");
		
		prop.setProperty("url", "jdbc.oracle.thin:@127.0.0.1:1521:xe");
		
		prop.getProperty("user","student");
		
		prop.setProperty("password", "student");
		
		System.out.println(prop);
	
		try {
			prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
			prop.store(new FileOutputStream("driver1.txt"), "jdbc driver");
			prop.store(new FileWriter("driver.txt"), "jdbc driver");
			
			prop.storeToXML(new FileOutputStream("dirver.xml"), "hello boy");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
