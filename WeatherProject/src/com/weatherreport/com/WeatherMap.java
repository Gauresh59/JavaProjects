package com.weatherreport.com;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherMap implements Serializable {

	private String cod;

	private double calctime;

	private int cnt;

	private List<City> cityList = null;
	private final static long serialVersionUID = 4827535986588912995L;

	public WeatherMap(JSONObject weatherMapJsonObject) throws JSONException {
		if (weatherMapJsonObject.has(Constants.WeatherMap.COD))
			cod = weatherMapJsonObject.getString(Constants.WeatherMap.COD);
		if (weatherMapJsonObject.has(Constants.WeatherMap.CALC_TIME))
			calctime = weatherMapJsonObject.getDouble(Constants.WeatherMap.CALC_TIME);
		if (weatherMapJsonObject.has(Constants.WeatherMap.CNT))
			cnt = weatherMapJsonObject.getInt(Constants.WeatherMap.CNT);
		cityList = new ArrayList<>();
		if (weatherMapJsonObject.has(Constants.WeatherMap.LIST)) {
			JSONArray cityListResponse = (JSONArray) weatherMapJsonObject.get(Constants.WeatherMap.LIST);

			for (int i = 0; i < cityListResponse.length(); i++) {
				cityList.add(new City((JSONObject) (cityListResponse.get(i))));
			}
		}
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public double getCalctime() {
		return calctime;
	}

	public void setCalctime(double calctime) {
		this.calctime = calctime;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public java.util.List<City> getList() {
		return cityList;
	}

	public void setList(java.util.List<City> list) {
		this.cityList = list;
	}

}
