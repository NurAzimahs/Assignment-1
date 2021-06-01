import java.util.Scanner;
public class Finance {

	Scanner sc = new Scanner(System.in);
	
	private String WorkerOnDuty,gender,position;
	private double Cost,profit;
	 
	 
	Finance(String position){									//answer1.4 constructor with one-arguments
		this.position = position ;
	}
	
	
	 Finance(String WorkerOnDuty, String gender){				//answer1.4 constructor with two-arguments
		 
		 this.WorkerOnDuty = WorkerOnDuty;
		 this.gender = gender;
	 }
	 
	 Finance(){								   					//answer1.4 constructor with no-arguments			
		 
		 }
	 	 
	public double Profit() {									// answer1.3 User define class for using this method	
		
		double TotalCost,bill,facilities,AdvertisingCost,sales,wages,Totalwages;
			
		
		System.out.print("Company Bill Cost : RM ");
		bill = sc.nextDouble();
		System.out.print("Company Facilities Cost : RM ");
		facilities = sc.nextDouble();
		System.out.print("Company Advertising Cost [BillBoard|Facebook Ads] : RM ");
		AdvertisingCost=sc.nextDouble();
		System.out.println("Manager's Salary for 5 Branch : ");
		wages = sc.nextDouble();
		Totalwages = wages*5;
		TotalCost=bill+facilities+AdvertisingCost+Totalwages;
		System.out.println("Total operating cost : RM " + TotalCost);
		System.out.print("Company Sales for a month: RM ");
		sales = sc.nextDouble();
		profit = sales - TotalCost ;
		//ProfitLoss();
		
		if(sales-TotalCost>0){
			System.out.println("Total Profit : RM " + (sales-TotalCost));
        } 
		else if(sales-TotalCost<0){
			System.out.println("Total Loss : RM " + (sales-TotalCost));
        } 
		return profit;
	}

	 
	 public String getWorkerOnDuty() {
	        return this.WorkerOnDuty;
	    }

	 public String getGender() {
	        return this.gender;
	    }

	 public double getCost() {
	        return this.Cost;
	    }
	 

	 public String getPosition() {
		 return this.position;
	 }
}

