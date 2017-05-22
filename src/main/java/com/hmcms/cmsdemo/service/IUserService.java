package com.hmcms.cmsdemo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hmcms.cmsdemo.model.User;
public interface IUserService {
	public Map loginService(String name,String pwd);

	public List selectAll();

	public int addUser(User user);

	public Integer delUser(Integer id);

	public int udpUser(User user);

    List zxService();
}
