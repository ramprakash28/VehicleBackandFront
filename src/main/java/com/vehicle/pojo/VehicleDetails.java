package com.vehicle.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicle_Details")
public class VehicleDetails {
	
	
	@Id
	@Column(name="VEHICLE_ID", length=30)
	private String vehicleId;

	@Column(name="EX_SHOWROOM_PRICE", length=20)
	private float exShowroomPrice;

	@Column(name="ON_ROAD_PRICE", length=20)
	private float onRoadPrice;

	@Column(name="VEHICLE_COLOUR", length=20)
	private String vehicleColour;

	@Column(name="VEHICLE_NAME", length=30)
	private String vehicleName;
	
	@Column(name="VEHICLE_MODEL", length=20)
	private String vehicleModel;

	@Column(name="VEHICLE_TYPE", length=20)
	private String vehicleType;

	@Column(name="VEHICLE_YEAR", length=5)
	private long vehicleYear;
	
	
	@OneToOne(mappedBy = "vehicle")
	@JoinColumn(name = "USER_ID",referencedColumnName = "USER_ID")
	private UserLogin user;

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="ACC_NUMBER", referencedColumnName = "ACC_NUMBER")
	private UserAccDetails account;

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public float getExShowroomPrice() {
		return exShowroomPrice;
	}

	public void setExShowroomPrice(float exShowroomPrice) {
		this.exShowroomPrice = exShowroomPrice;
	}

	public float getOnRoadPrice() {
		return onRoadPrice;
	}

	public void setOnRoadPrice(float onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}

	public String getVehicleColour() {
		return vehicleColour;
	}

	public void setVehicleColour(String vehicleColour) {
		this.vehicleColour = vehicleColour;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public long getVehicleYear() {
		return vehicleYear;
	}

	public void setVehicleYear(long vehicleYear) {
		this.vehicleYear = vehicleYear;
	}

	public UserLogin getUser() {
		return user;
	}

	public void setUser(UserLogin user) {
		this.user = user;
	}

	public UserAccDetails getAccount() {
		return account;
	}

	public void setAccount(UserAccDetails account) {
		this.account = account;
	}

	public VehicleDetails(String vehicleId, float exShowroomPrice, float onRoadPrice, String vehicleColour,
			String vehicleName, String vehicleModel, String vehicleType, long vehicleYear, UserLogin user,
			UserAccDetails account) {
		super();
		this.vehicleId = vehicleId;
		this.exShowroomPrice = exShowroomPrice;
		this.onRoadPrice = onRoadPrice;
		this.vehicleColour = vehicleColour;
		this.vehicleName = vehicleName;
		this.vehicleModel = vehicleModel;
		this.vehicleType = vehicleType;
		this.vehicleYear = vehicleYear;
		this.user = user;
		this.account = account;
	}

	public VehicleDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VehicleDetails [vehicleId=" + vehicleId + ", exShowroomPrice=" + exShowroomPrice + ", onRoadPrice="
				+ onRoadPrice + ", vehicleColour=" + vehicleColour + ", vehicleName=" + vehicleName + ", vehicleModel="
				+ vehicleModel + ", vehicleType=" + vehicleType + ", vehicleYear=" + vehicleYear + ", user=" + user
				+ ", account=" + account + "]";
	}
	
	
	
	

}
