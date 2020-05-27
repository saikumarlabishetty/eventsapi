package com.saikumarl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Actor {
	private Integer id;
	private String login;
	
	@JsonProperty("display_login")
	private String displayLogin;
	
	@JsonProperty("gravatar_id")
	private String gravatarId;
	private String url;
	
	@JsonProperty("avatar_url")
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
		return gravatarId;
	}
	public void setGravataId(String gravatarId) {
		this.gravatarId = gravatarId;
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
