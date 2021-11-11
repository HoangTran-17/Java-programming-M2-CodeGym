package LibraryBook.services;

import LibraryBook.model.User;
import LibraryBook.repository.IUserRepository;
import LibraryBook.repository.UserRepository;

import java.util.List;

public class UserService implements IUserService{
	private IUserRepository userRepository;
	
	public UserService() {
		userRepository = new UserRepository();
	}
	
	
	@Override
	public User getById(int id) throws Exception {
		User user = userRepository.getById(id);
		if (user != null)
			throw new Exception("Nguoi ton tai nguoi dung");
		return user;
	}
	
	@Override
	public List<User> getUsers() throws Exception {
		return userRepository.getUsers();
	}
	
	@Override
	public void addUser(User newUser) throws Exception {
		if (userRepository.exist(newUser.getId()))
			throw new Exception("Nguoi ton tai nguoi dung");
		userRepository.add(newUser);
	}
	
	@Override
	public void updateUser(User user) throws Exception {
		if (userRepository.exist(user.getId()))
			throw new Exception("Nguoi ton tai nguoi dung");
		userRepository.update(user);
	}
}
