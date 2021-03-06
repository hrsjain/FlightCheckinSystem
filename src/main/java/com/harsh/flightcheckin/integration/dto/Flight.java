package com.harsh.flightcheckin.integration.dto;

import java.sql.Timestamp;
import java.util.Date;

//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

//import org.springframework.format.annotation.DateTimeFormat;

public class Flight {

	private Long id;

	private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	// @Temporal(TemporalType.DATE)
	// @DateTimeFormat(pattern="MM/dd/yyyy")
	private Date departureDate;
	private Timestamp estimatedDepartureTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
}
