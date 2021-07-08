package com.weatherreport.com;

import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

public class Coord implements Serializable {

	private double lon;

	private double lat;
	private final static long serialVersionUID = 7991995158641776576L;

	public Coord(JSONObject coordJsonObject) throws JSONException {
		if (coordJsonObject.has(Constants.Coord.LON))
			lon = coordJsonObject.getDouble(Constants.Coord.LON);
		if (coordJsonObject.has(Constants.Coord.LAT))
			lat = coordJsonObject.getDouble(Constants.Coord.LAT);
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

}
