package oopsAssignment;

public class MathOperations {
	public void printTable(int n){
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * = "+(n*i));
		}
	}
	public int calculateFactorial(int n) {
		int fact=1;
		for(int i=n;i>0;i--) {
			fact*=i;
		}
		return fact;
	}
	
	public boolean checkPrime(int n) {
		if(n<2) {
			return false;
		}
		int i=2;
		for(i=2;i<=(n/2);i++) {
			if(n%i ==0) {
				i++;
			}
		}
		if(i>(n/2)) {
			return true;
		}
		else 
			return false;
	}
	
	public void printFibonacci(int n) {
		 int a = 0, b = 1;
	        System.out.print(a + " ");
	        if (n > 1) System.out.print(b + " ");
	        for (int i = 3; i <= n; i++) {
	            int c = a + b;
	            System.out.print(c + " ");
	            a = b;
	            b = c;
	        }
	        System.out.println();
	}
	
	
}
