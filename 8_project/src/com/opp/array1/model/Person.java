package com.opp.array1.model;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	private char gender;
	private String birthDay;
	public Person(){
		
	}
	public Person(String name, int age, double height, double weight, char gender, String birthDay) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", gender="
				+ gender + ", birthDay=" + birthDay + "]";
	}
}
