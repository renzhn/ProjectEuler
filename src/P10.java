import java.util.ArrayList;
import java.util.Iterator;


public class P10 {

	public static final int MAX = 2000000;
	private static ArrayList<Integer> primes = new ArrayList<Integer>();
	private static Iterator<Integer> it;
	
	public static void main(String[] args) {
		primes.add(2);
		int i = 3;
		do {
			if (isPrime(i)) primes.add(i);
			i++;
		} while (i < MAX);
		long sum = 0;
		it = primes.iterator();
		while (it.hasNext()) {
			sum += it.next();
		}
		System.out.println(sum);
	}

	private static boolean isPrime(int n) {
		it = primes.iterator();
		int j = it.next();
		while (j <= Math.sqrt((double) n)) {
			if (n % j == 0) return false;
			if (!it.hasNext()) break;
			j = it.next();
		}
		return true;
	}

}
