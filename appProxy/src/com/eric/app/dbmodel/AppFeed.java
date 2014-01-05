package com.eric.app.dbmodel;

/**
 * AppFeed entity. @author MyEclipse Persistence Tools
 */
public class AppFeed extends AbstractAppFeed implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AppFeed() {
	}

	/** full constructor */
	public AppFeed(String title, String content, String uid, Long pid) {
		super(title, content, uid, pid);
	}
}
