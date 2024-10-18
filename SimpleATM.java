import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount:");

        double balance = scanner.nextDouble(); // Initial balance

        System.out.println("Welcome to the ATM!");

        while (balance > 100) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
	    System.out.println("Enter amount to credit:");
	    double creditAmount = scanner.nextDouble();
            if (withdrawAmount == 0) {
                break; 
            }

            if (withdrawAmount <= balance) { 
                balance -= withdrawAmount; // Deduct the amount from balance balance = balance - withdrawAmount
                System.out.println("Withdrawn: $" + withdrawAmount);
            } else{
                   System.out.println("no balance");
		   }if (creditAmount > 0){
		      balance += creditAmount;
	      	      System.out.println("creditAmount: $" + creditAmount);
			}else {
				System.out.println("invalid"); 
            }
        }

        System.out.println("Thank you for using the ATM. Your final balance is: $" + balance + ",because it is the minimum balance");
        scanner.close();
    }
}
