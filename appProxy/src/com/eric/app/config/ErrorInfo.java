package com.eric.app.config;

public class ErrorInfo {

	public ErrorInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public ErrorInfo(int errno, String msg) {
		// TODO Auto-generated constructor stub
		this.setErrNO(errno);
		this.setMsg(msg);
	}
	
	public int getErrNO() {
		return ErrNO;
	}
	public void setErrNO(int errNO) {
		ErrNO = errNO;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	private int ErrNO;
	private String msg;

}
