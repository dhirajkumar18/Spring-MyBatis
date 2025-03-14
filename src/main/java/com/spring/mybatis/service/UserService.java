package com.spring.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mybatis.entity.User;
import com.spring.mybatis.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User findById(int id) {
		return userMapper.findById(id);
	}

	 public List<User> findAll() {
	        return userMapper.findAll();
	    }

	    public void save(User user) {
	        if (user.getId() == 0) {
	            userMapper.insert(user);
	        } else {
	            userMapper.update(user);
	        }
	    }

	    public void delete(int id) {
	        userMapper.delete(id);
	    }
	
	   public void updateUser(User user) {
		   userMapper.update(user);
	   }
}
