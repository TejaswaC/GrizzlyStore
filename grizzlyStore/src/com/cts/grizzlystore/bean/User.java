package com.cts.grizzlystore.bean;

public class User {
private String userId;


 public User()
{}

private String userType;
private String userStatus;

private String contactNo;

private String address;

private String name;

private String designation;

private String id;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public String getUserStatus() {
	return userStatus;
}
public void setUserStatus(String userStatus) {
	this.userStatus = userStatus;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public User(String userId, String userType, String userStatus, String contactNo, String address, String name,
		String designation, String id) {
	super();
	this.userId = userId;
	this.userType = userType;
	this.userStatus = userStatus;
	this.contactNo = contactNo;
	this.address = address;
	this.name = name;
	this.designation = designation;
	this.id = id;
	

}




}
