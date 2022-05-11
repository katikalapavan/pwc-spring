package inherit;

public class employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
admin ad=new admin(101,"paras","IT");


System.out.println(ad);
Manager mg=new Manager(105, "raj", "AWS");
System.out.println(mg);
	}

	@Override
	public String toString() {
		return "employeemain []";
	}

}
