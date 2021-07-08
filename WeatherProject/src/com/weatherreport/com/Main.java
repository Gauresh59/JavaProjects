package com.weatherreport.com;
import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

public class Main implements Serializable {

	private double temp;

	private int tempMin;

	private int tempMax;

	private int pressure;

	private double seaLevel;

	private double grndLevel;

	private int humidity;
	private final static long serialVersionUID = 484264094947708987L;

	public Main(JSONObject mainJsonObject) throws JSONException {
		if (mainJsonObject.has(Constants.Main.TEMP))
			temp = mainJsonObject.getDouble(Constants.Main.TEMP);
		if (mainJsonObject.has(Constants.Main.TEMP_MIN))
			tempMin = mainJsonObject.getInt(Constants.Main.TEMP_MIN);
		if (mainJsonObject.has(Constants.Main.TEMP_MAX))
			tempMax = mainJsonObject.getInt(Constants.Main.TEMP_MAX);
		if (mainJsonObject.has(Constants.Main.PRESSURE))
			pressure = mainJsonObject.getInt(Constants.Main.PRESSURE);
		if (mainJsonObject.has(Constants.Main.SEA_LEVEL))
			seaLevel = mainJsonObject.getDouble(Constants.Main.SEA_LEVEL);
		if (mainJsonObject.has(Constants.Main.GROUND_LEVEL))
			grndLevel = mainJsonObject.getDouble(Constants.Main.GROUND_LEVEL);
		if (mainJsonObject.has(Constants.Main.HUMIDITY))
			humidity = mainJsonObject.getInt(Constants.Main.HUMIDITY);
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public int getTempMin() {
		return tempMin;
	}

	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}

	public int getTempMax() {
		return tempMax;
	}

	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public double getSeaLevel() {
		return seaLevel;
	}

	public void setSeaLevel(double seaLevel) {
		this.seaLevel = seaLevel;
	}

	public double getGrndLevel() {
		return grndLevel;
	}

	public void setGrndLevel(double grndLevel) {
		this.grndLevel = grndLevel;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}
