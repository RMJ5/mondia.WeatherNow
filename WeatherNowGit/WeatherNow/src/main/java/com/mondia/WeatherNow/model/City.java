package com.mondia.WeatherNow.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "country", nullable = false)
	private String country;
	@Column(name = "sunset", nullable = false)
	private Timestamp sunset;
	@Column(name = "sunrise", nullable = false)
	private Timestamp sunrise;
	@Column(name = "lat", nullable = false)
	private Double lat;
	@Column(name = "long", nullable = false)
	private Double lon;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Timestamp getSunset() {
		return sunset;
	}
	public void setSunset(Timestamp sunset) {
		this.sunset = sunset;
	}
	public Timestamp getSunrise() {
		return sunrise;
	}
	public void setSunrise(Timestamp sunrise) {
		this.sunrise = sunrise;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	
	public void update(Timestamp sunset, Timestamp sunrise){
		this.sunset = sunset;
		this.sunrise = sunrise;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ToStringBuilder.reflectionToString(this);
	}
	
	
}
