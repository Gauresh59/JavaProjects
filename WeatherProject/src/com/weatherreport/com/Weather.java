package com.weatherreport.com;

import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

public class Weather implements Serializable {

	private int id;

	private String main;

	private String description;

	private String icon;
	private final static long serialVersionUID = -2499820893061771279L;

	public Weather(JSONObject weatherJsonObject) throws JSONException {
		if (weatherJsonObject.has(Constants.ID))
			id = weatherJsonObject.getInt(Constants.ID);
		if (weatherJsonObject.has(Constants.MAIN))
			main = weatherJsonObject.getString(Constants.MAIN);
		if (weatherJsonObject.has(Constants.Weather.DESCRIPTION))
			description = weatherJsonObject.getString(Constants.Weather.DESCRIPTION);
		if (weatherJsonObject.has(Constants.Weather.ICON))
			icon = weatherJsonObject.getString(Constants.Weather.ICON);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
