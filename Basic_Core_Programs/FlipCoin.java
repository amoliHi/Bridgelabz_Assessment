package basic_Core_Programs;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times you want to flip the coin.");
		int times = sc.nextInt();
		if(times>0) {
			double head=0;
			double tails=0;
			for(int i=1; i<=times; i++) {
				if(Math.random()>.5) 
					head++;
				else
					tails++;
			}
			double headPercentage= 100*head/times;
			double tailPercentage= 100*tails/times;
			System.out.println("Head Percentage: "+headPercentage);
			System.out.println("Tail Percentage: "+tailPercentage);
		}
	}
}
