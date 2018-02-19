import by.gsu.asoilab.Employee;
import by.gsu.asoilab.FormatDecimal;

public class Runner {
	
	public static void main(String[] args) {
		
		Employee[] employees = {
				new Employee("Aaa", 5, 5000),
				new Employee("Bbb",6,1000),
				null,
				new Employee("Ddd", 5, 8707),
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
		
		System.out.println(employees[0].getCountOfDays()+employees[1].getCountOfDays()+"\n");
		
		Employee employeeWithMaxEx = new Employee();
		int totalExpenses = 0;
		for(Employee employee: employees) {
			System.out.println(employee);
			if(employee!=null) {
				totalExpenses+=employee.getTransporationExpenses();
				
				if(employeeWithMaxEx.getTransporationExpenses()<employee.getTransporationExpenses()) {
					employeeWithMaxEx = employee;
				}
			}
			
		}
		
	    System.out.println("\nTotal expenses: "+FormatDecimal.convertToForamt(totalExpenses, 100));
	    System.out.print("Employee's name with max.Expenses: "+employeeWithMaxEx.getName());	
		
	}

}
