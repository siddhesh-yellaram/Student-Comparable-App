package com.techlab.model;

public class Student{
	private int id;
	private String name;
	private String division;
	private double cgpa;

	public Student(int id, String name, String division, double cgpa) {
		this.id = id;
		this.name = name;
		this.division = division;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStandard() {
		return division;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return " Student Id: " + id + ", Name: " + name + ", Std.:" + division + ", CGPA: " + cgpa + "\n";
	}
}

