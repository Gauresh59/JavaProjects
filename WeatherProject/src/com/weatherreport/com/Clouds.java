package com.weatherreport.com;

import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

public class Clouds implements Serializable
{
    private int all;
    private final static long serialVersionUID = -957646754392222800L;

	public Clouds(JSONObject cloudsJsonObject) throws JSONException {
		if (cloudsJsonObject.has(Constants.Clouds.ALL))
			all = cloudsJsonObject.getInt(Constants.Clouds.ALL);
	}

	public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

}
