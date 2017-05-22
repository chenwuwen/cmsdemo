package com.hmcms.cmsdemo.controller;

import com.hmcms.cmsdemo.model.User;
import com.hmcms.cmsdemo.service.IUserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController
@Controller

@EnableAutoConfiguration 
public class UserController    {
	@Resource
		private IUserService userService;
	  @RequestMapping("/test1")
	   public  String test(Map<String,Object> map) {
	  		map.put("name","kanyun");
	        return "test";
	    }  
	      
	    @RequestMapping("/test2/{myName}")
	    @ResponseBody
		public  String json(@PathVariable String myName) {
	        return "Hello "+myName+"!!!";  
	    }

		@RequestMapping("/")
		public String tologin(){
	  		return "login";
		}
		
		@RequestMapping("/login")
		@ResponseBody
		public Map login(String name,String pwd){
			Map result = new HashMap();
			result = userService.loginService(name,pwd);
	  		return result;
		}
		
		@RequestMapping("/index")
		public String index(){
			
	  		return "index";
		}
		
		@RequestMapping("/yglb")
		@ResponseBody
		public List ListYG(){
			List result = new ArrayList();
			result = userService.selectAll();
	  		return result;
		}
		
		@RequestMapping(value="/adduser")
		@ResponseBody
		public String addUser(User user) throws Exception{
//			user.setInductionTime((user.getInductionTime()));
			String zKey = String.valueOf(userService.addUser(user));
	  		return zKey;
		}
		
		@RequestMapping("/deluser")
		@ResponseBody
		public String delUser(Integer id){
			String result = String.valueOf(userService.delUser(id));
			return result;
		}
		
		@RequestMapping("/udpuser")
		@ResponseBody
		public String udpUser(User user){
			String zKey = String.valueOf(userService.udpUser(user));
	  		return zKey;
		}

	@RequestMapping("/zxuser")
	@ResponseBody
	public List zxUser(){
		List list = userService.zxService();
		return list;
	}
		

	  
}
