/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.jju.order.api.fallback;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.jju.member.entity.User;
import com.jju.order.api.feign.MemberServiceFeigin;
import com.jju.zhoufeng.base.BaseApiService2;
import com.jju.zhoufeng.base.ResponseBase2;


/**
 * 功能说明: <br>
 * 创建作者:每特教育-余胜军<br>
 * 创建时间:2018年9月11日 下午8:53:21<br>
 * 教育机构:每特教育|蚂蚁课堂<br>
 * 版权说明:上海每特教育科技有限公司版权所有<br>
 * 官方网站:www.itmayiedu.com|www.meitedu.com<br>
 * 联系方式:qq644064779<br>
 * 注意:本内容有每特教育学员共同研发,请尊重原创版权
 */
@Component
public class MemberServiceFallback extends BaseApiService2 implements MemberServiceFeigin {

	@Override
	public User getUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBase2 getUserInfo() {
		// TODO Auto-generated method stub
		return setResultError("服务器忙2,请稍后重试!以类方式写服务降级");
	}

}
