package LibraryBook.views;

import LibraryBook.model.Role;
import LibraryBook.model.User;
import LibraryBook.model.UserStatus;
import LibraryBook.services.IUserService;
import LibraryBook.services.UserService;
import LibraryBook.utils.DateUtils;

import java.util.List;
import java.util.Scanner;

public class UserView {
	private IUserService userService;
	private Scanner scanner;
	
	public UserView() {
		scanner = new Scanner(System.in);
		userService = new UserService();
	}
	
	public void addUser() {
		System.out.print("So CCCD:");
		long id = scanner.nextLong();
		scanner.nextLine();
		System.out.print("Ho va Ten:");
		String fullName = scanner.nextLine();
		System.out.print("Ngay Sinh:");
		String birthDay = scanner.nextLine();
		System.out.print("So dien thoai:");
		String phoneNumber = scanner.nextLine();
		System.out.print("Dia Chi:");
		String address = scanner.nextLine();
		
		User user = new User(id, fullName, DateUtils.stringToDate(birthDay, "dd-mm-yyyy"), phoneNumber, address);
		user.setRole(Role.USER);
		user.setStatus(UserStatus.AVAILABLE);
		
		try {
			userService.addUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void showUsers() {
		try {
			System.out.println("-----------------DANH SACH NGUOI DUNG--------------------");
			System.out.printf("%-5s %-30s %-30s\n", "CCCD", "Ho Ten", "Sdt");
			List<User> userList = userService.getUsers();
			
			for (User user : userList) {
				System.out.printf("%-5s %-30s %-30s\n", user.getId(), user.getFullName(), user.getPhoneNumber());
				
			}
			System.out.println("--------------------------------------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateUser() {
		System.out.print("So CCCD:");
		long id = scanner.nextLong();
		System.out.print("Ho va Ten:");
		String fullName = scanner.next();
		System.out.print("Ngay Sinh (01-12-2021):");
		String birthDay = scanner.next();
		System.out.print("So dien thoai:");
		String phoneNumber = scanner.next();
		System.out.print("Dia Chi:");
		String address = scanner.next();
		System.out.print("Trang thai (1:Lock; 2:Available)");
		int status = scanner.nextInt();
		
		User user = new User(id, fullName, DateUtils.stringToDate(birthDay, "dd-mm-yyyy"), phoneNumber, address);
		user.setStatus(UserStatus.fromValue(status));
		try {
			userService.updateUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
