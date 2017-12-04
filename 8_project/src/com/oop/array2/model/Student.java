package com.oop.array2.model;

public class Student {
	private String name;
	private int grade;
	private int classRoom;
	private int kor;
	private int eng;
	private int mat;

	public Student() {
		super();
	}
	public Student(String name, int grade, int classRoom, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.grade = grade;
		this.classRoom = classRoom;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		return " [�̸� : " + name + ", �г� : " + grade + ", �� : " + classRoom + ", �������� : " + kor + ", �������� : "
				+ eng + ", �������� : " + mat + "]";
	}
	
	
}
