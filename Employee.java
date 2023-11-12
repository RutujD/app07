package app07;

public class Employee {
	void employeeDetails() {
        System.out.println("社員クラスのメソッド…");
    }
}
	class Manager extends Employee implements Management {
	   
	    @Override
	    public void manage() {
	        System.out.println("Managerクラスのメソッド….");
}

	    public static void main(String[] args) {
	        
	        Manager manager = new Manager();

	        manager.employeeDetails(); 
	        manager.manage();  
	    }
	
	}
	