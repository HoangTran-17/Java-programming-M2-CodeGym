import java.util.Scanner;

public class CalculationExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Hãy nhập x: %n");
		int x = scanner.nextInt();
		System.out.printf("Hãy nhập y: %n");
		int y = scanner.nextInt();
		
		CalculationExample calc = new CalculationExample();
		calc.calculate(x, y);
	}
	
	private void calculate(int x, int y) {
		try {
			int a = x + y;
			int b = x - y;
			int c = x * y;
			int d = x / y;
			
			System.out.printf("Tổng x + y = %d%n", a);
			System.out.printf("Hiệu x - y = %d%n", b);
			System.out.printf("Tích x * y = %d%n", c);
			System.out.printf("Thương x / y = %d%n", d);
		} catch (Exception e) {
			System.out.printf("Xảy ra ngoại lệ: %s",e.getMessage());
		}
	}
}
