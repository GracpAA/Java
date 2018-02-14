import by.gsu.asoilab.Employee;

public class Runner {
	
	public static void main(String[] args) {
		
		Employee[] employees = {
				new Employee("Aaa", 5, 5000),
				new Employee("Bbb",6,1000),
				null,
				new Employee("Ddd", 5, 8787),
				new Employee("Fff",6,1444),
				new Employee("Kkk",8,6000),
				new Employee()};
		
		for(Employee employee:employees) {
			
			if(employee==null) {
				System.out.println("Object is null \n");
			}
			else employee.show();
		}
		
		employees[employees.length-1].setTransporationExpenses(100);
		
		System.out.println(employees[employees.length-1].getCountOfDays()+employees[employees.length-2].getCountOfDays()+"\n");
		
		Employee employeeWithMaxEx = null;
		int totalExpenses = 0, maxTransporationEx = 0;
		for(Employee employee: employees) {
			System.out.println(employee);
			if(employee!=null) {
				totalExpenses+=employee.getTransporationExpenses();
				
				if(maxTransporationEx<employee.getTransporationExpenses()) {
					maxTransporationEx = employee.getTransporationExpenses();
					employeeWithMaxEx = employee;
				}
			}
			
		}
		
	    System.out.println("\nTotal expenses: "+totalExpenses);
	    System.out.print("Employee's name with max.Expenses: "+employeeWithMaxEx.getName());
		
		
		
		
		
		
		
	}

}
