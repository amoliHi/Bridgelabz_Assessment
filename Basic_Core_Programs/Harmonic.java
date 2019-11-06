package basic_Core_Programs;

import java.util.Scanner;

public class Harmonic {

	static Double nth_Harmonic(int n) {
		double harmonic=1;
		for(int i =2;i<=n;i++) {
			harmonic += (float)1/i;
		}
		return harmonic;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter what harmonic number do you want.");
		int  n=sc.nextInt();
		double number=nth_Harmonic(n);
		System.out.println(number);
	}
}
