package Model.User;

import java.util.Date;

public class Teacher extends User {

	private String FName;
	private String MName;
	private String LName;
	private String Address;
	private Date DOB;
	private String ContactNo;
	private String Password;
	public Teacher(String userId, String fName, String mName, String lName,
			String address, Date dOB, String contactNo, String password) throws Exception {
		super(userId);
		FName = fName;
		MName = mName;
		LName = lName;
		Address = address;
		DOB = dOB;
		if(contactNo.length()!=10)
			throw new Exception();
		ContactNo = contactNo;
		Password = password;
	}
	public String getFName() {
		return FName;
	}
	public String getMName() {
		return MName;
	}
	public String getLName() {
		return LName;
	}
	public String getAddress() {
		return Address;
	}
	public Date getDOB() {
		return DOB;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public String getPassword() {
		return Password;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public void setMName(String mName) {
		MName = mName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setContactNo(String contactNo) throws Exception {
		if(contactNo.length()!=10)
			throw new Exception();
		ContactNo = contactNo;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
