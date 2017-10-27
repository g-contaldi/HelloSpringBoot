package it.dstech.services;

import it.dstech.model.User;

public interface UserService {

	User saveUser(User user);

	User findByUsername(String username);

}
