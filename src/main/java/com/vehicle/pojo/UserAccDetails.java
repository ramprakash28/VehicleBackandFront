package com.vehicle.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User_Account_Details")
public class UserAccDetails {
	
	@Id
	@Column(name="ACC_NUMBER", length=30)
	private String accNo;
	
	@Column(name="ACC_BANK_NAME", length=30)
	private String bankName;
	
	@Column(name="ACC_IFSC", length=30)
	private String accIFSC;
	
	@Column(name="ACC_TYPE", length=30)
	private String accType;
	
	@Column(name="USER_EMPLOYMENT_TYPE", length=30)
	private String userEmpType;
	
	@Column(name="MONTHLY_SALARY")
	private String monthlySalary;
	
	@Column(name="EXISITING_EMI")
	private boolean existingEMI;
	
	//one to one mapping with Loan table
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
	private Loan loan;
	
	//one to one mapping with userLogin table
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
	private UserLogin user;
	
	
	//one to one mapping with vehicle table
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
	private VehicleDetails vehicle;
	
	//one to one mapping 
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "userAccDetails")
//	private AdminLogin admin;

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccIFSC() {
		return accIFSC;
	}

	public void setAccIFSC(String accIFSC) {
		this.accIFSC = accIFSC;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getUserEmpType() {
		return userEmpType;
	}

	public void setUserEmpType(String userEmpType) {
		this.userEmpType = userEmpType;
	}

	public String getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(String monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public boolean isExistingEMI() {
		return existingEMI;
	}

	public void setExistingEMI(boolean existingEMI) {
		this.existingEMI = existingEMI;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public UserLogin getUser() {
		return user;
	}

	public void setUser(UserLogin user) {
		this.user = user;
	}

	public VehicleDetails getVehicle() {
		return vehicle;
	}

	public void setVehicle(VehicleDetails vehicle) {
		this.vehicle = vehicle;
	}

	public UserAccDetails(String accNo, String bankName, String accIFSC, String accType, String userEmpType,
			String monthlySalary, boolean existingEMI, Loan loan, UserLogin user, VehicleDetails vehicle,
			AdminLogin admin) {
		super();
		this.accNo = accNo;
		this.bankName = bankName;
		this.accIFSC = accIFSC;
		this.accType = accType;
		this.userEmpType = userEmpType;
		this.monthlySalary = monthlySalary;
		this.existingEMI = existingEMI;
		this.loan = loan;
		this.user = user;
		this.vehicle = vehicle;
		
	}

	public UserAccDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserAccDetails [accNo=" + accNo + ", bankName=" + bankName + ", accIFSC=" + accIFSC + ", accType="
				+ accType + ", userEmpType=" + userEmpType + ", monthlySalary=" + monthlySalary + ", existingEMI="
				+ existingEMI + ", loan=" + loan + ", user=" + user + ", vehicle=" + vehicle + "]";
	}
	
	
	
	

}
