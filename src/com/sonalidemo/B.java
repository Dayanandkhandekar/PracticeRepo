package com.sonalidemo;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		student s1=new student();
		student s2=new student();
		student s3=new student();
		
	
		s1.setSid(1);
		s1.setSname("dfg");
		s1.setMark(40);
		
		s2.setSid(2);
		s2.setSname("tyu");
		s2.setMark(70);
		
		s3.setSid(3);
		s3.setSname("asd");
		s3.setMark(90);
		
		
		System.out.println("s1===="+s1);
		System.out.println("s2===="+s2);
		System.out.println("s3===="+s3);
		
		student s4= new student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur id");//5
		int id=sc.nextInt();
		s4.setSid(id);
		System.out.println("enter ur name");//hh
		String name=sc.next();
		s4.setSname(name);
		System.out.println("enter ur mark");
		int mark=sc.nextInt();
		s4.setMark(mark);
		
		
		
		
		
		System.out.println("s4===="+s4);
		
		student s5=new student(3,"yy",30);
		student s6=new student(5,"ss",80);
		
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


	public String next() {
		// TODO Auto-generated method stub
		return null;
	}


	public int nextInt() {
		// TODO Auto-generated method stub
		return 0;
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
	
	public student(int i, String string, int j) {
	}


	public student() {
		// TODO Auto-generated constructor stub
	}
	}
