
public class P12 {

	public static void main(String[] args) {
		int i = 1;
		int t, c;
		do {
			t = getTriangleNumber(i);
			c = getDivisorsCount(t);
			System.out.println(t + ": " + c);
			i++;
		} while (c <= 500);
	}
	
	private static int getTriangleNumber(int n) {
		return n * (n + 1) / 2;
	}
	
	private static int getDivisorsCount(int n) {
		int divisors = 1;
		int i = 2;
		do {
			if (n % i == 0) {
				divisors++;
			}
			i++;
		} while (i < Math.sqrt(n));
		if (n > i) 
			return divisors * 2;
		else
			return divisors;
	}

}
