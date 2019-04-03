package com.jju.member.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.jju.member.entity.User;
import com.jju.zhoufeng.base.ResponseBase2;

public interface UserService {
	
	@RequestMapping("/getUser")
	public User getUser(@RequestParam("name") String name);
	
	@RequestMapping("/getUserInfo")
	public ResponseBase2 getUserInfo();
}
