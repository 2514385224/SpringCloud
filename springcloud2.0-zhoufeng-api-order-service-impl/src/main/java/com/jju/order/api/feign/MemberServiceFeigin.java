/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.jju.order.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


import com.jju.member.service.UserService;
import com.jju.order.api.fallback.MemberServiceFallback;

/**
 * 功能说明: <br>
 * 创建作者:每特教育-余胜军<br>
 * 创建时间:2018年9月6日 下午10:15:28<br>
 * 教育机构:每特教育|蚂蚁课堂<br>
 * 版权说明:上海每特教育科技有限公司版权所有<br>
 * 官方网站:www.itmayiedu.com|www.meitedu.com<br>
 * 联系方式:qq644064779<br>
 * 注意:本内容有每特教育学员共同研发,请尊重原创版权
 */
@FeignClient(value = "app-zhoufeng-member", fallback = MemberServiceFallback.class)
public interface MemberServiceFeigin extends UserService {
	// 服务降级 熔断
	// 实体类是存放接口项目还是 存放在实现项目 实体类存放在接口项目里面
	// 实体类和定义接口信息存放在接口项目
	// 代码实现存放在接口实现类里面

}
