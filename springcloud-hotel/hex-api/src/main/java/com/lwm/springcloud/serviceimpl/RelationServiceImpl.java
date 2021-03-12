package com.lwm.springcloud.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lwm.springcloud.dao.*;
import com.lwm.springcloud.entities.*;
import com.lwm.springcloud.service.*;

@Service("relationService")
public class RelationServiceImpl implements RelationService{
	
	@Resource
	RelationMapper relationMapper;

	@Override
	public List<RelationKey> getFriends(int own) {
		// TODO Auto-generated method stub
		RelationExample example=new RelationExample();
		RelationExample.Criteria criteria =example.createCriteria();
		criteria.andOwnerEqualTo(own);
		return relationMapper.selectByExample(example);
	}

	@Override
	public int addFriend(int own, int friend) {
		// TODO Auto-generated method stub
		RelationKey key=new RelationKey();
		key.setOwner(own);
		key.setFriend(friend);
		return relationMapper.insert(key);
	}

}
