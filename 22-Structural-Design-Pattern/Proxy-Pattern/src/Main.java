public class Main {
	public static void main(String[] args) {
		MathCalculatorProxy proxy = new MathCalculatorProxy();
		double result = proxy.add(1, 2);
		System.out.printf("1 + 2 = %.2f%n", result);
		result = proxy.add(2, Double.MAX_VALUE);
		System.out.printf("2 + %f = %f", Double.MAX_VALUE, result);
	}
}
