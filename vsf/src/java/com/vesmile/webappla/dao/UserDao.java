package com.vesmile.webappla.dao;

import java.util.List;

import com.vesmile.framework.dao.BaseDao;
import com.vesmile.webappla.dao.mybatis.client.UserMapper;
import com.vesmile.webappla.dao.mybatis.example.UserExample;
import com.vesmile.webappla.model.User;

public class UserDao extends BaseDao {
	public User getUserByNo(String no){
		UserExample ue = new UserExample();
		ue.createCriteria().andNoEqualTo(no);
		List<User> activeUsers = getMapper(UserMapper.class)
				.selectByExample(ue);
		return activeUsers.size()>0?activeUsers.get(0):new User();
	}
	
	
}
