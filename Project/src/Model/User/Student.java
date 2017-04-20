package Model.User;

import java.util.Date;

public class Student {

	private String QrganisationId;
	private String StudentId;
	private String FName;
	private String MName;
	private String LName;
	private Date DOB;
	private String BatchId;
	
	public Student(String qrganisationId, String studentId, String fName,
			String mName, String lName, Date dOB, String batchId) {
		super();
		QrganisationId = qrganisationId;
		StudentId = studentId;
		FName = fName;
		MName = mName;
		LName = lName;
		DOB = dOB;
		BatchId = batchId;
	}

	public String getQrganisationId() {
		return QrganisationId;
	}

	public String getStudentId() {
		return StudentId;
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

	public Date getDOB() {
		return DOB;
	}

	public String getBatchId() {
		return BatchId;
	}

	public void setQrganisationId(String qrganisationId) {
		QrganisationId = qrganisationId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
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

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public void setBatchId(String batchId) {
		BatchId = batchId;
	}
	
}
