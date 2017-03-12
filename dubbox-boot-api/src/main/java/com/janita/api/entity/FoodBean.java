package com.janita.api.entity;

import java.io.Serializable;

public class FoodBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private	String riceName;
	private	String produceAddress;
	private	String remark;
	public String getRiceName() {
		return riceName;
	}
	public void setRiceName(String riceName) {
		this.riceName = riceName;
	}
	public String getProduceAddress() {
		return produceAddress;
	}
	public void setProduceAddress(String produceAddress) {
		this.produceAddress = produceAddress;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
