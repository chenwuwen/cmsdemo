package com.hmcms.cmsdemo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hmcms.cmsdemo.service.IPositionService;

@Controller
public class PositionController {
	@Resource
	private IPositionService positionService;
	@RequestMapping("/getposition")
	@ResponseBody
	public List getposition(){
		System.out.println("进来方法---------------------");
		List list = positionService.selectAllPosition();
//		System.out.println("返回List对象的值为"+list.size());
		return list;
		
	} 
}
