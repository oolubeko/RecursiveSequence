/*Write a method called writeSequence that accepts an integer n as a parameter and prints
 * to the console a symmetric sequence of n numbers composed of descending integers that 
 * ends in 1, followed by a sequence of ascending integers that begin in 1. Notice that 
 * when n is odd the sequence has a single 1 in the middle, whereas for even values it 
 * has two 1's in the middle. Your method should throw an IllegalArgumentException if it
 * is passed a value less than one
 * 
 *  
 * The following table indicates the output that should be produced for various values of n
 * 
 * Method call									Output Produced
 * 
 * -------------------------------------------------------------
 * 
 * writeSequence(1);							1
 * writeSequence(2);							1 1
 * writeSequence(3);							2 1 2
 * writeSequence(4);							2 1 1 2
 * writeSequence(5);							3 2 1 2 3
 * writeSequence(6);							3 2 1 1 2 3
 * writeSequence(7);							4 3 2 1 2 3 4
 * writeSequence(8);							4 3 2 1 1 2 3 4
 * writeSequence(9);							5 4 3 2 1 2 3 4 5
 * writeSequence(10);							5 4 3 2 1 1 2 3 4 5
 *  
 */
public class WriteSequences {
	
	public static int[] writeSequence(int n) {
		if(n < 1) {
			throw new IllegalArgumentException("Value " + n + " less than 1");
		}
		
		int[] pyramidArray = new int[n];
		if(n == 1) {
			pyramidArray[0] = 1;
			System.out.print(n + " ");
			System.out.println();
			return pyramidArray;
		}
		
		else if(n % 2 == 0) {				//case for when n is even
			writeEvenReverse(n / 2, pyramidArray, 0);
			writeEvenForward(n / 2, pyramidArray, n - 1);
		}
		
		else {
			writeOddReverse((n + 1) / 2, pyramidArray, 0);
			writeOddForward((n + 1) / 2, pyramidArray, n - 1);
		}
		
		for(int i = 0; i < pyramidArray.length; i++) {
			System.out.print(pyramidArray[i] + " ");
		}
		
		System.out.println();
		return pyramidArray;
	}

	//Recursive method that writes the sequence forward given an odd integer n
	private static void writeOddForward(int n, int[] list, int index) {
		// Base case
		
		if(n < 2) {
			return;
		}
		
		//Recursive case
		else {
			list[index] = n;
			writeOddForward(n - 1, list, index - 1);
		}
	}

	private static void writeOddReverse(int n, int[] list, int index) {
		//Base case
		if(n == 1) {
			list[index] = n;
		}
		
		//Recursive case
		else {
			list[index] = n;
			writeOddReverse(n - 1, list, index + 1);
		}
	}

	private static void writeEvenForward(int n, int[] list, int index) {
		//Base case
		if(n == 1) {
			list[index] = n;
		}
		
		//Recursive case
		else {
			list[index] = n;
			writeEvenForward(n - 1, list, index - 1);
		}
		
	}

	private static void writeEvenReverse(int n, int[] list, int index) {
		//Base case
		if(n == 1) {
			list[index] = n;
		}
		
		//Recursive case
		else {
			list[index] = n;
			writeEvenReverse(n - 1, list, index + 1);
		}
		
	}
	
	public static void main(String[] args) {
		int n = 1;
		
		while(n < 11) {
			writeSequence(n);
			//System.out.println();
			n += 1;
		}
	}

}
