package basic_Core_Programs;

import java.util.Scanner;

public class PowerOfTwo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter till where you want the power of 2.");
		int n = sc.nextInt();
		int power = 1;
		if(n>0 && n<31) {
			for(int i=1;i<=n;i++) {
				power = power*2;
				System.out.println("2"+"^"+i+"="+power);
			}
			System.out.println("Power is:"+power);
		}
	}
}
