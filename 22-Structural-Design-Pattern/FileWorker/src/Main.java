import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter file or folder path: %n");
		String path = scanner.nextLine();
		FileCalculator fileCalculator = new FileCalculatorAdapter();
		Client client = new Client(fileCalculator);
		client.printFileSize(path);
		
	}
}
