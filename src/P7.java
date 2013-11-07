import java.util.ArrayList;
import java.util.Iterator;

public class P7 {

	public static final int MAX = 10001;
	private static ArrayList<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		primes.add(2);
		int i = 3;
		do {
			if (isPrime(i)) primes.add(i);
			i++;
		} while (primes.size() < MAX);
		for (int j = 0; j < primes.size(); j++) {
			System.out.println("The " + (j + 1) + "th prime is " + primes.get(j));
		}
	}

	private static boolean isPrime(int n) {
		Iterator<Integer> it = primes.iterator();
		int j = it.next();
		while (j <= Math.sqrt((double) n)) {
			if (n % j == 0) return false;
			if (!it.hasNext()) break;
			j = it.next();
		}
		return true;
	}
}
