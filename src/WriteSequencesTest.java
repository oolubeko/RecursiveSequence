import static org.junit.Assert.*;

import org.junit.Test;

public class WriteSequencesTest {

	@Test
	public void testWriteSequence() {
		
		//I will test the base case, an odd case, and an even case.
		
		int i = 1;		//Base case
		int j = 5;		//Odd case
		int k = 10;		//Even case
		
		assertArrayEquals(WriteSequences.writeSequence(i), new int[] {1});
		assertArrayEquals(WriteSequences.writeSequence(j), new int[] {3,2,1,2,3});
		assertArrayEquals(WriteSequences.writeSequence(k), new int[] {5,4,3,2,1,1,2,3,4,5});
		
		
	}

}
