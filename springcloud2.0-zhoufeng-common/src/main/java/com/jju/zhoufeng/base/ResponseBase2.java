package com.jju.zhoufeng.base;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

// 服务接口有响应  统一规范响应服务接口信息
@Data
@Slf4j
public class ResponseBase2 {

	private Integer rtnCode;
	private String msg;
	private Object data;

	public ResponseBase2() {

	}

	public ResponseBase2(Integer rtnCode, String msg, Object data) {
		super();
		this.rtnCode = rtnCode;
		this.msg = msg;
		this.data = data;
	}

	public static void main(String[] args) {
		ResponseBase2 responseBase = new ResponseBase2();
		responseBase.setData("123456");
		responseBase.setMsg("success");
		responseBase.setRtnCode(200);
		System.out.println(responseBase.toString());
		log.info("itmayiedu...");
	}

	@Override
	public String toString() {
		return "ResponseBase [rtnCode=" + rtnCode + ", msg=" + msg + ", data=" + data + "]";
	}

}
