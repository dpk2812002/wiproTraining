package assignment1;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char ch;
		do {
			
			System.out.println("Press 1 to Print table of a number.");
			System.out.println("Press 2 to calculate factorial of a number.");
			System.out.println("Press 3 to check prime weather a number is prime or not.");
			System.out.println("Press 4 to Print FIbonacci Series.");
			System.out.println("Press 5 to Exit.");
			System.out.println("Enter your choice: ");
			
			byte choice= scanner.nextByte();
			
			switch(choice) {
				case 1: printTable(); break;
				case 2: calculateFactorial();break;
				case 3: checkPrime();break;
				case 4: printFibonacci();break;
				case 5: break;
				default: System.out.println("Enter valid choice.");
			}
			System.out.println("Back to Menu (Y/N):");
			ch= scanner.next().charAt(0);
			if(ch!='Y'){
				if((ch!='N')) {
					System.out.println("You have entered invalid character please re run the program!");
				}
			}
		}while(ch=='Y');
	}
	
	public static void calculateFactorial() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= scanner.nextInt();
		int pro=1;
		for(int i=n;i>0;i--) {
			pro= pro*i;
		}
		System.out.println("Factorial of "+n+" = "+pro);
	}
	public static void printTable() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= scanner.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d", n, i, (n*i) );
			System.out.println();
		}
	}
	public static void checkPrime() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= scanner.nextInt();
		if(n<2) {
			System.out.println(n+" is not prime");
			return;
		}
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i!=0) {
				count++;
			}
			else {
				break;
			}
		}
		if(count==(n-2)) {
			System.out.println(n+ " is prime");
		}else {
			System.out.println(n+" is not prime");
		}
	}
	public static void printFibonacci() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= scanner.nextInt();
		int a=0, b=1;
		for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            
            int next = a + b;
            a = b;
            b = next;
        }
		System.out.println();
	}

}
/*
********** MENU **********
1. Print Table of a Number
2. Calculate Factorial
3. Check Prime Number
4. Print Fibonacci Series
5. Exit
**************************
*/
