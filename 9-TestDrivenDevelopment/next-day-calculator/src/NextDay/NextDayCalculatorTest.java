package NextDay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
	@Test
	@DisplayName("Next day of 28Feb2020")
	public void NextDayOf28Feb2020() {
		String date = "28Feb2020";
		String expected = "29Feb2020";
		String result = NextDayCalculator.CalculatorNextDay(date);
		System.out.println(result);
		assertEquals(result, expected);
	}
	@Test
	@DisplayName("Next day of 29Feb2020")
	public void NextDayOf29Feb2020() {
		String date = "29Feb2020";
		String expected = "01Mar2020";
		String result = NextDayCalculator.CalculatorNextDay(date);
		System.out.println(result);
		assertEquals(result, expected);
	}
	@Test
	@DisplayName("Next day of 28Feb2021")
	public void NextDayOf28Feb2021() {
		String date = "28Feb2021";
		String expected = "01Mar2021";
		String result = NextDayCalculator.CalculatorNextDay(date);
		System.out.println(result);
		assertEquals(result, expected);
	}
	@Test
	@DisplayName("Next day of 28Mar2020")
	public void NextDayOf28Mar2020() {
		String date = "28Mar2020";
		String expected = "29Mar2020";
		String result = NextDayCalculator.CalculatorNextDay(date);
		System.out.println(result);
		assertEquals(result, expected);
	}
	@Test
	@DisplayName("Next day of 31Mar2020")
	public void NextDayOf31Mar2020() {
		String date = "31Mar2020";
		String expected = "01Apr2020";
		String result = NextDayCalculator.CalculatorNextDay(date);
		System.out.println(result);
		assertEquals(result, expected);
	}
	
	@Test
	@DisplayName("Next day of 31Dec2020")
	public void NextDayOf31Dec2020() {
		String date = "31Dec2020";
		String expected = "01Jan2021";
		String result = NextDayCalculator.CalculatorNextDay(date);
		System.out.println(result);
		assertEquals(result, expected);
	}
	
	@Test
	@DisplayName("Next day of 30Oct2020")
	public void NextDayOf30Oct2020() {
		String date = "30Sep2020";
		String expected = "01Oct2020";
		String result = NextDayCalculator.CalculatorNextDay(date);
		System.out.println(result);
		assertEquals(result, expected);
	}
	
}
