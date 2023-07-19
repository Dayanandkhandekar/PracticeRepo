package com.basicdemo;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
		 Student s1=new Student();
		 Student s2=new Student();
		 Student s3=new Student();
		
		 s1.setSid(1);
		 s1.setSname("Abc");
		 s1.setMark(20);
		 
		 s2.setSid(2);
		 s2.setSname("pqr");
		 s2.setMark(30);
		 
		 
		 s3.setSid(3);
		 s3.setSname("xyz");
		 s3.setMark(50);
		 
		 System.out.println("s1====="+s1);
		 System.out.println("s2====="+s2);
		 System.out.println("s3====="+s3);
		 
		 Student s4=new Student();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter ur Id");//4
		 int id=sc.nextInt();
		 s4.setSid(id);
		 System.out.println("Enter ur name");// pp
		 String name=sc.next();
		 s4.setSname(name);
		 System.out.println("Enter ur mark");
		 int mark=sc.nextInt();
		 s4.setMark(mark);
		 
		 System.out.println("s4===="+s4);
		 
		 Student s5=new Student(5, "mm", 40);
		 Student s6=new Student(6, "mmm", 40);
		 
	}
}

class Student{
	int sid;
	String sname;
	int mark;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", mark=" + mark + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	/**
	 * @param sid
	 * @param sname
	 * @param mark
	 */
	public Student(int sid, String sname, int mark) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.mark = mark;
	}
	
	
	public Student() {
		
	}
	

	
}


// How to assign value to the obejct in java
// 1.Useing setter method
// 2.Useing Constructor

// Type of Constructor  ---3
// a.default constructor----No parameter--- added by jvm
//b. No arg constructor--- No parameter--- added by user
//c.parameter constrcutor--- parameter---added by user
