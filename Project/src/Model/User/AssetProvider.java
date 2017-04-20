package Model.User;

public class AssetProvider extends User {
	
	private String Address;
	private String OName;
	private String ContactNo;
	private String Password;

	public AssetProvider(String userId, String address, String oName,
			String contactNo, String password) throws Exception {
		super(userId);
		Address = address;
		OName = oName;
		if(contactNo.length()!=10)
			throw new Exception();
		ContactNo = contactNo;
		Password = password;
	}

	public String getAddress() {
		return Address;
	}

	public String getOName() {
		return OName;
	}

	public String getContactNo() {
		return ContactNo;
	}

	public String getPassword() {
		return Password;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setOName(String oName) {
		OName = oName;
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
