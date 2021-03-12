package com.lwm.springcloud.service;
import com.lwm.springcloud.entities.*;
import java.util.List;

public interface VerificationService {
	public void insert(VerificationKey ver);
	public void delete(VerificationKey ver);
	public List<VerificationKey> search(Integer receiveId);
	public void deleteAll(Integer receiveId);
}
