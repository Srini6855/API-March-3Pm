package org.json.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Create_flight_Input_Pojo {
	public String flightName;
	@JsonProperty("Country")
	public String country;
	@JsonProperty("Destinations")
	public String destinations;
	@JsonProperty("URL")
	public String uRL;

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDestinations() {
		return destinations;
	}

	public void setDestinations(String destinations) {
		this.destinations = destinations;
	}

	public String getuRL() {
		return uRL;
	}

	public void setuRL(String uRL) {
		this.uRL = uRL;
	}

}
