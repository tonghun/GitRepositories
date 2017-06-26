package com.easyui.beans;

public class User {
	private Integer id;
	private String firstname;
	private String lastname;
	private String phone;
	private String email;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String firstname, String lastname, String phone, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone
				+ ", email=" + email + "]";
	}

}
