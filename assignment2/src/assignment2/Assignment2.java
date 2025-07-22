package assignment2;

import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		char ch;
		Assignment2 obj= new Assignment2();
		do {
			
			System.out.println("Press 1 to Count number of vowels and consonants.");
			System.out.println("Press 2 to Check if the string is a palindrome");
			System.out.println("Press 3 to reverse String.");
			System.out.println("Press 4 to Convert the string to uppercase and lowercase");
			System.out.println("Press 5 to Replace a word in the string");
			System.out.println("Press 6 to Exit.");
			System.out.println("Enter your choice: ");
			
			byte choice= scanner.nextByte();
			scanner.nextLine();
			
			switch(choice) {
				case (byte)1: 
					System.out.println("Enter a String");
					String str= scanner.nextLine();
					System.out.println("No of Vowels= "+ str +" = "+obj.countVowels(str));
					System.out.println("No of Consonants= "+ str +" = "+obj.countConsonants(str));
					break;
				case (byte)2: 
					System.out.println("Enter a String");
					str= scanner.nextLine();
					System.out.println(str+" is palindrome: "+ obj.isPalindrome(str)); ;
					break;
					
				case (byte)3: 
					System.out.println("Enter a String");
					str= scanner.nextLine();
					System.out.println("Reverse of "+ str+" = "+obj.reverseString(str)); ;
					break;
				case (byte)4: 
					System.out.println("Enter a String");
					str= scanner.nextLine();
					System.out.println("Upper case of "+ str +" = "+obj.convertToUpperCase(str));
					System.out.println("Lowercase of "+ str +" = "+obj.convertToLowerCase(str));
					break;
				case (byte)5: 
					System.out.println("Enter a String : ");
					str= scanner.nextLine();
					System.out.println("Enter the old word that you want to replace.");
					String oldWord= scanner.next();
					String newWord= scanner.next();
					System.out.println(obj.replaceWord(str, oldWord, newWord));
				case (byte)6: break;
				default: System.out.println("Enter valid choice.");
			}
			System.out.println("Back to Menu (Y/N):");
			ch= scanner.next().charAt(0);
			if(ch!= 'Y') {
				if((ch!='N')) {
					System.out.println("You have entered invalid character please re run the program!");
				}
			}
		}while(ch=='Y');


	}
	int countVowels(String str) {
		int noOfVowel=0;
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)=='a') || (str.charAt(i)=='e')|| (str.charAt(i)=='o')|| (str.charAt(i)=='u') ||
					(str.charAt(i)=='A') ||(str.charAt(i)=='E') || (str.charAt(i)=='I')|| (str.charAt(i)=='O') || (str.charAt(i)=='U')) {
				noOfVowel++;
			}
			
		}
		return noOfVowel;
	}
	
	int countConsonants(String str) {
		int noOfConsonants=0;
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)!='a') && (str.charAt(i)!='e') && (str.charAt(i)!='o') && (str.charAt(i)!='u') &&
					(str.charAt(i)!='A') && (str.charAt(i)!='E') && (str.charAt(i)!='I') && (str.charAt(i)!='O') && (str.charAt(i)!='U')) {
				noOfConsonants++;
			}
			noOfConsonants++;
		}
		return noOfConsonants;
	}
	boolean isPalindrome(String str) {
		String strReverse=reverseString(str);
		
		if(str.equalsIgnoreCase(strReverse)) {
			return true;
		}else {
			return false;
		}
	}
	String reverseString(String str) {
		String strReverse="";
		for(int i=str.length()-1; i>=0;i--) {
			strReverse+=str.charAt(i);
		}
		return strReverse;
	}
	String convertToUpperCase(String str) {
		return str.toUpperCase();
	}
	String convertToLowerCase(String str) {
		return str.toLowerCase();
	}
	String replaceWord(String str, String oldWord, String newWord) {
		return str.replace(oldWord, newWord);
	}
	/*
	

	
Convert the string to uppercase and lowercase

	Replace a word in the string

	String toUpperCase(String str)

	String toLowerCase(String str)

	String replaceWord(String str, String oldWord, String newWord)

	 * */

}
