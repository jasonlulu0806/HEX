package com.lwm.springcloud.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.lwm.springcloud.dao.*;
import com.lwm.springcloud.entities.*;
import com.lwm.springcloud.service.*;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	UserMapper userMapper;
	
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insert(user);
	}

	@Override
	public User getUser(int accountNum) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(accountNum);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(user);
	}

}
