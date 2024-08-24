package com.utility.persist.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long id;
	@Column(name = "USER_NAME")
	private String name;
	@Column(name = "Email")
	private String email;
	@Column(name = "ADDMISSION_ON")
	private Date addmissionOn;
	@Column(name = "ADDMISSION_ON_TIME")
	private Date addmissionOnTime;

	public User() {
		super();
	}

	

	
	
	public User(Long id, String name, String email, Date addmissionOn, Date addmissionOnTime) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.addmissionOn = addmissionOn;
		this.addmissionOnTime = addmissionOnTime;
	}





	public Date getAddmissionOnTime() {
		return addmissionOnTime;
	}





	public void setAddmissionOnTime(Date addmissionOnTime) {
		this.addmissionOnTime = addmissionOnTime;
	}





	public Date getAddmissionOn() {
		return addmissionOn;
	}

	public void setAddmissionOn(Date addmissionOn) {
		this.addmissionOn = addmissionOn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
}
