package com.taotao.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.taotao.dao.UserMapper;
import com.taotao.model.User;
import com.taotao.service.UserServiceI;

/**
 * @author HuangQinJian 下午1:15:46 2017年3月28日
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	@Autowired
	private UserMapper userMapper;

	public User getUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}
}
