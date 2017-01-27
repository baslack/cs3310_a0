package a0;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTimerTest {

	@Test
	public void testSearchTimer() {
		//instance and array to test with and set
		//it to testing data
		RandomArray test = new RandomArray();
		test.__testArray();
		
		//check single arg
		SearchTimer timer = new SearchTimer(100, 4.5f, test::binarySearch_iter);
		boolean bMean = timer.getMean() > 0;
		boolean bStddev = timer.getStddev() > 0;
		
		//check double arg
		SearchTimer timer2 = new SearchTimer(100, 4.5f, 7.5f, test::rangeQuery);
		boolean bMean2 = timer2.getMean() > 0;
		boolean bStddev2 = timer2.getStddev() > 0;
		
		//if they all work, green light
		assertTrue(bMean&&bStddev&&bMean2&&bStddev2);
	}
}
