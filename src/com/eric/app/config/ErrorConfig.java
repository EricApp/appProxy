package com.eric.app.config;

public class ErrorConfig {

	public ErrorConfig() {
		// TODO Auto-generated constructor stub
	}

	public static ErrorInfo ERR_SUCCESS 		= new ErrorInfo(0		, 	"success");
	public static ErrorInfo ERR_NO_LOGIN 		= new ErrorInfo(100		, 	"用户没有登陆");
	public static ErrorInfo ERR_URL_INVALID 	= new ErrorInfo(101		, 	"请求非法");
	public static ErrorInfo ERR_DB 	= new ErrorInfo(102		, 	"DB操作失败");
}
