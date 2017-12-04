package practice4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class TestProperties {
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		//txt ���Ϸ� ����
		roadFile();
		
		//txt �����о����
		list = readFile(list);
		//XML ���Ϸ� ����
		saveXMLFile(list);
		//XML ���� �о����
		//list = readXMLFile(list);
		
		//list ���
		for(int i = 0 ;i < list.size(); i++){
			System.out.println(list.get(i).toString());
		}
		
	}
	public static void roadFile(){
		
		HashMap<String, Student> map = new HashMap<>();
		Properties prop = new Properties();
		
		map.put("0", new Student(1, "HongGilDong", 60, 70, 80, 0, 0));
		map.put("1", new Student(2, "LeeSunSin", 100, 50, 90, 0, 0));
		map.put("2", new Student(3, "HangJinLee", 100, 40, 50, 0, 0));
		map.put("3", new Student(4, "KimYuSin", 40, 70, 20, 0, 0));
		map.put("4", new Student(5, "WANGGUN", 70, 90, 100, 0, 0));
		
		Set<String> keys = map.keySet();
		Iterator<String> stIter = keys.iterator();
		
		
		try {
			while(stIter.hasNext()){
				String key = stIter.next();
				prop.setProperty(key, map.get(key).toString());
				System.out.println(map.get(key).toString());
			}
			
			prop.store(new FileOutputStream("score.txt"),"comment");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static ArrayList<Student> readFile(ArrayList<Student> list){
		Properties prop = new Properties();
		
		Student[] st = new Student[4];
		
		int count = 0;
		
		try {
			prop.load(new FileInputStream("score.txt"));
			for(int i = 0 ; i < st.length; i++){
				String str;
				
					String[] str_arr = new String[7];
					//System.out.println(prop.getProperty(String.valueOf(i).toString()));
					str = prop.getProperty(String.valueOf(i).toString());
					//System.out.println(str);
					str_arr = str.split(", ");
					/*for(String s : str_arr){
						System.out.println(s);
					}*/
					st[count] = new Student();
					st[count].setSno(Integer.parseInt(str_arr[0]));
					st[count].setSname(str_arr[1]);
					st[count].setKor(Integer.parseInt(str_arr[2]));
					st[count].setEng(Integer.parseInt(str_arr[3]));
					st[count].setMat(Integer.parseInt(str_arr[4]));
					st[count].setTot(Integer.parseInt(str_arr[5]));
					st[count].setAvg(Integer.parseInt(str_arr[6]));		
					
					//System.out.println("st["+i+"] : "+st[count]);
					list.add(st[count]);
					count++;
					
					for(int j = 0 ; j < list.size(); j++){
						list.get(j).setTot(list.get(j).getKor()+list.get(j).getEng()+list.get(j).getMat());
						list.get(j).setAvg(list.get(j).getTot()/3);
						
						//System.out.println(list.get(j).getTot()+", "+list.get(j).getAvg());
						//System.out.println(list.get(j).toString());
					}
					
				}	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public static ArrayList<Student> readXMLFile(ArrayList<Student> list){
		Properties prop = new Properties();
		
		Student[] st = new Student[4];
		
		int count = 0;
		
		try {
			prop.loadFromXML(new FileInputStream("student.xml"));
			for(int i = 1 ; i <= st.length; i++){
				String str;
				
					String[] str_arr = new String[7];
					
					//System.out.println(prop.getProperty(String.valueOf(i).toString()));
					str = prop.getProperty(String.valueOf(i).toString());
					//System.out.println(str);
					str_arr = str.split(", ");
					/*for(String s : str_arr){
						System.out.println(s);
					}*/
					st[count] = new Student();
					st[count].setSno(Integer.parseInt(str_arr[0]));
					st[count].setSname(str_arr[1]);
					st[count].setKor(Integer.parseInt(str_arr[2]));
					st[count].setEng(Integer.parseInt(str_arr[3]));
					st[count].setMat(Integer.parseInt(str_arr[4]));
					st[count].setTot(Integer.parseInt(str_arr[5]));
					st[count].setAvg(Integer.parseInt(str_arr[6]));		
					
					//System.out.println("st["+i+"] : "+st[count]);
					list.add(st[count]);
					count++;
					
					
					for(int j = 0 ; j < list.size(); j++){
						list.get(j).setTot(list.get(j).getKor()+list.get(j).getEng()+list.get(j).getMat());
						list.get(j).setAvg(list.get(j).getTot()/3);
						
						//System.out.println(list.get(j).getTot()+", "+list.get(j).getAvg());
					}
					
				}	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//���� ����
	/*	1. Properties ��ü �����ϰ�, score.txt ������ ������ �о�
		2. ����Ʈ ����
		3. Ű�� ����Ͽ�, ��ü������ Student[] �� �����Ͽ� ������
		  => ", " ���� ���ڿ� �и�ó��
		  => �и��� ���ڿ��� �� �ڷ��� �ʵ��� ������ ����ȯ ���� ������
		  => �� ������ �հ�� ����� ���ؼ� �� �ʵ忡 �����*/
	public void printConsole(ArrayList<Student> list){
		int korSum = 0;
		int korAvg = 0;
		int engSum = 0;
		int engAvg = 0;
		int matSum = 0;
		int matAvg = 0;
		for(int i = 0; i < list.size(); i++){
			korSum+=list.get(i).getKor();
			engSum+=list.get(i).getEng();
			matSum+=list.get(i).getMat();
		}
		korAvg = korSum/list.size();
		engAvg = engSum/list.size();
		matAvg = matSum/list.size();
		
		System.out.println("���������� ��� : " + korAvg);
		System.out.println("���������� ��� : " + engAvg);
		System.out.println("���������� ��� : " + matAvg);
		
	}
	/*1. ���޹��� �� ���
	2. �� ��ü�� �����հ�, �����հ�, �����հ踦 ���ϰ�
	3. ���� ��������� �����*/
	public static void saveXMLFile(ArrayList<Student> list){
		Properties prop = new Properties();
		
		try {
			for(int i = 0; i < list.size(); i++){
				prop.setProperty(String.valueOf(list.get(i).getSno()).toString(), list.get(i).toString());
			}
			
			prop.storeToXML(new FileOutputStream("student1.xml"), String.valueOf(new Date()).toString());
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*1. "student.xml" ���Ͽ� ��ȣ�ʵ带 key�� ��ü�� ���� �� ��� ������.*/
}
