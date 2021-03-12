package com.lwm.springcloud.service;
import com.lwm.springcloud.entities.*;

public interface UserService {
	int addUser(User user);
	User getUser(int accountNum);
	void update(User user);
}
