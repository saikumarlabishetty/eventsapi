package com.saikumarl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Org {
	private String id;
	private String login;
	
	@JsonProperty("gravatar_id")
	private String gravatarId;
	private String url;
	
	@JsonProperty("avatar_url")
	private String avatarUrl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getGravatarId() {
		return gravatarId;
	}
	public void setGravatarId(String gravatarId) {
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
