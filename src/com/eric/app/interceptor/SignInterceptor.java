/**
 * 
 */
package com.eric.app.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author shituanwei
 *
 */
public class SignInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1950020874322692576L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
//		Map<String, Object> paramMap = arg0.getInvocationContext().getParameters();
//		System.out.print("拦截器起作用了，开始输出参数列表：\n");
//		for (Map.Entry<String, Object> iterable_element : paramMap.entrySet()) {
//			System.out.print(iterable_element.getValue()+"\t");
//		}
		//正常传递拦截器
		return arg0.invoke(); 
	}

}
