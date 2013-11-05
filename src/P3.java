
public class P3 {

	//Largest prime factor
	public static void main(String[] args) {
		long n = 600851475143L;
		int i = 2;
		while (i < (int) Math.sqrt((double)n)) {
			if (n % i == 0) {
				n /= i;
				System.out.println(i);
			}
			i++;
		}
		System.out.println(n);
	}

}
