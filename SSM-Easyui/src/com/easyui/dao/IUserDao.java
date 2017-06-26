package com.easyui.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.easyui.beans.Page;
import com.easyui.beans.User;

public interface IUserDao {

	@Select("select * from tb_user where id=#{id}")
	User selectUserById(int id);

	@Select("select * from tb_user limit #{start},#{rows}")
	List<User> limitUsers(Page page);

	@Select("select count(*) from tb_user")
	int selectCount();

	@Insert("insert into tb_user( firstname,lastname,phone,email) values(#{firstname},#{lastname},#{phone},#{email})")
	int insertUser(User user);

	@Update("update tb_user set firstname=#{firstname},lastname=#{lastname},phone=#{phone},email=#{email} where id=#{id}")
	int updateUser(User user);

	@Delete("delete from tb_user where id=#{id}")
	int deleteUser(int id);

}
