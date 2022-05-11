package inherit;

public class Manager extends Employee{
	private String ads;

	public Manager(int empID, String empName, String ads) {
		super(empID, empName);
		this.ads = ads;
	}
	public String toString() {
		return "Manager [id = "+empID + "domain = " + ads+ " empName= " +empName+"]";	

}
}
