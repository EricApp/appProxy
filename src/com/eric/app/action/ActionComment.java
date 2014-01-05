package com.eric.app.action;

import com.eric.app.config.ErrorConfig;
import com.eric.app.dbmodel.AppFeed;
import com.eric.app.dbmodel.AppFeedDAO;

//import model.AppResultModel;

public class ActionComment extends ActionAppValidate {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2759580888879493479L;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private long id;
	private long pid;
	private String uid;
	private String title;
	private String content;
	
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	public ActionComment() {
		// TODO Auto-generated constructor stub
	}
	
	public String updateComment(){
		try {
			AppFeed af = new AppFeed();
			af.setId(id);
			af.setPid(pid);
			af.setTitle(title);
			af.setContent(content);
//			af.setUid(uid);
			af.setUid(uid);
			AppFeedDAO afd = new AppFeedDAO();
			afd.merge(af);
			retV.setErr(ErrorConfig.ERR_SUCCESS);
			retV.setMsg("更新/新增msg成功，记录条数：" + afd.findAll().size());
		} catch (Exception e) {
			// TODO: handle exception
			retV.setErr(ErrorConfig.ERR_DB);
		}
		return SUCCESS;
	}
	
	
	public String deleteComment(){
		try {
			AppFeed af = new AppFeed();
			af.setId(id);
			AppFeedDAO afd = new AppFeedDAO();
			afd.delete(af);
			retV.setErr(ErrorConfig.ERR_SUCCESS);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			retV.setErr(ErrorConfig.ERR_DB);
		}
		return SUCCESS;
	}
	
	public String getComment(){
		try {
//			long _id = id;
			AppFeedDAO afd = new AppFeedDAO();
			AppFeed af = afd.findById(id);
			retV.setErr(ErrorConfig.ERR_SUCCESS);
			if(af != null) {
				retV.setV(af);
			}
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println(e.toString());
			retV.setErr(ErrorConfig.ERR_DB);
		}
		return SUCCESS;
	}

}
