package a0;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomArrayTest {

	@Test(expected=IllegalArgumentException.class)
	public void testRandomArrayBadParam() {
		RandomArray test = new RandomArray(-1,0);
	}
	
	@Test
	public void testRandomArraySizeMax(){
		RandomArray test = new RandomArray(255,10.0f);
		boolean bSize = test.getSize() == 255;
		boolean bMax = test.getMax() == 10.0f;
		boolean bArLength = test.getAr().length == test.getSize();
		assertTrue(bSize&&bArLength&&bMax);
	}
	
	
	@Test
	public void testBinarySearch_iter() {
		RandomArray test = new RandomArray();
		test.__testArray();
		boolean bFound = test.binarySearch_iter(3.0f) == 2;
		boolean bNotFound = test.binarySearch_iter(11.0f) == -1;
		assertTrue(bFound&&bNotFound);
	}

	@Test
	public void testBinarySearch_recu() {
		RandomArray test = new RandomArray();
		test.__testArray();
		boolean bFound = test.binarySearch_recu(3.0f) == 2;
		boolean bNotFound = test.binarySearch_recu(11.0f) == -1;
		assertTrue(bFound&&bNotFound);
	}

	@Test
	public void testTernarySearch_iter() {
		RandomArray test = new RandomArray();
		test.__testArray();
		boolean bFound = test.ternarySearch_iter(3.0f) == 2;
		boolean bNotFound = test.ternarySearch_iter(11.0f) == -1;
		assertTrue(bFound&&bNotFound);
	}

	@Test
	public void testTernarySearch_recu() {
		RandomArray test = new RandomArray();
		test.__testArray();
		boolean bFound = test.ternarySearch_recu(3.0f) == 2;
		boolean bNotFound = test.ternarySearch_recu(11.0f) == -1;
		assertTrue(bFound&&bNotFound);
	}

	@Test
	public void testQuaternarySearch_iter() {
		RandomArray test = new RandomArray();
		test.__testArray();
		boolean bFound = test.quaternarySearch_iter(3.0f) == 2;
		boolean bNotFound = test.quaternarySearch_iter(11.0f) == -1;
		assertTrue(bFound&&bNotFound);
	}

	@Test
	public void testQuaternarySearch_recu() {
		RandomArray test = new RandomArray();
		test.__testArray();
		boolean bFound = test.quaternarySearch_recu(3.0f) == 2;
		boolean bNotFound = test.quaternarySearch_recu(11.0f) == -1;
		assertTrue(bFound&&bNotFound);
	}

	@Test
	public void testRangeQuery() {
		RandomArray test = new RandomArray();
		test.__testArray();
		assertEquals(test.rangeQuery(2.5f, 5.5f), 3);
	}

	@Test
	public void testSetSize() {
		RandomArray test = new RandomArray();
		test.__testArray();
		test.setSize(255);
		boolean bSize = test.getSize() == 255;
		boolean bResized = test.getAr().length == test.getSize();
		assertTrue(bSize&&bResized);
	}

	@Test
	public void testSetMax() {
		RandomArray test = new RandomArray();
		test.__testArray();
		test.setMax(25.4f);
		boolean bMax = test.getMax() == 25.4f;
		boolean bRemaxed = true;
		for(float x : test.getAr()){
			bRemaxed &= x <= test.getMax();
		}
		assertTrue(bMax&&bRemaxed);
	}

}
