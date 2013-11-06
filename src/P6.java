
public class P6 {

	public static final int MAX = 100;
	
	//Sum square difference
	public static void main(String[] args) {
		long sumOfSquares = 0, squareOfSum = 0;
		for (int i = 1; i <= MAX; i++) {
			squareOfSum += i;
			sumOfSquares += i * i;
		}
		squareOfSum *= squareOfSum;
		System.out.println(squareOfSum - sumOfSquares);
	}

}
