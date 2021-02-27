package dayfour;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;



public class LineTest {
	
	Line linone = new Line(1, 10, 2, 10);
	Line lintwo = new Line(2, 20, 4, 20);
	
	@Test
	public void getSlopeTest () {
		assertEquals(0, linone.getSlope(), .0001);
	}
	
	@Test
	public void getDistanceTest () {
		assertEquals(2, lintwo.getDistance(), .0001);
	}
	
	@Test
	public void parallelToTest () {
		assertTrue(linone.parallelTo(lintwo));
	}

}
