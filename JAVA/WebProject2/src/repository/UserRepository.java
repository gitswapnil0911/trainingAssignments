package repository;

import java.util.HashMap;
import java.util.Map;

import beans.User;
import beans.UserCredentials;

public class UserRepository {
	private static Map<UserCredentials, User> users;
	
	static {
		users = new HashMap<>();
		UserCredentials credentials1 = new UserCredentials("Akki123","pheonix123");
		UserCredentials credentials2 = new UserCredentials("Deeps342","kingfisher2");
		UserCredentials credentials3 = new UserCredentials("Rana234","tiger565");
		
		User user1 = new User(credentials1,"Akshay","Kumar","akshay@gmail.com");
		User user2 = new User(credentials1,"Deepika","Padukone","deepika@gmail.com");
		User user3 = new User(credentials1,"Ranbir","Kapoor","ranbir@gmail.com");
		
		users.put(credentials1, user1);
		users.put(credentials2, user2);
		users.put(credentials3, user3);
		
	}
	
	public static User getUserByCredentials(UserCredentials credentials) {
		User user=users.get(credentials);
		return user;
	}

}
