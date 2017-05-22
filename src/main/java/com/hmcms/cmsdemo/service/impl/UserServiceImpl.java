package com.hmcms.cmsdemo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmcms.cmsdemo.dao.UserMapper;
import com.hmcms.cmsdemo.model.User;
import com.hmcms.cmsdemo.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public Map loginService(String name,String pwd) {
		Map map = new HashMap();
		// TODO Auto-generated method stub
		String s="b";
		List<User> list =userMapper.loginDao(name);
		if(list.size()>0){
			s ="a" ;
		}
		map.put("success",s);
		return map;
	}
	@Override
	public List selectAll() {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list = userMapper.selectAll();
		return list;
	}
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		int zkey = userMapper.insert(user);
		return zkey;
	}
	@Override
	public Integer delUser(Integer id) {
		// TODO Auto-generated method stub
		Integer i = userMapper.deleteByPrimaryKey(id);
		return i;
	}
	@Override
	public int udpUser(User user) {
		// TODO Auto-generated method stub
		Integer i = userMapper.updateByPrimaryKeySelective(user);
		return i;
	}

	@Override
	public List zxService() {
		List list = userMapper.zxDao();
		return list;
	}

}
