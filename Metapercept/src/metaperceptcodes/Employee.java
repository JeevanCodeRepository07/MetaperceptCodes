package metaperceptcodes;

public class Employee {
	private String fname;
	private String lname;
	private int id;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public Employee(String fname, String lname, int id) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", id=" + id + "]";
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
