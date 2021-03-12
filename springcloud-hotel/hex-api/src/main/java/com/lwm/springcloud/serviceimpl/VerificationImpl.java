package com.lwm.springcloud.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lwm.springcloud.dao.*;
import com.lwm.springcloud.entities.*;
import com.lwm.springcloud.service.*;
@Service("verifcationService")
public class VerificationImpl implements VerificationService {
	@Resource
	VerificationMapper verificationMapper;
	
	@Override
	public void insert(VerificationKey ver) {
		// TODO Auto-generated method stub
		verificationMapper.insert(ver);
	}

	@Override
	public void delete(VerificationKey ver) {
		// TODO Auto-generated method stub
		verificationMapper.deleteByPrimaryKey(ver);
	}

	@Override
	public List<VerificationKey> search(Integer receiveId) {
		// TODO Auto-generated method stub
		VerificationExample example =new VerificationExample();
		VerificationExample.Criteria cri=example.createCriteria();
		cri.andReceiveidEqualTo(receiveId);
		return verificationMapper.selectByExample(example);
	}

	@Override
	public void deleteAll(Integer receiveId) {
		// TODO Auto-generated method stub
		VerificationExample example =new VerificationExample();
		VerificationExample.Criteria cri=example.createCriteria();
		cri.andReceiveidEqualTo(receiveId);
		verificationMapper.deleteByExample(example);
	}

}
