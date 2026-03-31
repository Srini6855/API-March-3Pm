package org.api.baseclass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Baseclass {

	RequestSpecification req;

	public void addHeader(String key, String value) {
		req = RestAssured.given().header(key, value);
	}

	public void addBody(String body) {
		req = req.body(body);
	}

	public void addBody(Object body) {
		req = req.body(body);
	}

	public Response addRequest(String requestType, String endpoint) {

		Response response = null;
		switch (requestType) {
		case "GET":
			response = req.get(endpoint);

			break;
		case "POST":
			response = req.post(endpoint);

			break;
		case "PUT":
			response = req.put(endpoint);

			break;
		case "PATCH":
			response = req.patch(endpoint);

			break;
		case "DELETE":
			response = req.delete(endpoint);

			break;

		default:
			break;
		}

		return response;
	}

	public void printStatuCode(Response response) {
		System.out.println(response.getStatusCode());
	}

	public void printResponseAsPrettyString(Response response) {
		System.out.println(response.asPrettyString());
	}

}
