package basic_Core_Programs;

public class PrimeFactorization {

	public static void main(String[] args) { 
		long n = Long.parseLong(args[0]);
		for (long i=2; i*i<=n; i++) {
			while (n % i == 0) {
				System.out.println("Prime Factor:"+i); 
				n = n / i;
			}
		}
		if (n!=1)
			System.out.println("Prime Factor"+n);
	}
}