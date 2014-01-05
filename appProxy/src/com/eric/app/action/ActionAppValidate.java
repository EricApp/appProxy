package com.eric.app.action;

import com.eric.app.config.ErrorConfig;
import com.eric.app.model.AppResultModel;
import com.opensymphony.xwork2.ActionSupport;
//import org.apache.struts.action.ActionServlet
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

public class ActionAppValidate extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8235176013305320731L;
	AppResultModel retV;
	
//	static Logger logger = LogManager.getLogger(ActionAppValidate.class.getName());

	/**
	 * 全局参数定义区
	 */
	private String bduss;
	private String sign;
	
	
	public String getBduss() {
		return bduss;
	}

	public void setBduss(String bduss) {
		this.bduss = bduss;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}


	/**
	 * @return the retV
	 */
	public AppResultModel getRetV() {
		return retV;
	}

	/**
	 * @param retV
	 *            the retV to set
	 */
	public void setRetV(AppResultModel retV) {
		this.retV = retV;
	}

	/**
	 * 
	 */
	public ActionAppValidate() {
		// TODO Auto-generated constructor stub

		retV = new AppResultModel();
		retV.setErr(ErrorConfig.ERR_SUCCESS);
	}

	public boolean checkSign() {
		//
		if (sign == null || sign.isEmpty()) {
			retV.setErr(ErrorConfig.ERR_URL_INVALID);
			System.out.print("签名错误");
//			logger.debug("签名错误");
			return false;
		}
		return true;
	}

	public boolean checkLogin() {
		if (bduss == null || bduss.isEmpty()) {
			retV.setErr(ErrorConfig.ERR_NO_LOGIN);
//			retV.setMsg("用户未登陆");
			System.out.print("用户未登录");
//			logger.debug("用户未登录");
			return false;
		}
		return true;
	}
}
