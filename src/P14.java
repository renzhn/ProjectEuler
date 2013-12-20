
public class P14 {
	//From: http://www.mathblog.dk/project-euler-14/
	
	public static void main(String[] args) {
		final int number = 1000000;
		 
		int sequenceLength = 0;
		int startingNumber = 0;
		long sequence;
		 
		int[] cache = new int[number + 1];
		//Initialise cache
		for (int i = 0; i < cache.length; i++) {
		    cache[i] = -1;
		}
		cache[1] = 1;
		 
		for (int i = 2; i <= number; i++) {
		    sequence = i;
		    int k = 0;
		    while (sequence != 1 && sequence >= i) {
		        k++;
		        if ((sequence % 2) == 0) {
		            sequence = sequence / 2;
		        } else {
		            sequence = sequence * 3 + 1;
		        }
		    }
		    //Store result in cache
		    cache[i] = k + cache[(int) sequence];
		 
		    //Check if sequence is the best solution
		    if (cache[i] > sequenceLength) {
		        sequenceLength = cache[i];
		        startingNumber = i;
		    }
		}
		System.out.println("The starting number " + startingNumber + " produces a sequence of " + sequenceLength + ".");
	}
	
}
