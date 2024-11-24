// write a program to convert decimal to binary number
/* Program to convert decimal number into binary number.*/

import java.util.Scanner;
class p3{
	public static void main(String args[]){
		System.out.println("Enter a Decimal no. ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println("Binary value of the number is: " + Integer.toBinaryString(num));
	}
} 
