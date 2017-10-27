package it.dstech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.model.User;
import it.dstech.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository dao;

	@Override
	public User saveUser(User user) {
		return dao.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return dao.findByUsername(username);
	}

}
