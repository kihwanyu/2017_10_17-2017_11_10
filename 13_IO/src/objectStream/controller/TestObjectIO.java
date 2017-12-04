package objectStream.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import objectStream.medel.vo.Member;

public class TestObjectIO  {
	public static void fileSave() {
		Member[] mar = new Member[10];
		mar[0] = new Member("userId1", "userPwd1", "userName1", "email1", 20, '³²', 1250.7);
		mar[1] = new Member("userId2", "userPwd2", "userName2", "email2", 25, '¿©', 1550.7);
		mar[2] = new Member("userId3", "userPwd3", "userName3", "email3", 30, '³²', 1750.7);
		
		try (ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("member.txt"))){
			for(int i = 0; i < mar.length; i++){
				object.writeObject(mar[i]);
			}
			object.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void fileOpen(){
		Member[] mar = new Member[3];
		
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("member.txt"))){
			for(int i = 0; i < mar.length; i++){
				mar[i] = (Member) objIn.readObject();
			}
			for(Member m : mar){
				System.out.println(m);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileSave();
		fileOpen();
	}
}
