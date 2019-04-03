package com.jju.zhoufeng.base;

public class BaseApiService2 {

	public ResponseBase2 setResultError(Integer code, String msg) {
		return setResult(code, msg, null);
	}

	// 返回错误，可以传msg
	public ResponseBase2 setResultError(String msg) {
		return setResult(500, msg, null);
	}

	// 返回成功，可以传data值
	public ResponseBase2 setResultSuccess(Object data) {
		return setResult(200, "处理成功", data);
	}

	// 返回成功，沒有data值
	public ResponseBase2 setResultSuccess() {
		return setResult(200, "处理成功", null);
	}

	// 返回成功，沒有data值
	public ResponseBase2 setResultSuccess(String msg) {
		return setResult(200, msg, null);
	}

	// 通用封装
	public ResponseBase2 setResult(Integer code, String msg, Object data) {
		return new ResponseBase2(code, msg, data);
	}

	public static void main(String[] args) {
    
	}

}
