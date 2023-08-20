package conditionalstmtdemofirst;

public class InheritancePractice {
      public static void main(String[] args) {
	
}
}

class Emp{
	int empid;
	String empName;
	String empMobileNo;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
		return "Emp [empid=" + empid + ", empName=" + empName + ", empMobileNo=" + empMobileNo + "]";
	}
	public Emp(int empid, String empName, String empMobileNo) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empMobileNo = empMobileNo;
	}	
	
}









class ContractEmp extends Emp{
	
	double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "ContractEmp [bonus=" + bonus + ", empid=" + empid + ", empName=" + empName + ", empMobileNo="
				+ empMobileNo + "]";
	}

	public ContractEmp(int empid, String empName, String empMobileNo, double bonus) {
		super(empid, empName, empMobileNo);
		this.bonus = bonus;
	}
	
	
	
	
	
	
	
	
	
	
}