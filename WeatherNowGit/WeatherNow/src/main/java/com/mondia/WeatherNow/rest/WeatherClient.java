package com.mondia.WeatherNow.rest;

public class WeatherClient {

//	WebClient client = WebClient.create(REST_URI);
//	ObjectMapper mapper = new ObjectMapper();
//	try {
//		s = client.get(String.class);
//		JsonNode rootNode = mapper.readTree(s);
//		JsonNode coordNode = rootNode.path("coord");
//		Coordinates coord = mapper.treeToValue(coordNode, Coordinates.class);
//		System.out.println(coord.getLat());
//		System.out.println(coordNode.get("lon").asDouble());
//	} catch (JsonProcessingException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}		
//	System.out.println(s);
////	Response r = client.accept("text/xml").get();
////	System.out.println(r);
////	Client client = ClientBuilder.newBuilder().newClient();
////	WebTarget target = client.target("http://localhost:8080/rs");
////	target = target.path("service").queryParam("a", "avalue");
////	 
////	Invocation.Builder builder = target.request();
////	Response response = builder.get();
//	
////	WebClient xmlAddClient = WebClient.create(REST_URI);		
////	xmlAddClient.path(ADD_PATH).path(a + "/" + b).accept("text/xml");
////	s = xmlAddClient.get(String.class);
////	System.out.println(s);
//	// List<Object> providers = new ArrayList<Object>();
//	// providers.add( new JacksonJaxbJsonProvider() );
//	//
//	// WebClient client =
//	// WebClient.create("http://localhost:8080/poc_restapi_cxf/api",
//	// providers);
//	// client =
//	// client.accept("application/json").type("application/json").path("/order").query("id",
//	// "1");
}
