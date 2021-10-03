package com.vehicle.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "User_Login_Details")
public class UserLogin {
	
	@Id
	@SequenceGenerator(name = "User_Id_Seq", sequenceName = "User_Id_Seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "User_Id_Seq")
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="USER_EMAIL", length=30)
	private String userEmailId;
	
	@Column(name="USER_NAME_FIRST", length=30)
	private String userFirstName;
	
	@Column(name="USER_NAME_LAST", length=30)
	private String userLastName;
	
	@Column(name="USER_ADDRESS", length=50)
	private String userAddress;
	
	@Column(name="CITY", length=25)
	private String city;
	
	@Column(name="STATE", length=20)
	private String state;
	
	@Column(name="PINCODE", length=20)
	private long pincode;
	
	@Column(name="USER_AGE")
	private int userAge;
	
	@Column(name="USER_GENDER", length=30)
	private String userGender;
	
	@Column(name="USER_PASSWORD", length=30)
	private String userPassword;
	
	//link userAccDetails
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="ACC_NUMBER", referencedColumnName = "ACC_NUMBER")
	private UserAccDetails account;
	
	//link vehicle
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "VEHICLE_ID", referencedColumnName = "VEHICLE_ID")
	private VehicleDetails vehicle;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UserAccDetails getAccount() {
		return account;
	}

	public void setAccount(UserAccDetails account) {
		this.account = account;
	}

	public VehicleDetails getVehicle() {
		return vehicle;
	}

	public void setVehicle(VehicleDetails vehicle) {
		this.vehicle = vehicle;
	}

	public UserLogin(int userId, String userEmailId, String userFirstName, String userLastName, String userAddress,
			String city, String state, long pincode, int userAge, String userGender, String userPassword,
			UserAccDetails account, VehicleDetails vehicle) {
		super();
		this.userId = userId;
		this.userEmailId = userEmailId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userAddress = userAddress;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.userAge = userAge;
		this.userGender = userGender;
		this.userPassword = userPassword;
		this.account = account;
		this.vehicle = vehicle;
	}

	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserLogin [userId=" + userId + ", userEmailId=" + userEmailId + ", userFirstName=" + userFirstName
				+ ", userLastName=" + userLastName + ", userAddress=" + userAddress + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + ", userAge=" + userAge + ", userGender=" + userGender
				+ ", userPassword=" + userPassword + ", account=" + account + ", vehicle=" + vehicle + "]";
	}
	
	
	

}
