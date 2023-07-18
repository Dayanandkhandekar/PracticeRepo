package com.sonalidemo;

import java.util.Scanner;

public class B {
public static void main(String[] args, String sdf) {
	employee e1=new employee();
	employee e2=new employee();
	
	e1.setEid1(1);
	e1.setEname("sdf");
	
	 e2.setEid1(2);
	 e2.setEname("pqr");
	 
	 
	System.out.println("e1===="+e1);
	System.out.println("e2===="+e2);
	
	 employee e3=new employee();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter ur Id");//5
	 int id=sc.nextInt();
	 e3.setSid(id);
	 System.out.println("Enter ur name");// ss
	 String name=sc.next();
	 
	
}

@Override
public String toString() {
	return "B [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
}
class employee{
	int eid1;
	String ename;
	int eid;
	public int getEid1() {
		return eid1;
		
	}
	public void setSid(int id) {
		// TODO Auto-generated method stub
		
	}
	public void setEid1(int eid1) {
		this.eid1 = eid1;
	}
	public String getEname() {
		return ename;
	}
		
	public void setEname(String ename) {
		this.ename = ename;
}
		
}
		
		
		
		
		