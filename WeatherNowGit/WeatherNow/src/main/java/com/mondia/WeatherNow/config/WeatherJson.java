package com.mondia.WeatherNow.config;

public class WeatherJson {
	public static class coord {
		private double lon, lat;
		public double getLon(){ return lon;}
		public double getLat(){ return lat;}
		public void setLon(double l){ lon = l;}
		public void setLat(double l){ lat = l;}
	}
	
	
}
