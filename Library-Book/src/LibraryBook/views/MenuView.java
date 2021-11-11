package LibraryBook.views;

import java.util.Scanner;

public class MenuView {
	private final UserView userView = new UserView();
	
	public void show() {
		int choice;
		Scanner scanner = new Scanner(System.in);
		showWelcome();
		do {
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					userView.showUsers();
					break;
				case 2:
					userView.addUser();
					break;
				case 3:
					userView.updateUser();
					break;
				default:
					throw new IllegalStateException("Unexpected value: " + choice);
			}
			System.out.print("nhan y de tiep tuc:");
			String character = scanner.next();
			if (character.equalsIgnoreCase("y"))
				showWelcome();
		} while (choice != 0);
	}
	
	public void showWelcome() {
		System.out.println("-----------------Welcome to Library Book C0821G1--------------------");
		System.out.println("1. Danh sach nguoi dung:");
		System.out.println("2. Them nguoi dung:");
		System.out.println("3. Sua thong nguoi dung:");
		System.out.println("0. Thoat chuong trinh:");
		System.out.println("--------------------------------------------------------------------");
		System.out.print("Chon chuc nang:");
	}
}
