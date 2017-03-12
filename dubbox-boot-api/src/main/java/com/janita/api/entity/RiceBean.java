package com.janita.api.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RiceBean implements Serializable {

	private	String riceName;
	private	String riceMoney;
	private	String remark;
	public String getRiceName() {
		return riceName;
	}
	public void setRiceName(String riceName) {
		this.riceName = riceName;
	}
	public String getRiceMoney() {
		return riceMoney;
	}
	public void setRiceMoney(String riceMoney) {
		this.riceMoney = riceMoney;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
