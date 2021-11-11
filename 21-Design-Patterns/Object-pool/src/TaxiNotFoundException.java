public class TaxiNotFoundException extends RuntimeException {
	public TaxiNotFoundException(String message) {
		System.out.printf("%s%n",message);
	}
}
