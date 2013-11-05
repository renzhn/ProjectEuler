
public class P2 {

	public static void main(String[] args) {
		int a = 1, b = 1, sum = 0, sumOfEven = 2;
		boolean aIsEven = true, bIsEven = true;
		while (true) {
			sum = a + b;
			a = b;
			b = sum;
			if (sum > 4000000) break;
			if ((aIsEven && !bIsEven) || (!aIsEven && bIsEven)) {
				aIsEven = bIsEven;
				bIsEven = true;
				sumOfEven += b;
			} else {
				aIsEven = bIsEven;
				bIsEven = false;
			}
		}
		System.out.println(sumOfEven);
	}

}
