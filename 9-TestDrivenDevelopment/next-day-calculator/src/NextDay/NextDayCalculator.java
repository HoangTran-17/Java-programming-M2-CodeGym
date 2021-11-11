package NextDay;

public class NextDayCalculator {
	public static String CalculatorNextDay(String date) {
		String dayMonth = date.substring(0, 5);
		int year = Integer.parseInt(date.substring(5));

//		TH1: The last day of the month(except Feb & Dec).
		switch (dayMonth) {
			case "31Jan":
				return "01Feb" + year;
			case "29Feb":
				return "01Mar" + year;
			case "31Mar":
				return "01Apr" + year;
			case "30Apr":
				return "01May" + year;
			case "31May":
				return "01Jun" + year;
			case "30Jun":
				return "01July" + year;
			case "31Jul":
				return "01Aug" + year;
			case "31Aug":
				return "01Sep" + year;
			case "30Sep":
				return "01Oct" + year;
			case "31Oct":
				return "01Nov" + year;
			case "30Nov":
				return "01Dec" + year;
		}

//		TH2: The last day of February.
		if (dayMonth.equals("28Feb")) if (isPrimeYear(year)) {
			return "29Feb" + year;
		} else return "01Mar" + year;


//		TH3: The last day of year.
		if (dayMonth.equals("31Dec")) {
			year++;
			date = "01Jan" + year;
			return date;
		} else {
//			Th4: Normal day.
			int day = Integer.parseInt(dayMonth.substring(0, 2)) + 1;
			String month = dayMonth.substring(2);
			date = day + month + year;
		}
		return date;
	}
	
	public static boolean isPrimeYear(int year) {
		if (year % 4 == 0) if (year % 100 == 0) return year % 400 == 0;
		else return true;
		return false;
	}
}

