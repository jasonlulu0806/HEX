package com.lwm.springcloud.service;
import com.lwm.springcloud.entities.*;
import java.util.List;
public interface RelationService {
	List<RelationKey> getFriends(int own);
	int addFriend(int own ,int friend);
}
