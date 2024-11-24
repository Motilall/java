// Write a program in java to find the factorial of a given number.

import java.util.Scanner;
class p2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int fact = 1;

		for(int i = 1; i <= num; i++){
			fact = fact * i;
		}
		System.out.println("factorial of the given interger " + num + " is: " + fact);
	}
}
