package testsrc;

import static org.junit.Assert.*;


import org.junit.Test;
import bw_package.BurrowsWheeler;
import junit.framework.Assert;
public class BWUnitTest {
	BurrowsWheeler bwTest = new BurrowsWheeler();
	@Test
	public void testReturnBurrowsWheelerString() {
		String passToBurrowsWheeler = "BANANA";
		String burrowsWheelerTransformed = "ANNB$AA";
		bwTest.setSequence(passToBurrowsWheeler);
		String burrows_wheeler_string = bwTest.returnBurrowsWheelerString();
		assertEquals(burrows_wheeler_string,burrowsWheelerTransformed);
	}

}
