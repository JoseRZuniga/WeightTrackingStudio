package com.wts.njp.model;

import java.math.BigDecimal;

public class WeightTracking {
	
	private String date;
	private BigDecimal weight;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	
}