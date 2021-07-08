package com.weatherreport.com;
import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

public class Wind implements Serializable {

	private double speed;

	private int deg;

	private int varBeg;

	private int varEnd;
	private final static long serialVersionUID = -1018503160678730800L;

	public Wind(JSONObject windJsonObject) throws JSONException {
		if (windJsonObject.has(Constants.Wind.SPEED))
			speed = windJsonObject.getDouble(Constants.Wind.SPEED);
		if (windJsonObject.has(Constants.Wind.DEG))
			deg = windJsonObject.getInt(Constants.Wind.DEG);
		if (windJsonObject.has(Constants.Wind.VAR_BEG))
			varBeg = windJsonObject.getInt(Constants.Wind.VAR_BEG);
		if (windJsonObject.has(Constants.Wind.VAR_END))
			varEnd = windJsonObject.getInt(Constants.Wind.VAR_END);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getDeg() {
		return deg;
	}

	public void setDeg(int deg) {
		this.deg = deg;
	}

	public int getVarBeg() {
		return varBeg;
	}

	public void setVarBeg(int varBeg) {
		this.varBeg = varBeg;
	}

	public int getVarEnd() {
		return varEnd;
	}

	public void setVarEnd(int varEnd) {
		this.varEnd = varEnd;
	}

}
