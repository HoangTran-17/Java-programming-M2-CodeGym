package FirstTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SimpleCalculatorTest {
	@Test
	@DisplayName("Testing add 0 + 0")
	public void add0and0() {
		int first = 0;
		int second = 0;
		int expected = 0;
		
		int result = SimpleCalculate.add(first, second);
		assertEquals(expected, result);
	}
	
	@Test
	@DisplayName("Testing sub 17 + 6")
	public void sub17and6() {
		int first = 17;
		int second = 6;
		int expected = 11;
		
		int result = SimpleCalculate.sub(first, second);
		assertEquals(expected, result);
	}
	
	
}

