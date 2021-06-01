import java.util.Scanner;

public class CustomerRegistration {							// to create sub class CustomerRegistration
	 Scanner sc = new Scanner(System.in); 					//answer1.2 predefined classes in the Java class using Scanner objects.
	 
	 private String CustName;
	 private int CodePackage;
	 private String IcOrPassport, contactNumber;
	 
	 
	 CustomerRegistration(){								//answer1.4 constructor with no-arguments	
		 
		 System.out.print("Please insert your name : ");
		 this.CustName = sc.nextLine();
		 System.out.print("Please insert your IC or Passport : ");
		 this.IcOrPassport = sc.nextLine();
		 System.out.print("Please insert your Contact Number : ");
		 this.contactNumber = sc.nextLine();
		 
	 }
		 void printCode() {									// answer1.3 User define class for using this method
		 
			 System.out.println("---------- Package Code ----------        ");
			 System.out.println("\tCode 1 : Grand Suite");
			 System.out.println("\tCode 2 : Grand Deluxe");
			 System.out.println("\tCode 3 : Standard Room");
			 System.out.println();
			 
		 System.out.print("Please choose Your Code Package : ");
		 this.CodePackage = sc.nextInt();
		 System.out.println();
			
			switch (CodePackage) {
			
			case 1:
				System.out.println("You are choosing 'Grand Suite'");
				System.out.println("This Package are included : ");
				System.out.println("	Meal for Breakfast, Lunch, Dinner");
				System.out.println("	Free Baucer SPA");
				System.out.println("	Unlimited time for Pool");
				System.out.println("	Unlimited time for Gym\n");
				System.out.println("Total Payment : RM2500.00");
				break;
			case 2: 
				System.out.println("You are choosing 'Grand Deluxe'");
				System.out.println("This Package are included : ");
				System.out.println("	Meal for Breakfast, Lunch, Dinner");
				System.out.println("	Unlimited time for Pool");
				System.out.println("	Unlimited time for Gym\n");
				System.out.println("Total Payment : RM1000.00");
				break;
			case 3: 
				System.out.println("You are choosing 'Standard Room'");
				System.out.println("This Package are included : ");
				System.out.println("	Unlimited time for Pool");
				System.out.println("	Unlimited time for Gym\n");
				System.out.println("Total Payment : RM500.00");
				break;
			}
		 
	 }
	 
	 
	 public String CustName() {
		 return this.CustName;
	 }
	 
	 public Integer CodePackage() {
		 return this.CodePackage;
	 }
	 
	 public String contactNumber() {
		 return this.contactNumber;
	 }
	 
	 public String IcOrPassport() {
		 return this.IcOrPassport;
	 }
}
