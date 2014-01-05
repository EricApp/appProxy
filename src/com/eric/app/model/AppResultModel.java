/**
 * 
 */
package com.eric.app.model;

import java.util.HashMap;
import java.util.Map;

import com.eric.app.config.ErrorInfo;


/**
 * @author shituanwei
 *
 */
public class AppResultModel {
	
	private int errno;


	public int getErrno() {
		return errno;
	}

	public void setErrno(int errno) {
		this.errno = errno;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	public void setErr(ErrorInfo ei){
		this.errno = ei.getErrNO();
		this.msg = ei.getMsg();
	}

	String msg;
	
	Object v;

	public Object getV() {
		return v;
	}

	public void setV(Object v) {
		this.v = v;
	}

	/**
	 * 
	 */
	public AppResultModel() {
		// TODO Auto-generated constructor stub
		v = new HashMap<String, Object>();
	}

}
