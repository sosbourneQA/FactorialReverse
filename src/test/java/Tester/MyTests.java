package Tester;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.FactorialReverse;

public class MyTests {
	
	@Test
	public void simpleOutput1() {
		FactorialReverse fr = new FactorialReverse();
		assertEquals("", 5, fr.calculate(120));
	}
	
	@Test
	public void simpleOutput2() {
		FactorialReverse fr = new FactorialReverse();
		assertEquals("", 0, fr.calculate(150));
	}
	
	@Test
	public void challengeOutput1() {
		FactorialReverse fr = new FactorialReverse();
		assertEquals("", 10, fr.calculate(3628800));
	}
	@Test
	public void challengeOutput2() {
		FactorialReverse fr = new FactorialReverse();
		assertEquals("", 12, fr.calculate(479001600));
	}
	@Test
	public void challengeOutput3() {
		FactorialReverse fr = new FactorialReverse();
		assertEquals("", 3, fr.calculate(6));
	}
	@Test
	public void challengeOutput4() {
		FactorialReverse fr = new FactorialReverse();
		assertEquals("", 0, fr.calculate(18));
	}

}
