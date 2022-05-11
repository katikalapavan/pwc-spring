package inherit;

public class admin extends Employee{

	
private String domain;

public admin(int empID, String empName, String domain) {
	super(empID, empName);
	this.domain = domain;
}
public String toString() {
	return "admin [id = "+empID + " domain = " + domain+ " empName= " +empName+"]";
}

	}


