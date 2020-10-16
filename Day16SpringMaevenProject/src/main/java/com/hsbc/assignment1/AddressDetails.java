package com.hsbc.assignment1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AddressDetails {

	@Value("18/339")
	String houseNumber;

	@Value("IndiraNagar")
	String areaName;

	@Value("Lucknow")
	String cityName;

	@Value("UP")
	String stateName;

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "AddressDetails [houseNumber=" + houseNumber + ", areaName=" + areaName + ", cityName=" + cityName
				+ ", stateName=" + stateName + "]";
	}

}