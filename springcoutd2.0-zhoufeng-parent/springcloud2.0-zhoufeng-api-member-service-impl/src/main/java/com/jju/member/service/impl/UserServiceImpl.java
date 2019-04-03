package com.jju.member.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jju.member.entity.User;
import com.jju.member.service.UserService;
import com.jju.zhoufeng.base.BaseApiService2;
import com.jju.zhoufeng.base.ResponseBase2;
@RestController
public class UserServiceImpl extends BaseApiService2 implements UserService{
	@Value("${server.port}")
	private String serverPort;
	@Override
	@RequestMapping("/getUser")
	public User getUser(String name) {
		// TODO Auto-generated method stub
		User u=new User();
		u.setName(name + "端口号:" + serverPort);
		u.setSex("男");
		return u;
	}
	@Override
	public ResponseBase2 getUserInfo() {
		// TODO Auto-generated method stub
		System.out.println(" 我是会员服务,会员服务调用订单服务开始啦！！");
		try {
			// 会员服务接口产生1.5秒的延迟
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return setResultSuccess("订单服务接口调用会员服务接口成功....");
	}

	

}
