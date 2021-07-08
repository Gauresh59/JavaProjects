package com.weatherreport.com;
import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

public class Rain implements Serializable {

	private double _3h;
	private final static long serialVersionUID = -1147390796048676546L;

	public Rain(JSONObject rainJsonObject) throws JSONException {
		if (rainJsonObject.has(Constants.Rain._3H))
			_3h = rainJsonObject.getDouble(Constants.Rain._3H);
	}

	public double get3h() {
		return _3h;
	}

	public void set3h(double _3h) {
		this._3h = _3h;
	}

}
