import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
	public Integer[] createRandom(){
		Random rd = new Random();
		Integer[] arr = new Integer[100];
		System.out.printf("Danh sách phần tử của mảng: %n");
		for (int i = 0; i < 100; i++) {
			arr[i] = rd.nextInt(100);
			System.out.printf(i%10 == 9? "%d%n" : "%d\t",arr[i]);
//			System.out.print(i%10 == 0? "%n" : "\t");
		}
		return arr;
	}
	
	public static void main(String[] args) {
		ArrayExample arrayExample = new ArrayExample();
		Integer[] arr = arrayExample.createRandom();
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%nVui lòng nhập chỉ số của 1 phần tử bất kỳ: ");
		int x = scanner.nextInt();
		
		try {
			System.out.printf("Giá trị của phần tử có chỉ số %d là %d.%n", x, arr[x]);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.print("Chỉ số vượt quá giới hạn của mảng!");
		}
	}
}
