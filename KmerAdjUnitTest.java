import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Siddhartha Das
 *
 */
public class KmerAdjUnitTest {
	KmerAdjacency kmerAdjTest = new KmerAdjacency(); 
	@Test
	public void test() {
		String[] kmers= {"GAGG","CAGG","GGGG","GGGA","CAGG","AGGG","GGAG"};
		HashMap<String,ArrayList> testResult = new HashMap<String,ArrayList>();
		ArrayList<String> gga = new ArrayList<String>();
		ArrayList<String> agg = new ArrayList<String>();
		ArrayList<String> ggg = new ArrayList<String>();
		ArrayList<String> cag = new ArrayList<String>();
		ArrayList<String> gag = new ArrayList<String>();
		gga.add("GAG");
		agg.add("GGG");
		ggg.add("GGG");
		ggg.add("GGA");
		cag.add("AGG");
		cag.add("AGG");
		gag.add("AGG");
		testResult.put("GGA", gga);
		testResult.put("AGG", agg);
		testResult.put("CAG", cag);
		testResult.put("GGG", ggg);
		testResult.put("GAG", gag);
		kmerAdjTest.setKmerList(kmers);
		HashMap<String,ArrayList> assertedResult = new HashMap<String,ArrayList>();
		assertedResult = kmerAdjTest.returnAdjacencyList();
		assertEquals(testResult,assertedResult);
	}

}
