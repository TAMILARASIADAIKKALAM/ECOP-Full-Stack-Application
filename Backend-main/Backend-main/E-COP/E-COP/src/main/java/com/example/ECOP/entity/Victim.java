package com.example.ECOP.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Complient_Registration")
public class Victim {

	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	@Column(name="NAME")
	String name;
	@Column(name="GENDER")
	String gender;
	@Column(name="ADDRESS")
	String address;
	@Column(name="AGE")
	String age;
	@Column(name="MOBILE")
	long mobile;
	@Column(name="COMPLAINT")
	String complaint;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	public Victim() {}
	public Victim(int id, String name, String gender, String address, String age, long mobile, String complaint) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
		this.mobile = mobile;
		this.complaint = complaint;
	}
	
}

