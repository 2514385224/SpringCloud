package com.jju.order.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jju.member.entity.User;
import com.jju.order.api.feign.MemberServiceFeigin;
import com.jju.order.service.OrderService;
import com.jju.zhoufeng.base.BaseApiService2;
import com.jju.zhoufeng.base.ResponseBase2;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@RestController
public class OrderServiceImpl extends BaseApiService2 implements OrderService{
	// 订单服务继承会员服务接口，用来实现feign客户端 减少重复接口代码
	@Autowired
	private MemberServiceFeigin memberServiceFeigin;
	@Override
	@RequestMapping("/orderToMember")
	public String orderToMember(String name) {
		// TODO Auto-generated method stub
		User user = memberServiceFeigin.getUser(name);
		return user == null ? "没有找到用户信息" : user.toString();
	}

	@Override
	// 没有解决服务雪崩效应
	@RequestMapping("/orderToMemberUserInfo")
	public ResponseBase2 orderToMemberUserInfo() {
		// TODO Auto-generated method stub
		return memberServiceFeigin.getUserInfo();
	}

	@Override
	// 订单服务接口
	@RequestMapping("/orderInfo")
	public ResponseBase2 orderInfo() {
		// TODO Auto-generated method stub
		System.out.println("orderInfo:" + "线程池名称:" + Thread.currentThread().getName());
		return setResultSuccess();
	}
	@HystrixCommand(fallbackMethod = "orderToMemberUserInfoHystrixFallback")
	@RequestMapping("/orderToMemberUserInfoHystrix")
	public ResponseBase2 orderToMemberUserInfoHystrix() {
		System.out.println("orderToMemberUserInfoHystrix:" + "线程池名称:" + Thread.currentThread().getName());
		return memberServiceFeigin.getUserInfo();
	}

	public ResponseBase2 orderToMemberUserInfoHystrixFallback() {
		return setResultSuccess("返回一个友好的提示：服务降级,服务器忙，请稍后重试!");
	}

}
