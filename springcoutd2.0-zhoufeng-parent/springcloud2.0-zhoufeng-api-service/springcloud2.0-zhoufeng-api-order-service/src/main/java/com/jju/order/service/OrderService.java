package com.jju.order.service;

import org.springframework.web.bind.annotation.RequestMapping;
import com.jju.zhoufeng.base.ResponseBase2;

public interface OrderService {
		// 订单服务调用会员服务接口信息 feign
		@RequestMapping("/orderToMember")
		public String orderToMember(String name);
		// 订单服务接口调用会员服务接口
		@RequestMapping("/orderToMemberUserInfo")
		public ResponseBase2 orderToMemberUserInfo();
		// 订单服务接口
		@RequestMapping("/orderInfo")
		public ResponseBase2 orderInfo();
}
