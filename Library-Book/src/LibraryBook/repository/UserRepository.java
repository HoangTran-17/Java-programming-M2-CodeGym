package LibraryBook.repository;

import LibraryBook.model.Role;
import LibraryBook.model.User;
import LibraryBook.model.UserStatus;
import LibraryBook.utils.CsvUtils;
import LibraryBook.utils.DateUtils;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
	private final String USER_PATH = "data\\users.csv";
	
	public UserRepository() {
	}
	
	@Override
	public User getById(long id) {
		for (User user : getUsers()) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}
	
	@Override
	public List<User> getUsers() {
		List<User> newUserList = new ArrayList<>();
		List<String> records = CsvUtils.read(USER_PATH);
		for (String record : records) {
			newUserList.add(new User(record));
		}
		return newUserList;
	}
	
	@Override
	public boolean exist(long id) {
		return getById(id) != null;
	}
	
	@Override
	public void add(User newUser) {
		List<User> users = getUsers();
		users.add(newUser);
		CsvUtils.write(USER_PATH, users);
	}
	
	@Override
	public void update(User user) {
		User oldUser = getById(user.getId());
		User.transferFields(oldUser, user);
	}
	
	public static void main(String[] args) {
		UserRepository userRepository = new UserRepository();
		userRepository.add(new User(System.currentTimeMillis() / 1000,
				"CU Tran",
				UserStatus.AVAILABLE,
				Role.USER,
				DateUtils.stringToDate("12-10-2021"),
				"0987654321",
				"Ha Tinh"));
		
		List<User> list = userRepository.getUsers();
		System.out.println(list);
	}
}
