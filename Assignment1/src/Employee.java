
import java.util.Scanner;

public class Employee {									// to create sub class Employee								
	
	final double taxAmount=0.1;
	Scanner sc = new Scanner(System.in);				//answer1.2 predefined classes in the Java class using Scanner objects.
	
	 private String name,shift;
	 private int StaffID;
	 private double salary;
	 
	 
	 Employee(String shift){									//answer1.4 constructor with one-arguments
		 this.shift = shift ;
	 }
	 
	 Employee(String name, int StaffID){						//answer1.4 constructor with two-arguments
		 
		 this.name = name;
		 this.StaffID = StaffID;
	 }
	 
	 Employee(double TotalNetSalary, double taxAmount){			//answer1.4 constructor with two-arguments						
		 
		 Salary();
		 
		 }
	 	 
	public double  Salary() {									// answer1.3 User define class for using this method	
		
		double MonthlySalary,NumberOfDaysWork,NumberOfDayMonth,TotalSalary;
		double TotalNetSalary;
		
		
		System.out.print("Enter Monthly Salary : ");
		MonthlySalary=sc.nextDouble();
		System.out.print("Enter Number Of Days Work: ");
		NumberOfDaysWork=sc.nextDouble();
		System.out.print("Enter Number Of Day Month: ");
		NumberOfDayMonth=sc.nextDouble();
		TotalSalary=(MonthlySalary*NumberOfDaysWork)/NumberOfDayMonth;
		System.out.printf("Your Total Salary: RM %.2f \n",TotalSalary);
		TotalNetSalary = TotalSalary - (TotalSalary* taxAmount);
		System.out.printf("Your TotalNetSalary : RM%.2f ",TotalNetSalary);
		return TotalNetSalary;
				
			}

	 
	 public String getName() {
	        return this.name;
	    }
 
	 public Integer getStaffID() {
	        return this.StaffID;
	    }

	 public double getSalary() {
	        return this.salary;
	    }
	 
	 public double getTaxAmount() {
		 	return this.taxAmount;
	 }

	 public String getShift() {
		 return this.shift;
	 }
}
