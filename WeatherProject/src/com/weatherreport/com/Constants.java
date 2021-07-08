package com.weatherreport.com;
public class Constants {

	public static final String ID = "id";
	public static final String MAIN = "main";

	public static final class WeatherMap {
		public static final String COD = "cod";
		public static final String CALC_TIME = "calctime";
		public static final String CNT = "cnt";
		public static final String LIST = "list";
	}

	public static final class City {
		public static final String NAME = "name";
		public static final String COORD = "coord";
		public static final String DT = "dt";
		public static final String WIND = "wind";
		public static final String RAIN = "rain";
		public static final String CLOUDS = "clouds";
		public static final String WEATHER = "weather";
	}

	public static final class Weather {
		public static final String DESCRIPTION = "description";
		public static final String ICON = "icon";
	}

	public static final class Clouds {
		public static final String ALL = "all";
	}

	public static final class Coord {
		public static final String LON = "lon";
		public static final String LAT = "lat";
	}

	public static final class Main {
		public static final String TEMP = "temp";
		public static final String TEMP_MIN = "temp_min";
		public static final String TEMP_MAX = "temp_max";
		public static final String PRESSURE = "pressure";
		public static final String SEA_LEVEL = "sea_level";
		public static final String GROUND_LEVEL = "grnd_level";
		public static final String HUMIDITY = "humidity";
	}
	
	public static final class Rain {
		public static final String _3H = "3h";
	}
	
	public static final class Wind {
		public static final String SPEED = "speed";
		public static final String DEG = "deg";
		public static final String VAR_BEG = "var_bag";
		public static final String VAR_END = "var_end";
	}
}
