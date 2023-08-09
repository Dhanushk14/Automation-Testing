package Assignment4.Employee;

public class Employee {

	public void getEmployeeInfo(int id) {
		System.err.println("Employee Id: "+id);
	}
	public void getEmployeeInfo(String name) {
		System.err.println("Employee Name: "+name);
	}
	public void getEmployeeInfo(String email,long phone) {
		System.err.println("Employee Email: "+email+" Phone No: "+phone);
	}
	public static void main(String[] args) {
		Employee empDetails=new Employee();
		empDetails.getEmployeeInfo(1324);
		empDetails.getEmployeeInfo("Messi");
		empDetails.getEmployeeInfo("messi@gmail.com", 9585739237L);
	}
	
}
