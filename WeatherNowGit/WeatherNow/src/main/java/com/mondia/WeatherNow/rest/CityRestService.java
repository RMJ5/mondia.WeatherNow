package com.mondia.WeatherNow.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.mondia.WeatherNow.DAO.CityService;
import com.mondia.WeatherNow.model.City;

@Path("/city")
public class CityRestService{
	@Inject CityService cityService;
	
	@Produces( {"application/json"} )
	@GET
	public List<City> getAllCities(){
		return cityService.findAll();
	}
}

//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
//import com.mondia.WeatherNow.model.City;
//
//@WebService(serviceName = "CityServices", targetNamespace = "com.mondia.WeatherNow.rest")
//@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
//@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
//public interface CityService {
// 
//   @GET
//   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//   @Produces({ MediaType.APPLICATION_JSON })
//   @Path("/City/{id}")
//   public City getCity(@PathParam("id") String id);
// 
//   @POST
//   @Consumes(MediaType.APPLICATION_JSON)
//   @Produces({ MediaType.APPLICATION_JSON })
//   @Path("/City")
//   public City saveCity(City City);
// 
//}

