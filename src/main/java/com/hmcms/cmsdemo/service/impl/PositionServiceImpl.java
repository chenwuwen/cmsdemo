package com.hmcms.cmsdemo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmcms.cmsdemo.dao.PositionMapper;
import com.hmcms.cmsdemo.dao.UserMapper;
import com.hmcms.cmsdemo.model.User;
import com.hmcms.cmsdemo.service.IPositionService;
import com.hmcms.cmsdemo.service.IUserService;
@Service
public class PositionServiceImpl implements IPositionService {
	@Resource
	private PositionMapper positionMapper;

	@Override
	public List selectAllPosition() {
		List list = positionMapper.selectAll();
		System.out.println("Service方法:"+list.size());
		return list;
	}


}
