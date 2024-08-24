package com.utility.persist.model;

import jakarta.persistence.*;

@Entity
@Table(name="DETAILS")
public class Details {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="DEPT_ID")
	private Long id;
	@Column(name="DEPT_NAME")
	private String dept_name;
	@Column(name="USER_ID")
	private Long user_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Details(Long id, String dept_name, Long user_id) {
		super();
		this.id = id;
		this.dept_name = dept_name;
		this.user_id = user_id;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
