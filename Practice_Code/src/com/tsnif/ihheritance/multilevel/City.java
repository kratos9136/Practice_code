package com.tsnif.ihheritance.multilevel;

public class City extends State {
	private String cityName;
	private float area;

	public City() {
		
	}

	public City(String countryName,String capital,String stateName,String language,String cityName, float area) {
		super(countryName,capital,stateName,language);
		this.cityName = cityName;
		this.area = area;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", StateName=" + getStateName()
				+ ", Language=" + getLanguage() + ", CountryName=" + getCountryName() + ", Capital="
				+ getCapital() + "]";
	}

}
