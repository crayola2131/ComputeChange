import java.util.Scanner;
public class ComputeChange {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		//receive amount 
		System.out.println("Enter your cash amount: ");
		double amount = input.nextDouble();
		System.out.println("You entered: " + amount);
		
		//convert amount to pennies so 2,397 pennies
		int remainingAmount = (int)(amount*100);
		
		//find the number of dollars so 23 dollars
		int singles = remainingAmount/100;
		
		//find the remainder of .97 takes the left over .97 cents and declares it as avariable 
		int change = remainingAmount%100;
		
		//find the number of quarters
		int quarters = change/25;
		change = change %25;
		
		//find the number of dimes
		int dimes = change/10;
		change = change%10;
		
		//find the number of nickels
		int nickels = change/5;
		change = change%5;
		
		//find pennies 
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
