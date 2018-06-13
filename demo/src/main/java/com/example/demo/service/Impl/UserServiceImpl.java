package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dal.mapper.HaijunTblEmployeeMapper;
import com.example.demo.dal.model.HaijunTblEmployee;
import com.example.demo.dal.model.HaijunTblEmployeeExample;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private HaijunTblEmployeeMapper HaijunTblEmployeeMapper;
	
	@Override
	public String getInfo(String userName, String passWord) {
		// TODO Auto-generated method stub
		HaijunTblEmployee haijunTblEmployee = new HaijunTblEmployee();
		haijunTblEmployee.setUsername(userName);
		haijunTblEmployee.setPassword(passWord);
		int selectCount = HaijunTblEmployeeMapper.selectCount(haijunTblEmployee);
		if (selectCount == 1){
			return "success";
		}
		return "fail";
	}

}
