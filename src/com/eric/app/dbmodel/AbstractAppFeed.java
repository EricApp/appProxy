package com.eric.app.dbmodel;

/**
 * AbstractAppFeed entity provides the base persistence definition of the
 * AppFeed entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAppFeed implements java.io.Serializable {

	// Fields

	private Long id;
	private String title;
	private String content;
	private String uid;
	private Long pid;

	// Constructors

	/** default constructor */
	public AbstractAppFeed() {
	}

	/** full constructor */
	public AbstractAppFeed(String title, String content, String uid, Long pid) {
		this.title = title;
		this.content = content;
		this.uid = uid;
		this.pid = pid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

}