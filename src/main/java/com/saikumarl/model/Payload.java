package com.saikumarl.model;

public class Payload {
	private String ref;
	private String refType;
	private String masterBranch;
	private String description;
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
