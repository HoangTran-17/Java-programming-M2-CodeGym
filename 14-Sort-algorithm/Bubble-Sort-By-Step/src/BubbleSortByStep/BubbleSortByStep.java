package BubbleSortByStep;

import java.util.Scanner;

public class BubbleSortByStep {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter list size:");
		int size = scanner.nextInt();
		
		int[] list = new int[size];
		System.out.printf("Enter %d values: %n",size);
		
		for (int i = 0; i < list.length; i++) {
			list[i] = scanner.nextInt();
		}
		
		System.out.print("Your input list: ");
		for (int j : list) {
			System.out.printf("\t%d", j);
		}
		
		System.out.printf("%nBegin sort processing...%n%n");
		bubbleSortByStep(list);
	}
	
	public static void bubbleSortByStep(int[] list) {
		boolean needNextPass;
		for (int k = 1; k < list.length; k++) {
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {
				if (list[i] > list[i + 1]) {
					System.out.printf("Swap %d with %d.%n",list[i],list[i + 1]);
					int temp  = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					
					needNextPass = true;
				}
			}
			if (!needNextPass) {
				System.out.printf("%nArray may be sorted and next pass not needed%n");
				break;
			}
			System.out.printf("List after the %d' sort: %n",k);
			for (int i : list) {
				System.out.printf("%d\t", i);
			}
			System.out.printf("%n%n");
		}
	}
	
	
}
