package encapsulation;

public class Employeesalary {
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Invalid salary");
	        }
	    }
	  public double getSalary() {
	        return salary;
	    }
	  public static void main(String[] args) {
	        Employeesalary e = new Employeesalary();

	        e.setName("Ravi");
	        e.setSalary(30000);

	        System.out.println("Name: " + e.getName());
	        System.out.println("Salary: " + e.getSalary());

	        e.setSalary(-5000);
	        System.out.println("Salary: " + e.getSalary());
	    }

}
