import java.util.Scanner;
public class ComputeChange {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		//receive amount 
		System.out.println("Enter your cash amount: ");
		double amount = input.nextDouble();
		System.out.println("You entered: " + amount);
		
		//converts the dollar amount to pennies
		int remainingAmount = (int)(amount*100);
		
		//finds the number of dollars
		int singles = remainingAmount/100;
		
		// takes the left over .97 cents and declares it as a variable change
		int change = remainingAmount%100;
		
		//takes the variable change and finds the number of quarters in change 
		int quarters = change/25;
		change = change %25;
		
		//takes the variable change and finds the number of dimes in change 
		int dimes = change/10;
		change = change%10;
		
		//takes the variable change and finds the number of nickels in change 
		int nickels = change/5;
		change = change%5;
		
		//takes the variable change and finds the number of pennies in change 
		int pennies = change/1;
		change = change%1;
		
		System.out.println("Dollars: " + singles);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes is: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
		
		
		input.close();
		
		
		
		
	}

}
