package bean;

import java.util.Date;

public class PatientBean {
	int patientID;
	String patientName;
	int sex;
	Date birthday;
	String address;
	String phoneNumber;
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public PatientBean(int patientID, String patientName, int sex, Date birthday, String address,
			String phoneNumber) {
		super();
		this.patientID = patientID;
		this.patientName = patientName;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public PatientBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
