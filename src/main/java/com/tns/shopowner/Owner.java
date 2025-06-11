package com.tns.shopowner;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Owner 
{
	@Id
	@Column(name="ownerid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ownerid;
	
	@Column(name="ownername")
	private String ownername;
	
	@Column(name="address")
	private String address;

	public int getownerid() {
		return ownerid;
	}
	public void setownerid(int ownerid) {
		this.ownerid = ownerid;
	}
	public String getownername() {
		return ownername;
	}
	public void setownername(String ownername) {
		this.ownername = ownername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Owner(int ownerid, String ownnername, String address) {
		super();
		this.ownerid = ownerid;
		this.ownername = ownername;
		this.address = address;
	}
	@Override
	public String toString() {
		return "owner [ownerid=" + ownerid + ", ownername=" + ownername + ", address=" + address + "]";
	}
	
}
	


