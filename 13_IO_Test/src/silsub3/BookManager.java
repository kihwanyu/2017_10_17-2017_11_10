package silsub3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BookManager {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileSave();
		fileOpen();	
	}
	public static void fileSave(){
		Calendar[] cd = new GregorianCalendar[5];
		cd[0] = new GregorianCalendar(2014,5-1,6);
		cd[1] = new GregorianCalendar(2015,2-1,6);
		cd[2] = new GregorianCalendar(2013,4-1,6);
		cd[3] = new GregorianCalendar(2011,11-1,23);
		cd[4] = new GregorianCalendar(2009,4-1,1);
		Book[] book = new Book[5];
		book[0] = new Book("잭과 콩나물", null, 5000, cd[0], 0.5);
		book[1] = new Book("선녀와 나무꾼", null, 5000, cd[1], 0.5);
		book[2] = new Book("피노키오", null, 5000, cd[2], 0.5);
		book[3] = new Book("연금술사", null, 5000, cd[3], 0.5);
		book[4] = new Book("어린왕자", null, 5000, cd[4], 0.5);
		try (ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("books.txt"))){
			for(int i = 0; i < book.length; i++){
				object.writeObject(book[i]);
			}
			object.flush();
			System.out.println("books.da 정보 저장 완료!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void fileOpen(){
		Book[] book = new Book[10];
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("books.txt"))){
			for(int i = 0; i < book.length; i++){
				book[i] = (Book) objIn.readObject();
			}
			
		} catch (EOFException e) {	
			System.out.println("books.da 정보 읽기 완료!");
			for(Book m : book){
				System.out.println(m);
			}		
			//e.printStackTrace();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
