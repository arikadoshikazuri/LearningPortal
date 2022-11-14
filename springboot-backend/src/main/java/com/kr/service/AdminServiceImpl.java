package com.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kr.Dao.AdminRepository;
import com.kr.model.Admin;

@Service
public class AdminServiceImpl implements AdminService{
@Autowired
AdminRepository adminRepo;

	@Override
	public Admin login(String userid, String password) {
		// TODO Auto-generated method stub
		List<Admin> allUser = this.adminRepo.findAll();
		for(Admin u : allUser) {
			if(u.getUserid().toLowerCase().equals(userid)) {
				if(u.getPassword().equals(password)) {
					return u;
				}
			}
		}
		return null;
	}
	

}
