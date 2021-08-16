package BookStore;

public class Member {

	private String fname,lname,uid,password;
	
	public Member(String fname, String lname, String uid, String password) {
		
	super();
	this.fname = fname;
	this.lname = lname;
	this.password = password;
	this.uid = uid;
		
	}
	
	public Member() {
		}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}