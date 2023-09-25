package com.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.domain.Manager;
import com.human.mapper.ManagerMapper;

@Service
public class ManagerServiceImpl implements ManagerService {
	
	@Autowired
	ManagerMapper managerMap;

	@Override
	public List<Manager> getManagerList() throws Exception {
		// TODO Auto-generated method stub
		List<Manager> rst = managerMap.managerList();
		
		return rst;
	}

	@Override
	public Manager getManagerOne(int id) throws Exception {
		// TODO Auto-generated method stub
		Manager rst = managerMap.managerSelect(id);
		return rst;
	}

	// 관리자 정보 등록
	@Override
	public int regManager(Manager manager) throws Exception {
		// TODO Auto-generated method stub
		int rst = managerMap.insertManagerOne(manager);
		return rst;
	}

}
