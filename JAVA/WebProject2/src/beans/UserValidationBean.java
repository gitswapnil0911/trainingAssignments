package beans;

import repository.UserRepository;

public class UserValidationBean {
public static boolean isValid(UserCredentials credentials) {
	boolean success=false;
	User user = UserRepository.getUserByCredentials(credentials);
	if(user != null)
		success=true;
	return success;
}
}
