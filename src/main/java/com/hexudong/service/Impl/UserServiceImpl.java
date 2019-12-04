package com.hexudong.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexudong.entity.User;
import com.hexudong.mapper.UserMapper;
import com.hexudong.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper mapper;
	
	@Override
	public List<User> getList() {
		return mapper.getList();
	}
	
}
