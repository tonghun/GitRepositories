package com.easyui.service;

import java.util.List;

import com.easyui.beans.Page;
import com.easyui.beans.User;

public interface IUserService {

	User findUser(int id);

	List<User> limitUsers(Page page);

	int findCount();

	int addUser(User user);

	int modifyUser(User user);

	int removeUser(int id);

}
