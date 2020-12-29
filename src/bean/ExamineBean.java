package bean;

import java.util.Date;

public class ExamineBean {
	int patientID;
	int doctorID;
	Date examineDate;
	String result;
	String treatments;
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public Date getExamineDate() {
		return examineDate;
	}
	public void setExamineDate(Date examineDate) {
		this.examineDate = examineDate;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getTreatments() {
		return treatments;
	}
	public void setTreatments(String treatments) {
		this.treatments = treatments;
	}
	public ExamineBean(int patientID, int doctorID, Date examineDate, String result, String treatments) {
		super();
		this.patientID = patientID;
		this.doctorID = doctorID;
		this.examineDate = examineDate;
		this.result = result;
		this.treatments = treatments;
	}
	public ExamineBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
