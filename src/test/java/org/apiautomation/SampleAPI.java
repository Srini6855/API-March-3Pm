package org.apiautomation;

import org.json.pojo.CreateFlight_Output_pojo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleAPI {

	public static void main(String[] args) {

		RequestSpecification req;

		req = RestAssured.given().header("Content-Type", "application/json");

		req = req.body("{\r\n" + "    \"flightName\": \"AirIndia\",\r\n" + "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": 67,\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + "}");
		Response res = req.post("https://www.omrbranch.com/api/flights");

		int statusCode = res.getStatusCode();

		System.out.println(statusCode);

		String asString = res.asString();

		System.out.println(asString);

		String asPrettyString = res.asPrettyString();

		System.out.println(asPrettyString);

		CreateFlight_Output_pojo as = res.as(CreateFlight_Output_pojo.class);

		String message = as.getMessage();

		System.out.println(message);

		String flightName = as.getData().getFlightName();

		System.out.println(flightName);
	}

}
