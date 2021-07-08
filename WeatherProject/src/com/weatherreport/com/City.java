package com.weatherreport.com;

import java.io.Serializable;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class City implements Serializable {

	private int id;

	private String name;

	private Coord coord;

	private Main main;

	private int dt;

	private Wind wind;

	private Rain rain;

	private Clouds clouds;

	private java.util.List<Weather> weather = null;
	private final static long serialVersionUID = -1743392230864052791L;

	public City(JSONObject city) throws JSONException {
		if (city.has(Constants.ID))
			id = city.getInt(Constants.ID);
		if (city.has(Constants.City.NAME))
			name = city.getString(Constants.City.NAME);
		if (city.has(Constants.City.DT))
			dt = city.getInt(Constants.City.DT);
		if (city.has(Constants.City.COORD))
			coord = new Coord((JSONObject) (city.get(Constants.City.COORD)));
		if (city.has(Constants.MAIN))
			main = new Main((JSONObject) (city.get(Constants.MAIN)));
		if (city.has(Constants.City.WIND))
			wind = new Wind((JSONObject) (city.get(Constants.City.WIND)));
		if (city.has(Constants.City.RAIN))
			rain = new Rain((JSONObject) (city.get(Constants.City.RAIN)));
		if (city.has(Constants.City.CLOUDS))
			clouds = new Clouds((JSONObject) (city.get(Constants.City.CLOUDS)));
		if (city.has(Constants.City.CLOUDS)) {
			JSONArray weatherList = city.getJSONArray(Constants.City.WEATHER);
			weather = new ArrayList<>();

			for (int i = 0; i < weatherList.length(); i++) {
				weather.add(new Weather((JSONObject) (weatherList.get(i))));
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public int getDt() {
		return dt;
	}

	public void setDt(int dt) {
		this.dt = dt;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Rain getRain() {
		return rain;
	}

	public void setRain(Rain rain) {
		this.rain = rain;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public java.util.List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(java.util.List<Weather> weather) {
		this.weather = weather;
	}

}
