package basic_Core_Programs;

import java.util.Scanner;

public class LeapYear {
	
	static boolean checkYear(int year){
		return((year%4==0 && year%100!=0)||(year%400==0));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits of year.");
		int year = sc.nextInt();
		System.out.println(checkYear(year)?"Is a Leap Year.":"Not a Leap Year.");
	}
}
