package com.harsh.flightcheckin.integration;

import com.harsh.flightcheckin.integration.dto.Reservation;
import com.harsh.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	public Reservation updateReservation(ReservationUpdateRequest request);
	
}
