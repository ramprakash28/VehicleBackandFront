package com.vehicle.pojo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Loan_Details")
public class Loan 
{
	
	@Id
	@Column(name="LOAN_ID")
	private long loanId;

	@Column(name="APPLICATION_STATUS", length=30)
	private String applicationStatus;

	@Column(name="EMI")
	private float emi;

	@Column(name="INTEREST_RATE")
	private float interestRate;

	@Column(name="LOAN_AMOUNT")
	private float loanAmount;

	
	@Column(name="LOAN_END_DATE")
	private Date loanEndDate;

	
	@Column(name="LOAN_START_DATE")
	private Date loanStartDate;

	@Column(name="LOAN_STATUS", length=30)
	private String loanStatus;

	@Column(name="PROCESSING_FEE")
	private float processingFee;
	
	@Column(name="TENURE")
	private float tenure;

	@Column(name="LOAN_TYPE", length=30)
	private String loantype;
	
	@Column(name="USER_ID")
	private long user_id;

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="VEHICLE_ID", referencedColumnName = "VEHICLE_ID")
	private VehicleDetails vehicle;
	
	
//	@OneToOne
//	@JoinColumn(name="ACC_NUMBER")
//	private UserAccDetails account;

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ACC_NUMBER",referencedColumnName = "ACC_NUMBER")
	 private UserAccDetails account;


	public long getLoanId() {
		return loanId;
	}


	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}


	public String getApplicationStatus() {
		return applicationStatus;
	}


	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}


	public float getEmi() {
		return emi;
	}


	public void setEmi(float emi) {
		this.emi = emi;
	}


	public float getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}


	public float getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}


	public Date getLoanEndDate() {
		return loanEndDate;
	}


	public void setLoanEndDate(Date loanEndDate) {
		this.loanEndDate = loanEndDate;
	}


	public Date getLoanStartDate() {
		return loanStartDate;
	}


	public void setLoanStartDate(Date loanStartDate) {
		this.loanStartDate = loanStartDate;
	}


	public String getLoanStatus() {
		return loanStatus;
	}


	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}


	public float getProcessingFee() {
		return processingFee;
	}


	public void setProcessingFee(float processingFee) {
		this.processingFee = processingFee;
	}


	public float getTenure() {
		return tenure;
	}


	public void setTenure(float tenure) {
		this.tenure = tenure;
	}


	public String getLoantype() {
		return loantype;
	}


	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}


	public long getUser_id() {
		return user_id;
	}


	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}


	public VehicleDetails getVehicle() {
		return vehicle;
	}


	public void setVehicle(VehicleDetails vehicle) {
		this.vehicle = vehicle;
	}


	public UserAccDetails getAccount() {
		return account;
	}


	public void setAccount(UserAccDetails account) {
		this.account = account;
	}


	public Loan(long loanId, String applicationStatus, float emi, float interestRate, float loanAmount,
			Date loanEndDate, Date loanStartDate, String loanStatus, float processingFee, float tenure, String loantype,
			long user_id, VehicleDetails vehicle, UserAccDetails account) {
		super();
		this.loanId = loanId;
		this.applicationStatus = applicationStatus;
		this.emi = emi;
		this.interestRate = interestRate;
		this.loanAmount = loanAmount;
		this.loanEndDate = loanEndDate;
		this.loanStartDate = loanStartDate;
		this.loanStatus = loanStatus;
		this.processingFee = processingFee;
		this.tenure = tenure;
		this.loantype = loantype;
		this.user_id = user_id;
		this.vehicle = vehicle;
		this.account = account;
	}
	
	
	

	
	
}
