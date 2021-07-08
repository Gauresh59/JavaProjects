package com.weatherreport.com;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import org.apache.log4j.Logger;

public class WeatherreportAPP {
	private static final Logger log = Logger.getLogger(WeatherreportAPP.class.getName());

	public static void main(String[] args) {
		getJson();
	}

	public static void getJson() {
		String query_url = "https://samples.openweathermap.org/data/2.5/box/city?bbox=12,32,15,37,10&appid=b6907d289e10d714a6e88b30761fae22";

		try {
			URL url = new URL(query_url);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(10000);
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			// read the response
			InputStream in = new BufferedInputStream(conn.getInputStream());
			String result = IOUtils.toString(in, "UTF-8");

			JSONObject myResponse = new JSONObject(result);
			WeatherMap weatherMap = null;
			if (!myResponse.toString().isEmpty()) {
				weatherMap = new WeatherMap(myResponse);
			}
			conn.disconnect();
			in.close();
			if (weatherMap != null) {
				for (City city : weatherMap.getList()) {
					log.info("\nCity-Id: " + city.getId() + "\nTemp: " + city.getMain().getTemp() + "\nTemp-min: "
							+ city.getMain().getTempMax() + "\nTemp-max: " + city.getMain().getTempMax()
							+ "\nPressure: " + city.getMain().getPressure() + "\nSea-level: " + city.getMain()
							+ "\nGround-level: " + city.getMain().getGrndLevel() + "\nHumidity: "
							+ city.getMain().getHumidity());
					for (Weather weather : city.getWeather()) {
						log.info("\nWeather-main: " + weather.getMain() + "\n\n");
					}
				}
			}

		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
}
