package com.oopsconeptdemo;

public class InheritanceDemo {
  public static void main(String[] args) {
	
}
}

class Emp {
	int empId;
	String empName;
	String empMobileNo;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpMobileNo() {
		return empMobileNo;
	}
	public void setEmpMobileNo(String empMobileNo) {
		this.empMobileNo = empMobileNo;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empMobileNo=" + empMobileNo + "]";
	}
	/**
	 * @param empId
	 * @param empName
	 * @param empMobileNo
	 */
	public Emp(int empId, String empName, String empMobileNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMobileNo = empMobileNo;
	}
	
	
	
	
}

class CEmp extends Emp{
	
	double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "CEmp [bonus=" + bonus + ", empId=" + empId + ", empName=" + empName + ", empMobileNo=" + empMobileNo
				+ "]";
	}

	/**
	 * @param empId
	 * @param empName
	 * @param empMobileNo
	 * @param bonus
	 */
	public CEmp(int empId, String empName, String empMobileNo, double bonus) {
		super(empId, empName, empMobileNo);
		this.bonus = bonus;
	}
	
	
}
