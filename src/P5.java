
public class P5 {

	public static final int MAX = 20;
	
	//Smallest multiple
	public static void main(String[] args) {
		long product = 1;
		for (int i = 2; i <= MAX; i++) {
			long gcd = GCD(product, i);
			product = product * i / gcd;
		}
		System.out.println(product);
	}
	
	public static long GCD(long a, long b) {
		   if (b == 0) return a;
		   return GCD(b, a % b);
	}
}
