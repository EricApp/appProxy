package com.eric.app.action;


import java.util.HashMap;
import java.util.Map;

public class ActionVersion extends ActionAppValidate{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8181543444659263710L;
	
	public ActionVersion() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		if(checkSign()&&checkLogin()){
			// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
			Map<String, Object> dataResult = new HashMap<String, Object>();
			dataResult.clear();
			dataResult.put("user", "eric.wei");
			
			this.retV.setV(dataResult);
		}
		// 返回结果
		return SUCCESS;
//		return super.execute();
	}

}