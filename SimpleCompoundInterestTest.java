/**
 * This is JUnit tester for SimpleCompoundInterest class
 */
package SimpleCompoundInterest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Raasi
 *
 */
public class SimpleCompoundInterestTest {

	/**
	 * Test method for {@link SimpleCompoundInterest.SimpleCompoundInterest#simpleInterest()}.
	 */
	@Test
	public void testSimpleInterest() {
		SimpleCompoundInterest sci=new SimpleCompoundInterest(5000,0.05,12);
		assertEquals(30,sci.simpleInterest(),0.001);
	}

	/**
	 * Test method for {@link SimpleCompoundInterest.SimpleCompoundInterest#compoundInterest()}.
	 */
	
	@Test
	public void testCompoundInterest() {
		SimpleCompoundInterest sci=new SimpleCompoundInterest(10000,10.25,5);
		assertEquals(16288.946267774416,sci.compoundInterest(),0.001);
		
	}

}
