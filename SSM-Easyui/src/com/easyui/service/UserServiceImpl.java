package com.easyui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.easyui.beans.Page;
import com.easyui.beans.User;
import com.easyui.dao.IUserDao;

@Service("service")
public class UserServiceImpl implements IUserService {

	// @Resource(name = "IUserDao")
	@Autowired
	IUserDao dao;

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = true)
	@Override
	public User findUser(int id) {
		// TODO Auto-generated method stub
		return dao.selectUserById(id);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = true)
	@Override
	public List<User> limitUsers(Page page) {
		// TODO Auto-generated method stub
		return dao.limitUsers(page);
	}

	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		return dao.selectCount();
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return dao.insertUser(user);
	}

	@Override
	public int modifyUser(User user) {
		// TODO Auto-generated method stub
		return dao.updateUser(user);
	}

	@Override
	public int removeUser(int id) {
		// TODO Auto-generated method stub
		return dao.deleteUser(id);
	}

}
