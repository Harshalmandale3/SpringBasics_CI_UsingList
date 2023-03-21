package main;

import java.util.List;

public class Student {
	
	private int roll;
	private String name;
	private List<String> subject;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, List<String> subject) {
		super();
		this.roll = roll;
		this.name = name;
		this.subject = subject;
	}
	
	

	public Student(String name, List<String> subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
	
	
	
	
	
}
