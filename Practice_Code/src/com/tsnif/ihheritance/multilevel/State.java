package com.tsnif.ihheritance.multilevel;

public class State extends Country{
	private String stateName;
	private String Language;
	

	public State() {
		
	}


	public State(String countryName,String capital,String stateName, String language) {
		super(countryName,capital);
		this.stateName = stateName;
		this.Language = language;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public String getLanguage() {
		return Language;
	}


	public void setLanguage(String language) {
		Language = language;
	}


	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", Language=" + Language + "]";
	}
	

}
