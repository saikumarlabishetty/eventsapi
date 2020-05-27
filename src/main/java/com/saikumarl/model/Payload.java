package com.saikumarl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Payload {
	private String ref;
	
	@JsonProperty("ref_type")
	private String refType;
	
	@JsonProperty("master_branch")
	private String masterBranch;
	private String description;
	
	@JsonProperty("pusher_type")
	private String pusherType;
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getRefType() {
		return refType;
	}
	public void setRefType(String refType) {
		this.refType = refType;
	}
	public String getMasterBranch() {
		return masterBranch;
	}
	public void setMasterBranch(String masterBranch) {
		this.masterBranch = masterBranch;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPusherType() {
		return pusherType;
	}
	public void setPusherType(String pusherType) {
		this.pusherType = pusherType;
	}

}
