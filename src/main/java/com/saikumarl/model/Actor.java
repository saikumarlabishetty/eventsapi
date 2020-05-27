package com.saikumarl.model;

public class Actor {
	private Integer id;
	private String login;
	private String displayLogin;
	private String gravataId;
	private String url;
	private String avatarUrl;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getDisplayLogin() {
		return displayLogin;
	}
	public void setDisplayLogin(String displayLogin) {
		this.displayLogin = displayLogin;
	}
	public String getGravataId() {
		return gravataId;
	}
	public void setGravataId(String gravataId) {
		this.gravataId = gravataId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

}
