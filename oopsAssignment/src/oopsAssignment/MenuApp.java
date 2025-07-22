package oopsAssignment;
import java.util.Scanner;
public class MenuApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        MathOperations operations = new MathOperations();
        int choice;

        do {
            System.out.println("\n--- Math Menu ---");
            System.out.println("1. Print Multiplication Table");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int tableNum = scanner.nextInt();
                    operations.printTable(tableNum);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int factNum = scanner.nextInt();
                    System.out.println("Factorial of "+factNum +" = "+ operations.calculateFactorial(factNum));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int primeNum = scanner.nextInt();
                    System.out.println(primeNum+" is a prime: "+ operations.checkPrime(primeNum));;
                    break;
                case 4:
                    System.out.print("Enter number of terms: ");
                    int terms = scanner.nextInt();
                    operations.printFibonacci(terms);
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1-5.");
            }
        } while (choice != 5);

	}

}
