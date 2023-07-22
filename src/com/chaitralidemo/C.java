package com.chaitralidemo;

import java.util.Scanner;

public class C {
       public static void main(String[] args) {
		 student s1=new student();
		 student s2=new student();
		 student s3=new student();
		 
		 s1.setSid(1);
		 s1.setSname("abc");
		 s1.setMark(20);
		 
		 s2.setSid(2);
		 s2.setSname("def");
		 s2.setMark(30);
		 
		 s3.setSid(3);
		 s3.setSname("xyz");
		 s3.setMark(40);
		 
		 System.out.println("s1===="+s1);
		 System.out.println("s2===="+s2);
		 System.out.println("s3===="+s3);
		
		 student s4=new student();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your Id");
		 int id=sc.nextInt();
		 s4.setSid(id);
		 System.out.println("Enter your name");
		 String name=sc.next();
		 s4.setSname(name);
		 System.out.println("Enter your mark");
		 int mark=sc.nextInt();
		 s4.setMark(mark);
		 
		 System.out.println("s4===="+s4);
		 
		 
		 
		 
		 
	}
}
class student{
	int sid;
	String sname;
	int mark;
	
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", mark=" + mark + "]";
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
	
	
	
	
	
}

