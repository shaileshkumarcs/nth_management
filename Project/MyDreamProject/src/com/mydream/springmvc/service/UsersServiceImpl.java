package com.mydream.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydream.springmvc.dao.UserDAO;
import com.mydream.springmvc.entity.Users;

@Service
public class UsersServiceImpl implements UsersService {
	
	// need to inject customer dao
	@Autowired
	public UserDAO userDAO;
	

	@Override
	@Transactional
	public List<Users> getUsers() {

		return userDAO.getUser();
	}

}











