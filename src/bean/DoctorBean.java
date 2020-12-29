package bean;

public class DoctorBean {
	int doctorID;
	String doctorName;
	String address;
	String phoneNumber;
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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
	public DoctorBean(int doctorID, String doctorName, String address, String phoneNumber) {
		super();
		this.doctorID = doctorID;
		this.doctorName = doctorName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public DoctorBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
