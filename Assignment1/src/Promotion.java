import java.util.Scanner;
public class Promotion {					// to create sub class Promotion

	Scanner sc = new Scanner(System.in);	//answer1.2 predefined classes in the Java class using Scanner objects.
	
	private int offer;
	
	Promotion(){							//answer1.4 constructor with no-arguments
		
	}
	
	void printPromotion() {					// answer1.3 User define class for using this method
		
		System.out.println("********** HOLIDAY PROMOTION **********");
		System.out.println();
		
		System.out.println("You Will Get 50% off ");
		System.out.println();
		System.out.print("Do you want to accept the offer [1 : YES | 2: NO ] ?? : ");
		this.offer = sc.nextInt();
		
		switch (offer) {
		
		case 1:
			System.out.println("Congratulation !! You Accept the promotion.");
			System.out.println("Please use this code for 50% off ");
			System.out.println("** CODE : 9854 **");
			break;
		case 2: 
			System.out.println("You are Reject the Promotion :'( ");
			break;
		}
	}

}
