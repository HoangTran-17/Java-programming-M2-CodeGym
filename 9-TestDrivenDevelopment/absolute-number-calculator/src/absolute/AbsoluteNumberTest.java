package absolute;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberTest {
	@Test
	@DisplayName("Absolute of 1")
	public void absoluteOf1() {
		int number = 1;
		int expected = 1;
		int result = AbsoluteNumber.absolute(number);
		
		assertEquals(expected, result);
	}
	
	@Test
	@DisplayName("Absolute of 0")
	public void absoluteOf0() {
		int number = 0;
		int expected = 0;
		int result = AbsoluteNumber.absolute(number);
		
		assertEquals(expected, result);
	}
	
	@Test
	@DisplayName("Absolute of -1")
	public void absoluteOfNegative1() {
		int number = -1;
		int expected = 1;
		int result = AbsoluteNumber.absolute(number);
		
		assertEquals(expected, result);
	}
}

