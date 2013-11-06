
public class P4 {
	
	public static final int MAX = 999;
	public static int[][] product = new int[MAX + 1][MAX + 1];

	//Largest palindrome product
	public static void main(String[] args) {
		for (int i = MAX; i >= 100; i--) {
			for (int j = MAX; j >= 100; j--) {
				int p = i * j;
				product[i][j] = isPalindrome(p) ? p : 0;
			}
		}
		int a= MAX, b = MAX;
		int max = product[MAX][MAX];
		for (int i = MAX; i >= 100; i--) {
			for (int j = MAX; j >= 100; j--) {
				if (product[i][j] > max){
					a = i;
					b = j;
					max = product[i][j];
				}
			}
		}
		System.out.println("a = " + a + ", b = " + b + ", max = " + max);
	}

	private static boolean isPalindrome(int n) {
		String str = String.valueOf(n);
		int l = str.length();
		for (int i = 0; i < l / 2; i++) {
			if (str.charAt(i) != str.charAt(l - i - 1))
				return false;
		}
		return true;
	}

}
