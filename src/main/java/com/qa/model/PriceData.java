package com.qa.model;

public class PriceData {
	
	public PriceData() {};
	
	public PriceData(String priceOption) {
		this.priceOption = priceOption;
	}
	
	private String priceOption;

	public String getPriceOption() {
		return priceOption;
	}

	public void setPriceOption(String priceOption) {
		this.priceOption = priceOption;
	}

}
