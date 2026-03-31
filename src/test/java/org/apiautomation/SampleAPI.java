package org.apiautomation;

import org.api.baseclass.Baseclass;
import org.json.pojo.CreateFlight_Output_pojo;
import org.json.pojo.Create_flight_Input_Pojo;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleAPI extends Baseclass {

	int id;

	@Test
	public void createFlight() {

//		RequestSpecification req;
//
//		req = RestAssured.given().header("Content-Type", "application/json");
//
//		req = req.body("{\r\n" + "    \"flightName\": \"AirIndia\",\r\n" + "    \"Country\": \"India\",\r\n"
//				+ "    \"Destinations\": 67,\r\n"
//				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + "}");
//		Response res = req.post("https://www.omrbranch.com/api/flights");
//
//		int statusCode = res.getStatusCode();
//
//		System.out.println(statusCode);
//
//		String asString = res.asString();
//
//		System.out.println(asString);
//
//		String asPrettyString = res.asPrettyString();
//
//		System.out.println(asPrettyString);
//
//		CreateFlight_Output_pojo as = res.as(CreateFlight_Output_pojo.class);
//
//		String message = as.getMessage();
//
//		Assert.assertEquals(message, "Flight Created Successfully", "Verify the message");
//
//		String flightName = as.getData().getFlightName();
//
//		Assert.assertEquals(flightName, "AirIndia", "Verify the flight name");
//
//		id = as.getData().getId();
//
//		System.out.println("Flight id " + id);

//		addHeader("Content-Type", "application/json");
//
//		addBody("{\r\n" + "    \"flightName\": \"AirIndia\",\r\n" + "    \"Country\": \"India\",\r\n"
//				+ "    \"Destinations\": 67,\r\n"
//				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + "}");
//		Response response = addRequest("POST", "https://www.omrbranch.com/api/flights");
//
//		printStatuCode(response);
//
//		printResponseAsPrettyString(response);

		addHeader("Content-Type", "application/json");

		Create_flight_Input_Pojo create_flight_Input_Pojo = new Create_flight_Input_Pojo("AirIndia", "India", "67",
				"https://en.wikipedia.org/wiki/Air_India");

		addBody(create_flight_Input_Pojo);

		Response response = addRequest("POST", "https://www.omrbranch.com/api/flights");

		printStatuCode(response);

		printResponseAsPrettyString(response);

	}

	@Test(enabled = false)
	public void updateFlight() {

		System.out.println("Flight id " + id);
		RequestSpecification req;

		req = RestAssured.given().header("Content-Type", "application/json");

		req = req.body("{\r\n" + "    \"flightName\": \"AirIndia\",\r\n" + "    \"Country\": \"America\",\r\n"
				+ "    \"Destinations\": 67,\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + "}");
		Response res = req.put("https://www.omrbranch.com/api/flight/" + id);

		int statusCode = res.getStatusCode();

		System.out.println(statusCode);

		String asString = res.asString();

		System.out.println(asString);

		String asPrettyString = res.asPrettyString();

		System.out.println(asPrettyString);
	}

}
